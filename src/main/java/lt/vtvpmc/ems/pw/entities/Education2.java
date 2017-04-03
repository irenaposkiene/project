package lt.vtvpmc.ems.pw.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education2 implements Serializable {

	/**
    *
    */
   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Long id;
   
    private String specialization;
    private String institution;
    private String institutionType;
    private String institutionEndDate;
    

   public Education2 () {
       
      
    }

    public Education2 (String specialization, String institution, String institutionType,String institutionEndDate ) {
        
        this.specialization =specialization;
        this.institution =institution;
        this.institutionType =institutionType;
        this.institutionEndDate=institutionEndDate;
      
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
