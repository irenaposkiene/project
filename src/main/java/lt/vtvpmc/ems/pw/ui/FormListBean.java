
package lt.vtvpmc.ems.pw.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ems.pw.entities.Form;


public class FormListBean  {

    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Transactional(readOnly = true)
    public List<?> getFormList() {
        Query query = entityManager.createQuery("select p from Form p");
        return query.getResultList();
    }
    
    @Transactional
    public void removeForm(Form form) {
        entityManager.remove(entityManager.merge(form));
    }
    
  
    
}