package lt.vtvpmc.ems.pw.ui;

<<<<<<< HEAD
import lt.vtvpmc.ems.pw.entities.Education;
=======
import lt.vtvpmc.ems.pw.entities.Student;
>>>>>>> 1185e82019f8820520119a8a3e6e326901be0227
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class EducationListBean {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Transactional(readOnly = true)
<<<<<<< HEAD
    public List<?> getEducationList() {
        Query query = entityManager.createQuery("select e from Education e");
=======
    public List<?> getStudentList() {
        Query query = entityManager.createQuery("select c from Student c");
>>>>>>> 1185e82019f8820520119a8a3e6e326901be0227
        return query.getResultList();
    }
    
    @Transactional
<<<<<<< HEAD
    public void removeEducation(Education education) {
        entityManager.remove(entityManager.merge(education));
    }
    
   
    
=======
    public void removeStudent(Student student) {
        entityManager.remove(entityManager.merge(student));
    }
    
>>>>>>> 1185e82019f8820520119a8a3e6e326901be0227
}

