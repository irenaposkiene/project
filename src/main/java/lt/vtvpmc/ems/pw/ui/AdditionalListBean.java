package lt.vtvpmc.ems.pw.ui;

import java.util.List;

import javax.faces.application.Application;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ems.pw.entities.Additional;
import lt.vtvpmc.ems.pw.entities.Student;

public class AdditionalListBean {

    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Transactional(readOnly = true)
    public List<?> getAdditionalList() {
        Query query = entityManager.createQuery("select e from Additional e");
        return query.getResultList();
    }
    
    @Transactional
    public void removeAdditional(Additional additional) {
        entityManager.remove(entityManager.merge(additional));
    }
    
}