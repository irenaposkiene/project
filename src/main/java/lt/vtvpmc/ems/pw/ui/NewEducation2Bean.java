package lt.vtvpmc.ems.pw.ui;
import lt.vtvpmc.ems.pw.entities.Education2;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;


public class NewEducation2Bean {
	
   
    @PersistenceContext
    private EntityManager entityManager;
    
         
    private String education2Specialization;
    private String education2Institution;
    private String education2InstitutionType;
    private String education2InstitutionEndDate;

    @Transactional
    public String save() {
        Education2 education2 = new Education2 (education2Specialization, education2Institution, education2InstitutionType, education2InstitutionEndDate);
       entityManager.persist(education2);
        return "education";
    }

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public String getEducation2Specialization() {
		return education2Specialization;
	}

	public void setEducation2Specialization(String education2Specialization) {
		this.education2Specialization = education2Specialization;
	}

	public String getEducation2Institution() {
		return education2Institution;
	}

	public void setEducation2Institution(String education2Institution) {
		this.education2Institution = education2Institution;
	}

	public String getEducation2InstitutionType() {
		return education2InstitutionType;
	}

	public void setEducation2InstitutionType(String education2InstitutionType) {
		this.education2InstitutionType = education2InstitutionType;
	}

	public String getEducation2InstitutionEndDate() {
		return education2InstitutionEndDate;
	}

	public void setEducation2InstitutionEndDate(String education2InstitutionEndDate) {
		this.education2InstitutionEndDate = education2InstitutionEndDate;
	}

	
	

}
