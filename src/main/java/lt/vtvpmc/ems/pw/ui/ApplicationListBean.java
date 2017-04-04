package lt.vtvpmc.ems.pw.ui;

import java.util.List;

import javax.faces.application.Application;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

public class ApplicationListBean {

    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Transactional(readOnly = true)
    public List<?> getApplicationList() {
        Query query = entityManager.createQuery("select a from Application a");
        return query.getResultList();
    }
    
    @Transactional
    public void removeApplication(Application application) {
        entityManager.remove(entityManager.merge(application));
    }
    
}