
package lt.vtvpmc.ems.pw.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ems.pw.entities.Plan;


public class NewPlanBean {
    
    @PersistenceContext
    private EntityManager entityManager;
    

  	 private String planName;
     private String planSurname;
     
     private String planTikyba;
     private String planEtika;
     
     private String planLietkalba1;
     private String planLietkalba2;
     private String planGimtojirusu;
     private String planGimtojilenku;
     
     private String planAngkalba;
     private String planVokkalba;
     private String planPranckalba;
     private String planRusukalba;
     
     private String planBiologija;
     private String planChemija;
     private String planFizika;
     private String planGamtosmokslai;
     
     private String planIstorija;
     private String planGeografija;
     private String planSocmokslai;
     
     private String planMatematika;
      
     private String planKkultura;
     private String planFutbolas;
     private String planKrepsinis;
     
 
    @Transactional
    public String save() {
        Plan plan = new Plan (planName,  planSurname, planTikyba, planEtika, planLietkalba1, planLietkalba2, planGimtojirusu, planGimtojilenku,
        	     planAngkalba, planVokkalba, planPranckalba, planRusukalba, planBiologija, planChemija,  planFizika, planGamtosmokslai,
        	     planIstorija, planGeografija, planSocmokslai, planMatematika, planKkultura, planFutbolas, planKrepsinis);
        	     
        entityManager.persist(plan);
        return "plan";
    }
    
    
    
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}



	public String getPlanName() {
		return planName;
	}



	public void setPlanName(String planName) {
		this.planName = planName;
	}



	public String getPlanSurname() {
		return planSurname;
	}



	public void setPlanSurname(String planSurname) {
		this.planSurname = planSurname;
	}



	public String getPlanTikyba() {
		return planTikyba;
	}



	public void setPlanTikyba(String planTikyba) {
		this.planTikyba = planTikyba;
	}



	public String getPlanEtika() {
		return planEtika;
	}



	public void setPlanEtika(String planEtika) {
		this.planEtika = planEtika;
	}



	public String getPlanLietkalba1() {
		return planLietkalba1;
	}



	public void setPlanLietkalba1(String planLietkalba1) {
		this.planLietkalba1 = planLietkalba1;
	}



	public String getPlanLietkalba2() {
		return planLietkalba2;
	}



	public void setPlanLietkalba2(String planLietkalba2) {
		this.planLietkalba2 = planLietkalba2;
	}



	public String getPlanGimtojirusu() {
		return planGimtojirusu;
	}



	public void setPlanGimtojirusu(String planGimtojirusu) {
		this.planGimtojirusu = planGimtojirusu;
	}



	public String getPlanGimtojilenku() {
		return planGimtojilenku;
	}



	public void setPlanGimtojilenku(String planGimtojilenku) {
		this.planGimtojilenku = planGimtojilenku;
	}



	public String getPlanAngkalba() {
		return planAngkalba;
	}



	public void setPlanAngkalba(String planAngkalba) {
		this.planAngkalba = planAngkalba;
	}



	public String getPlanVokkalba() {
		return planVokkalba;
	}



	public void setPlanVokkalba(String planVokkalba) {
		this.planVokkalba = planVokkalba;
	}



	public String getPlanPranckalba() {
		return planPranckalba;
	}



	public void setPlanPranckalba(String planPranckalba) {
		this.planPranckalba = planPranckalba;
	}



	public String getPlanRusukalba() {
		return planRusukalba;
	}



	public void setPlanRusukalba(String planRusukalba) {
		this.planRusukalba = planRusukalba;
	}



	public String getPlanBiologija() {
		return planBiologija;
	}



	public void setPlanBiologija(String planBiologija) {
		this.planBiologija = planBiologija;
	}



	public String getPlanChemija() {
		return planChemija;
	}



	public void setPlanChemija(String planChemija) {
		this.planChemija = planChemija;
	}



	public String getPlanFizika() {
		return planFizika;
	}



	public void setPlanFizika(String planFizika) {
		this.planFizika = planFizika;
	}



	public String getPlanGamtosmokslai() {
		return planGamtosmokslai;
	}



	public void setPlanGamtosmokslai(String planGamtosmokslai) {
		this.planGamtosmokslai = planGamtosmokslai;
	}



	public String getPlanIstorija() {
		return planIstorija;
	}



	public void setPlanIstorija(String planIstorija) {
		this.planIstorija = planIstorija;
	}



	public String getPlanGeografija() {
		return planGeografija;
	}



	public void setPlanGeografija(String planGeografija) {
		this.planGeografija = planGeografija;
	}



	public String getPlanSocmokslai() {
		return planSocmokslai;
	}



	public void setPlanSocmokslai(String planSocmokslai) {
		this.planSocmokslai = planSocmokslai;
	}



	public String getPlanMatematika() {
		return planMatematika;
	}



	public void setPlanMatematika(String planMatematika) {
		this.planMatematika = planMatematika;
	}



	public String getPlanKkultura() {
		return planKkultura;
	}



	public void setPlanKkultura(String planKkultura) {
		this.planKkultura = planKkultura;
	}



	public String getPlanFutbolas() {
		return planFutbolas;
	}



	public void setPlanFutbolas(String planFutbolas) {
		this.planFutbolas = planFutbolas;
	}



	public String getPlanKrepsinis() {
		return planKrepsinis;
	}



	public void setPlanKrepsinis(String planKrepsinis) {
		this.planKrepsinis = planKrepsinis;
	}




	
}