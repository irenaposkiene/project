package lt.vtvpmc.ems.pw.ui;

import java.util.List;

<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
import javax.faces.application.Application;
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ems.pw.entities.Additional;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
import lt.vtvpmc.ems.pw.entities.Student;
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b

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