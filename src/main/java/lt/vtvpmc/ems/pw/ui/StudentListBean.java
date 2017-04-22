
package lt.vtvpmc.ems.pw.ui;

import lt.vtvpmc.ems.pw.entities.Student;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class StudentListBean {
    
    @PersistenceContext
    private EntityManager entityManager;
   
    
    @Transactional
    public List<?> getStudentList() {
    	Query query = entityManager.createQuery("select c from Student c");
        return query.getResultList();
    }
    
    @Transactional
    public void removeStudent(Student student) {
        entityManager.remove(entityManager.merge(student));
    }
    
<<<<<<< HEAD
   
=======
<<<<<<< HEAD
   
=======
    
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
    
}
