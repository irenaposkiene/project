package lt.vtvpmc.ems.pw.ui;

<<<<<<< HEAD
import java.util.Date;

=======
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ems.pw.entities.Education;

public class NewEducationBean {
	
   
    @PersistenceContext
    private EntityManager entityManager;
    
      
    private String educationEducation;
  	private String educationSchool;
<<<<<<< HEAD
    private Date educationSchoolEndDate;
    
    private String educationSpecialization;
    private String educationInstitution;
    private String educationInstitutionType;
    private Date educationInstitutionEndDate;
=======
    private String educationSchoolEndDate;
    
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
    /*private String educationSpecialization;
    private String educationInstitution;
    private String educationInstitutionType;
    private String educationInstitutionEndDate;
*/
    @Transactional
    public String save() {
        Education education = new Education (educationEducation, educationSchool, educationSchoolEndDate /*, educationSpecialization, educationInstitution, educationInstitutionType, educationInstitutionEndDate*/);
       entityManager.persist(education);
        return "education";
=======
>>>>>>> f499e96bd0070e8ecabf84d7f656c41af4e0c09a
>>>>>>> 0a11dcb9064815d1f707d4abde2a258d2d8ead79
>>>>>>> 42c18efbc6930cdc07ffd3061cc55d35468f39ef
>>>>>>> 64521b49a6d5b9d17857d31512a30ef70c710707
>>>>>>> 304b62ab939c2594413a624e1d50b2852d64a2a4
    private String educationSpecialization;
    private String educationInstitution;
    private String educationInstitutionType;
    private String educationInstitutionEndDate;
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740

    @Transactional
    public String save() {
        Education education = new Education (educationEducation, educationSchool, educationSchoolEndDate, educationSpecialization, educationInstitution, educationInstitutionType, educationInstitutionEndDate);
       entityManager.persist(education);
<<<<<<< HEAD
        return "education";
=======
<<<<<<< HEAD
        return "education";
=======
<<<<<<< HEAD
        return "education";
=======
<<<<<<< HEAD
        return "education";
=======
<<<<<<< HEAD
        return "education";
=======
<<<<<<< HEAD
        return "education";
=======
        return "main";
>>>>>>> 1185e82019f8820520119a8a3e6e326901be0227
>>>>>>> f499e96bd0070e8ecabf84d7f656c41af4e0c09a
>>>>>>> 0a11dcb9064815d1f707d4abde2a258d2d8ead79
>>>>>>> 42c18efbc6930cdc07ffd3061cc55d35468f39ef
>>>>>>> 64521b49a6d5b9d17857d31512a30ef70c710707
>>>>>>> 304b62ab939c2594413a624e1d50b2852d64a2a4
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
    }

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public String getEducationEducation() {
		return educationEducation;
	}

	public void setEducationEducation(String educationEducation) {
		this.educationEducation = educationEducation;
	}

	public String getEducationSchool() {
		return educationSchool;
	}

	public void setEducationSchool(String educationSchool) {
		this.educationSchool = educationSchool;
	}

<<<<<<< HEAD
	

=======
	public String getEducationSchoolEndDate() {
		return educationSchoolEndDate;
	}

	public void setEducationSchoolEndDate(String educationSchoolEndDate) {
		this.educationSchoolEndDate = educationSchoolEndDate;
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
/*
=======

>>>>>>> 1185e82019f8820520119a8a3e6e326901be0227
>>>>>>> f499e96bd0070e8ecabf84d7f656c41af4e0c09a
>>>>>>> 0a11dcb9064815d1f707d4abde2a258d2d8ead79
>>>>>>> 42c18efbc6930cdc07ffd3061cc55d35468f39ef
>>>>>>> 64521b49a6d5b9d17857d31512a30ef70c710707
>>>>>>> 304b62ab939c2594413a624e1d50b2852d64a2a4
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
	public String getEducationSpecialization() {
		return educationSpecialization;
	}

	public void setEducationSpecialization(String educationSpecialization) {
		this.educationSpecialization = educationSpecialization;
	}

	public String getEducationInstitution() {
		return educationInstitution;
	}

	public void setEducationInstitution(String educationInstitution) {
		this.educationInstitution = educationInstitution;
	}

	public String getEducationInstitutionType() {
		return educationInstitutionType;
	}

	public void setEducationInstitutionType(String educationInstitutionType) {
		this.educationInstitutionType = educationInstitutionType;
	}

<<<<<<< HEAD
	public Date getEducationSchoolEndDate() {
		return educationSchoolEndDate;
	}

	public void setEducationSchoolEndDate(Date educationSchoolEndDate) {
		this.educationSchoolEndDate = educationSchoolEndDate;
	}

	public Date getEducationInstitutionEndDate() {
		return educationInstitutionEndDate;
	}

	public void setEducationInstitutionEndDate(Date educationInstitutionEndDate) {
		this.educationInstitutionEndDate = educationInstitutionEndDate;
	}

	
    
=======
	public String getEducationInstitutionEndDate() {
		return educationInstitutionEndDate;
	}

	public void setEducationInstitutionEndDate(String educationInstitutionEndDate) {
		this.educationInstitutionEndDate = educationInstitutionEndDate;
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
    */
=======
    
>>>>>>> 1185e82019f8820520119a8a3e6e326901be0227
>>>>>>> f499e96bd0070e8ecabf84d7f656c41af4e0c09a
>>>>>>> 0a11dcb9064815d1f707d4abde2a258d2d8ead79
>>>>>>> 42c18efbc6930cdc07ffd3061cc55d35468f39ef
>>>>>>> 64521b49a6d5b9d17857d31512a30ef70c710707
>>>>>>> 304b62ab939c2594413a624e1d50b2852d64a2a4
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740

}
