package lt.vtvpmc.ems.pw.ui;

<<<<<<< HEAD
import lt.vtvpmc.ems.pw.entities.Education;
=======
<<<<<<< HEAD
import lt.vtvpmc.ems.pw.entities.Education;
=======
<<<<<<< HEAD
import lt.vtvpmc.ems.pw.entities.Education;
=======
import lt.vtvpmc.ems.pw.entities.Student;
>>>>>>> 1185e82019f8820520119a8a3e6e326901be0227
>>>>>>> f499e96bd0070e8ecabf84d7f656c41af4e0c09a
>>>>>>> 0a11dcb9064815d1f707d4abde2a258d2d8ead79
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
<<<<<<< HEAD
    public List<?> getEducationList() {
        Query query = entityManager.createQuery("select e from Education e");
=======
<<<<<<< HEAD
    public List<?> getEducationList() {
        Query query = entityManager.createQuery("select e from Education e");
=======
    public List<?> getStudentList() {
        Query query = entityManager.createQuery("select c from Student c");
>>>>>>> 1185e82019f8820520119a8a3e6e326901be0227
>>>>>>> f499e96bd0070e8ecabf84d7f656c41af4e0c09a
>>>>>>> 0a11dcb9064815d1f707d4abde2a258d2d8ead79
        return query.getResultList();
    }
    
    @Transactional
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> f499e96bd0070e8ecabf84d7f656c41af4e0c09a
>>>>>>> 0a11dcb9064815d1f707d4abde2a258d2d8ead79
    public void removeEducation(Education education) {
        entityManager.remove(entityManager.merge(education));
    }
    
   
    
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
    public void removeStudent(Student student) {
        entityManager.remove(entityManager.merge(student));
    }
    
>>>>>>> 1185e82019f8820520119a8a3e6e326901be0227
>>>>>>> f499e96bd0070e8ecabf84d7f656c41af4e0c09a
>>>>>>> 0a11dcb9064815d1f707d4abde2a258d2d8ead79
}

