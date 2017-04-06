
package lt.vtvpmc.ems.pw.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ems.pw.entities.Plan;



public class PlanListBean {

    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Transactional(readOnly = true)
    public List<?> getPlanList() {
        Query query = entityManager.createQuery("select p from Plan p");
        return query.getResultList();
    }
    
    @Transactional
    public void removePlan(Plan plan) {
        entityManager.remove(entityManager.merge(plan));
    }
    
  
    
}