package lt.vtvpmc.ems.pw.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ems.pw.entities.Additional;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
import lt.vtvpmc.ems.pw.entities.Application;
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b

public class NewAdditionalBean {

    
    @PersistenceContext
    private EntityManager entityManager;
    

    private String additionalHostel;
    private String additionalHowknow;
  	private String additionalRefuce;
  	
 
    @Transactional
    public String save() {
        Additional additional = new Additional (additionalHostel, additionalHowknow, additionalRefuce );
        entityManager.persist(additional);
        return "additional";
    }
    
    
    
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	public String getAdditionalHostel() {
		return additionalHostel;
	}


	public void setAdditionalHostel(String additionalHostel) {
		this.additionalHostel = additionalHostel;
	}


	public String getAdditionalHowknow() {
		return additionalHowknow;
	}


	public void setAdditionalHowknow(String additionalHowknow) {
		this.additionalHowknow = additionalHowknow;
	}


	public String getAdditionalRefuce() {
		return additionalRefuce;
	}


	public void setAdditionalRefuce(String additionalRefuce) {
		this.additionalRefuce = additionalRefuce;
	}



	
}