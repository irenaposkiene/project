package lt.vtvpmc.ems.pw.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ems.pw.entities.Family;

public class NewFamilyBean {

    
    @PersistenceContext
    private EntityManager entityManager;
    
    private String familyFatherName;
    private String familyFatherSurname;
  	private String familyFatherAdress;
  	private String familyFatherPhone;

  	private String familyMotherName;
    private String familyMotherSurname;
   	private String familyMotherAdress;
  	private String familyMotherPhone;
  	
  	private String familyPatronName;
    private String familyPatronSurname;
   	private String familyPatronAdress;
  	private String familyPatronPhone;
    
  	   
    
    @Transactional
    public String save() {
        Family family = new Family(familyFatherName,familyFatherSurname, familyFatherAdress, familyFatherPhone, familyMotherName, familyMotherSurname, familyMotherAdress, familyMotherPhone, familyPatronName, familyPatronSurname, familyPatronAdress, familyPatronPhone ); 
        entityManager.persist(family);
        return "family";
    }
    
    
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	public String getFamilyFatherName() {
		return familyFatherName;
	}


	public void setFamilyFatherName(String familyFatherName) {
		this.familyFatherName = familyFatherName;
	}


	public String getFamilyFatherSurname() {
		return familyFatherSurname;
	}


	public void setFamilyFatherSurname(String familyFatherSurname) {
		this.familyFatherSurname = familyFatherSurname;
	}


	public String getFamilyFatherAdress() {
		return familyFatherAdress;
	}


	public void setFamilyFatherAdress(String familyFatherAdress) {
		this.familyFatherAdress = familyFatherAdress;
	}


	public String getFamilyFatherPhone() {
		return familyFatherPhone;
	}


	public void setFamilyFatherPhone(String familyFatherPhone) {
		this.familyFatherPhone = familyFatherPhone;
	}


	public String getFamilyMotherName() {
		return familyMotherName;
	}


	public void setFamilyMotherName(String familyMotherName) {
		this.familyMotherName = familyMotherName;
	}


	public String getFamilyMotherSurname() {
		return familyMotherSurname;
	}


	public void setFamilyMotherSurname(String familyMotherSurname) {
		this.familyMotherSurname = familyMotherSurname;
	}


	public String getFamilyMotherAdress() {
		return familyMotherAdress;
	}


	public void setFamilyMotherAdress(String familyMotherAdress) {
		this.familyMotherAdress = familyMotherAdress;
	}


	public String getFamilyMotherPhone() {
		return familyMotherPhone;
	}


	public void setFamilyMotherPhone(String familyMotherPhone) {
		this.familyMotherPhone = familyMotherPhone;
	}


	public String getFamilyPatronName() {
		return familyPatronName;
	}


	public void setFamilyPatronName(String familyPatronName) {
		this.familyPatronName = familyPatronName;
	}


	public String getFamilyPatronSurname() {
		return familyPatronSurname;
	}


	public void setFamilyPatronSurname(String familyPatronSurname) {
		this.familyPatronSurname = familyPatronSurname;
	}


	public String getFamilyPatronAdress() {
		return familyPatronAdress;
	}


	public void setFamilyPatronAdress(String familyPatronAdress) {
		this.familyPatronAdress = familyPatronAdress;
	}


	public String getFamilyPatronPhone() {
		return familyPatronPhone;
	}


	public void setFamilyPatronPhone(String familyPatronPhone) {
		this.familyPatronPhone = familyPatronPhone;
	}


}