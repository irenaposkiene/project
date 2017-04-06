package lt.vtvpmc.ems.pw.ui;

import lt.vtvpmc.ems.pw.entities.Education;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class EducationListBean {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Transactional(readOnly = true)
    public List<?> getEducationList() {
        Query query = entityManager.createQuery("select e from Education e");
        return query.getResultList();
    }
    
    @Transactional
    public void removeEducation(Education education) {
        entityManager.remove(entityManager.merge(education));
    }
    
   
    
}

