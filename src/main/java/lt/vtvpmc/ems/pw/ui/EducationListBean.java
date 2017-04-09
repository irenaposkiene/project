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
<<<<<<< HEAD
import lt.vtvpmc.ems.pw.entities.Education;
=======
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
>>>>>>> 42c18efbc6930cdc07ffd3061cc55d35468f39ef
>>>>>>> 64521b49a6d5b9d17857d31512a30ef70c710707
>>>>>>> 304b62ab939c2594413a624e1d50b2852d64a2a4
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
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
<<<<<<< HEAD
    public List<?> getEducationList() {
        Query query = entityManager.createQuery("select e from Education e");
=======
    public List<?> getStudentList() {
        Query query = entityManager.createQuery("select c from Student c");
>>>>>>> 1185e82019f8820520119a8a3e6e326901be0227
>>>>>>> f499e96bd0070e8ecabf84d7f656c41af4e0c09a
>>>>>>> 0a11dcb9064815d1f707d4abde2a258d2d8ead79
>>>>>>> 42c18efbc6930cdc07ffd3061cc55d35468f39ef
>>>>>>> 64521b49a6d5b9d17857d31512a30ef70c710707
>>>>>>> 304b62ab939c2594413a624e1d50b2852d64a2a4
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
        return query.getResultList();
    }
    
    @Transactional
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> f499e96bd0070e8ecabf84d7f656c41af4e0c09a
>>>>>>> 0a11dcb9064815d1f707d4abde2a258d2d8ead79
>>>>>>> 42c18efbc6930cdc07ffd3061cc55d35468f39ef
>>>>>>> 64521b49a6d5b9d17857d31512a30ef70c710707
>>>>>>> 304b62ab939c2594413a624e1d50b2852d64a2a4
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
    public void removeEducation(Education education) {
        entityManager.remove(entityManager.merge(education));
    }
    
   
    
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
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
>>>>>>> 42c18efbc6930cdc07ffd3061cc55d35468f39ef
>>>>>>> 64521b49a6d5b9d17857d31512a30ef70c710707
>>>>>>> 304b62ab939c2594413a624e1d50b2852d64a2a4
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
}

