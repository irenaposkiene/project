package lt.vtvpmc.ems.pw.ui;

import lt.vtvpmc.ems.pw.entities.Education;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class Education2ListBean {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Transactional(readOnly = true)
    public List<?> getEducationList() {
        Query query = entityManager.createQuery("select i from Education2 i");
        return query.getResultList();
    }
    
    @Transactional
    public void removeEducation(Education education2) {
        entityManager.remove(entityManager.merge(education2));
    }
    
   
    
}

