
package lt.vtvpmc.ems.pw.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ems.pw.entities.Plan;


public class NewPlanBean {
    
    @PersistenceContext
    private EntityManager entityManager;
    

  	 private String	 planName;
     private String planSurname;
     
     private Long planTikyba;
     private Long planEtika;
     
     private Long planLietkalba1;
     private Long planLietkalba2;
     private Long planGimtojirusu;
     private Long planGimtojilenku;
     
     private Long planAngkalba;
     private Long planVokkalba;
     private Long planPranckalba;
     private Long planRusukalba;
     
     private Long planBiologija;
     private Long planChemija;
     private Long planFizika;
     private Long planGamtosmokslai;
     
     private Long planIstorija;
     private Long planGeografija;
     private Long planSocmokslai;
     
     private Long planMatematika;
      
     private Long planKkultura;
     private Long planFutbolas;
     private Long planKrepsinis;
     
 
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



	public Long getPlanTikyba() {
		return planTikyba;
	}



	public void setPlanTikyba(Long planTikyba) {
		this.planTikyba = planTikyba;
	}



	public Long getPlanEtika() {
		return planEtika;
	}



	public void setPlanEtika(Long planEtika) {
		this.planEtika = planEtika;
	}



	public Long getPlanLietkalba1() {
		return planLietkalba1;
	}



	public void setPlanLietkalba1(Long planLietkalba1) {
		this.planLietkalba1 = planLietkalba1;
	}



	public Long getPlanLietkalba2() {
		return planLietkalba2;
	}



	public void setPlanLietkalba2(Long planLietkalba2) {
		this.planLietkalba2 = planLietkalba2;
	}



	public Long getPlanGimtojirusu() {
		return planGimtojirusu;
	}



	public void setPlanGimtojirusu(Long planGimtojirusu) {
		this.planGimtojirusu = planGimtojirusu;
	}



	public Long getPlanGimtojilenku() {
		return planGimtojilenku;
	}



	public void setPlanGimtojilenku(Long planGimtojilenku) {
		this.planGimtojilenku = planGimtojilenku;
	}



	public Long getPlanAngkalba() {
		return planAngkalba;
	}



	public void setPlanAngkalba(Long planAngkalba) {
		this.planAngkalba = planAngkalba;
	}



	public Long getPlanVokkalba() {
		return planVokkalba;
	}



	public void setPlanVokkalba(Long planVokkalba) {
		this.planVokkalba = planVokkalba;
	}



	public Long getPlanPranckalba() {
		return planPranckalba;
	}



	public void setPlanPranckalba(Long planPranckalba) {
		this.planPranckalba = planPranckalba;
	}



	public Long getPlanRusukalba() {
		return planRusukalba;
	}



	public void setPlanRusukalba(Long planRusukalba) {
		this.planRusukalba = planRusukalba;
	}



	public Long getPlanBiologija() {
		return planBiologija;
	}



	public void setPlanBiologija(Long planBiologija) {
		this.planBiologija = planBiologija;
	}



	public Long getPlanChemija() {
		return planChemija;
	}



	public void setPlanChemija(Long planChemija) {
		this.planChemija = planChemija;
	}



	public Long getPlanFizika() {
		return planFizika;
	}



	public void setPlanFizika(Long planFizika) {
		this.planFizika = planFizika;
	}



	public Long getPlanGamtosmokslai() {
		return planGamtosmokslai;
	}



	public void setPlanGamtosmokslai(Long planGamtosmokslai) {
		this.planGamtosmokslai = planGamtosmokslai;
	}



	public Long getPlanIstorija() {
		return planIstorija;
	}



	public void setPlanIstorija(Long planIstorija) {
		this.planIstorija = planIstorija;
	}



	public Long getPlanGeografija() {
		return planGeografija;
	}



	public void setPlanGeografija(Long planGeografija) {
		this.planGeografija = planGeografija;
	}



	public Long getPlanSocmokslai() {
		return planSocmokslai;
	}



	public void setPlanSocmokslai(Long planSocmokslai) {
		this.planSocmokslai = planSocmokslai;
	}



	public Long getPlanMatematika() {
		return planMatematika;
	}



	public void setPlanMatematika(Long planMatematika) {
		this.planMatematika = planMatematika;
	}



	public Long getPlanKkultura() {
		return planKkultura;
	}



	public void setPlanKkultura(Long planKkultura) {
		this.planKkultura = planKkultura;
	}



	public Long getPlanFutbolas() {
		return planFutbolas;
	}



	public void setPlanFutbolas(Long planFutbolas) {
		this.planFutbolas = planFutbolas;
	}



	public Long getPlanKrepsinis() {
		return planKrepsinis;
	}



	public void setPlanKrepsinis(Long planKrepsinis) {
		this.planKrepsinis = planKrepsinis;
	}




	
}