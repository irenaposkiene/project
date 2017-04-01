package lt.vtvpmc.ems.pw.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ems.pw.entities.Education;

public class NewEducationBean {
	
   
    @PersistenceContext
    private EntityManager entityManager;
    
      
    private String educationEducation;
  	private String educationSchool;
    private String educationSchoolEndDate;
    
    private String educationSpecialization;
    private String educationInstitution;
    private String educationInstitutionType;
    private String educationInstitutionEndDate;

    @Transactional
    public String save() {
        Education education = new Education (educationEducation, educationSchool, educationSchoolEndDate, educationSpecialization, educationInstitution, educationInstitutionType, educationInstitutionEndDate);
       entityManager.persist(education);
        return "main";
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

	public String getEducationSchoolEndDate() {
		return educationSchoolEndDate;
	}

	public void setEducationSchoolEndDate(String educationSchoolEndDate) {
		this.educationSchoolEndDate = educationSchoolEndDate;
	}

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

	public String getEducationInstitutionEndDate() {
		return educationInstitutionEndDate;
	}

	public void setEducationInstitutionEndDate(String educationInstitutionEndDate) {
		this.educationInstitutionEndDate = educationInstitutionEndDate;
	}
    

}
