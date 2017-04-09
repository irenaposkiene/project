package lt.vtvpmc.ems.pw.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ems.pw.entities.Form;
import java.util.Date;


public class NewFormBean {

    
    @PersistenceContext
    private EntityManager entityManager;
    
    private Date formDate;
    private String formGr;
  	private String formGrSpec;
  	private String [] formDok;
  	   
    
    @Transactional
    public String save() {
        Form form = new Form(formDate,formGr, formGrSpec, formDok);
         entityManager.persist(form);
        return "form";
    }
    
    
	public String[] getFormDok() {
		return formDok;
	}


	public void setFormDok(String[] formDok) {
		this.formDok = formDok;
	}


	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	public Date getFormDate() {
		return formDate;
	}


	public void setFormDate(Date formDate) {
		this.formDate = formDate;
	}


	public String getFormGr() {
		return formGr;
	}


	public void setFormGr(String formGr) {
		this.formGr = formGr;
	}


	public String getFormGrSpec() {
		return formGrSpec;
	}


	public void setFormGrSpec(String formGrSpec) {
		this.formGrSpec = formGrSpec;
	}
	
	
	   public String[] getFormDokValue() {
	    	
	    	formDok = new String [6];
	    	formDok[0]="Išsilavinimo dokumentas - Taip";
	    	formDok[1]="Sveikatos pažymėjimas - Taip";
	    	formDok[2]="Nuotraukos 3X4 (2-4 vnt.)-Taip";
	    	formDok[3]="Paso kopija (Asmens tapatybės kortelės kopija)-Taip";
	    	formDok[4]="Šauktinio liudijimas-Taip";
	    	formDok[5]="Stojamasis mokestis-Taip";
	    	    			
			return formDok;
		}
	
}