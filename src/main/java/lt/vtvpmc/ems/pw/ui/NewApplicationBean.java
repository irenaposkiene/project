package lt.vtvpmc.ems.pw.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ems.pw.entities.Application;

public class NewApplicationBean {

    
    @PersistenceContext
    private EntityManager entityManager;
    

    private String applicationNr;
    private String applicationDate;
  	private String applicationGroup;
    private String applicationGroupId;
<<<<<<< HEAD
    private boolean applicationDok;
    
   
    
    public boolean isApplicationDok() {
		return applicationDok;
	}


	public void setApplicationDok(boolean applicationDok) {
		this.applicationDok = applicationDok;
	}


	@Transactional
    public String save() {
        Application application = new Application( applicationNr, applicationDate, applicationGroup, applicationGroupId, applicationDok );
=======
    
   
    
    @Transactional
    public String save() {
        Application application = new Application( applicationNr, applicationDate, applicationGroup, applicationGroupId );
>>>>>>> 304b62ab939c2594413a624e1d50b2852d64a2a4
        entityManager.persist(application);
        return "application";
    }
    
    
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	public String getApplicationNr() {
		return applicationNr;
	}


	public void setApplicationNr(String applicationNr) {
		this.applicationNr = applicationNr;
	}


	public String getApplicationDate() {
		return applicationDate;
	}


	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}


	public String getApplicationGroup() {
		return applicationGroup;
	}


	public void setApplicationGroup(String applicationGroup) {
		this.applicationGroup = applicationGroup;
	}


	public String getApplicationGroupId() {
		return applicationGroupId;
	}


	public void setApplicationGroupId(String applicationGroupId) {
		this.applicationGroupId = applicationGroupId;
	}
	
	
}