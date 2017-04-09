package lt.vtvpmc.ems.pw.ui;

import lt.vtvpmc.ems.pw.entities.Papild;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class PapildListBean {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Transactional(readOnly = true)
    public List<?> getPapildList() {
        Query query = entityManager.createQuery("select f from Papild f");
        return query.getResultList();
    }
    
    @Transactional
    public void removePapild(Papild papild) {
        entityManager.remove(entityManager.merge(papild));
    }
    
   
    
}

