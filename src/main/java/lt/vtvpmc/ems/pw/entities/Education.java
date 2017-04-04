package lt.vtvpmc.ems.pw.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education implements Serializable {

	/**
    *
    */
   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Long id;
   
    private String education;
  	private String school;
    private String schoolEndDate;
    
    private String specialization;
    private String institution;
    private String institutionType;
    private String institutionEndDate;
    

   public Education () {
       
      
    }

    public Education (String education, String school, String schoolEndDate, String specialization, String institution, String institutionType,String institutionEndDate ) {
        this.education = education;
        this.school = school;
        this.schoolEndDate=schoolEndDate;
        this.specialization =specialization;
        this.institution =institution;
        this.institutionType =institutionType;
        this.institutionEndDate=institutionEndDate;
      
    }
    

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSchoolEndDate() {
		return schoolEndDate;
	}

	public void setSchoolEndDate(String schoolEndDate) {
		this.schoolEndDate = schoolEndDate;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getInstitutionType() {
		return institutionType;
	}

	public void setInstitutionType(String institutionType) {
		this.institutionType = institutionType;
	}

	public String getInstitutionEndDate() {
		return institutionEndDate;
	}

	public void setInstitutionEndDate(String institutionEndDate) {
		this.institutionEndDate = institutionEndDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
    
    
    
    

}
