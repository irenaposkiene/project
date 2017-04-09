
package lt.vtvpmc.ems.pw.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ems.pw.entities.Plan;


public class NewPlanBean {
    
    @PersistenceContext
    private EntityManager entityManager;
    

<<<<<<< HEAD
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
=======
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
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
     
 
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



<<<<<<< HEAD
	public Long getPlanTikyba() {
=======
	public String getPlanTikyba() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planTikyba;
	}



<<<<<<< HEAD
	public void setPlanTikyba(Long planTikyba) {
=======
	public void setPlanTikyba(String planTikyba) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planTikyba = planTikyba;
	}



<<<<<<< HEAD
	public Long getPlanEtika() {
=======
	public String getPlanEtika() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planEtika;
	}



<<<<<<< HEAD
	public void setPlanEtika(Long planEtika) {
=======
	public void setPlanEtika(String planEtika) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planEtika = planEtika;
	}



<<<<<<< HEAD
	public Long getPlanLietkalba1() {
=======
	public String getPlanLietkalba1() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planLietkalba1;
	}



<<<<<<< HEAD
	public void setPlanLietkalba1(Long planLietkalba1) {
=======
	public void setPlanLietkalba1(String planLietkalba1) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planLietkalba1 = planLietkalba1;
	}



<<<<<<< HEAD
	public Long getPlanLietkalba2() {
=======
	public String getPlanLietkalba2() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planLietkalba2;
	}



<<<<<<< HEAD
	public void setPlanLietkalba2(Long planLietkalba2) {
=======
	public void setPlanLietkalba2(String planLietkalba2) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planLietkalba2 = planLietkalba2;
	}



<<<<<<< HEAD
	public Long getPlanGimtojirusu() {
=======
	public String getPlanGimtojirusu() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planGimtojirusu;
	}



<<<<<<< HEAD
	public void setPlanGimtojirusu(Long planGimtojirusu) {
=======
	public void setPlanGimtojirusu(String planGimtojirusu) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planGimtojirusu = planGimtojirusu;
	}



<<<<<<< HEAD
	public Long getPlanGimtojilenku() {
=======
	public String getPlanGimtojilenku() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planGimtojilenku;
	}



<<<<<<< HEAD
	public void setPlanGimtojilenku(Long planGimtojilenku) {
=======
	public void setPlanGimtojilenku(String planGimtojilenku) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planGimtojilenku = planGimtojilenku;
	}



<<<<<<< HEAD
	public Long getPlanAngkalba() {
=======
	public String getPlanAngkalba() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planAngkalba;
	}



<<<<<<< HEAD
	public void setPlanAngkalba(Long planAngkalba) {
=======
	public void setPlanAngkalba(String planAngkalba) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planAngkalba = planAngkalba;
	}



<<<<<<< HEAD
	public Long getPlanVokkalba() {
=======
	public String getPlanVokkalba() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planVokkalba;
	}



<<<<<<< HEAD
	public void setPlanVokkalba(Long planVokkalba) {
=======
	public void setPlanVokkalba(String planVokkalba) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planVokkalba = planVokkalba;
	}



<<<<<<< HEAD
	public Long getPlanPranckalba() {
=======
	public String getPlanPranckalba() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planPranckalba;
	}



<<<<<<< HEAD
	public void setPlanPranckalba(Long planPranckalba) {
=======
	public void setPlanPranckalba(String planPranckalba) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planPranckalba = planPranckalba;
	}



<<<<<<< HEAD
	public Long getPlanRusukalba() {
=======
	public String getPlanRusukalba() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planRusukalba;
	}



<<<<<<< HEAD
	public void setPlanRusukalba(Long planRusukalba) {
=======
	public void setPlanRusukalba(String planRusukalba) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planRusukalba = planRusukalba;
	}



<<<<<<< HEAD
	public Long getPlanBiologija() {
=======
	public String getPlanBiologija() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planBiologija;
	}



<<<<<<< HEAD
	public void setPlanBiologija(Long planBiologija) {
=======
	public void setPlanBiologija(String planBiologija) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planBiologija = planBiologija;
	}



<<<<<<< HEAD
	public Long getPlanChemija() {
=======
	public String getPlanChemija() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planChemija;
	}



<<<<<<< HEAD
	public void setPlanChemija(Long planChemija) {
=======
	public void setPlanChemija(String planChemija) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planChemija = planChemija;
	}



<<<<<<< HEAD
	public Long getPlanFizika() {
=======
	public String getPlanFizika() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planFizika;
	}



<<<<<<< HEAD
	public void setPlanFizika(Long planFizika) {
=======
	public void setPlanFizika(String planFizika) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planFizika = planFizika;
	}



<<<<<<< HEAD
	public Long getPlanGamtosmokslai() {
=======
	public String getPlanGamtosmokslai() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planGamtosmokslai;
	}



<<<<<<< HEAD
	public void setPlanGamtosmokslai(Long planGamtosmokslai) {
=======
	public void setPlanGamtosmokslai(String planGamtosmokslai) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planGamtosmokslai = planGamtosmokslai;
	}



<<<<<<< HEAD
	public Long getPlanIstorija() {
=======
	public String getPlanIstorija() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planIstorija;
	}



<<<<<<< HEAD
	public void setPlanIstorija(Long planIstorija) {
=======
	public void setPlanIstorija(String planIstorija) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planIstorija = planIstorija;
	}



<<<<<<< HEAD
	public Long getPlanGeografija() {
=======
	public String getPlanGeografija() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planGeografija;
	}



<<<<<<< HEAD
	public void setPlanGeografija(Long planGeografija) {
=======
	public void setPlanGeografija(String planGeografija) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planGeografija = planGeografija;
	}



<<<<<<< HEAD
	public Long getPlanSocmokslai() {
=======
	public String getPlanSocmokslai() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planSocmokslai;
	}



<<<<<<< HEAD
	public void setPlanSocmokslai(Long planSocmokslai) {
=======
	public void setPlanSocmokslai(String planSocmokslai) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planSocmokslai = planSocmokslai;
	}



<<<<<<< HEAD
	public Long getPlanMatematika() {
=======
	public String getPlanMatematika() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planMatematika;
	}



<<<<<<< HEAD
	public void setPlanMatematika(Long planMatematika) {
=======
	public void setPlanMatematika(String planMatematika) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planMatematika = planMatematika;
	}



<<<<<<< HEAD
	public Long getPlanKkultura() {
=======
	public String getPlanKkultura() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planKkultura;
	}



<<<<<<< HEAD
	public void setPlanKkultura(Long planKkultura) {
=======
	public void setPlanKkultura(String planKkultura) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planKkultura = planKkultura;
	}



<<<<<<< HEAD
	public Long getPlanFutbolas() {
=======
	public String getPlanFutbolas() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planFutbolas;
	}



<<<<<<< HEAD
	public void setPlanFutbolas(Long planFutbolas) {
=======
	public void setPlanFutbolas(String planFutbolas) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planFutbolas = planFutbolas;
	}



<<<<<<< HEAD
	public Long getPlanKrepsinis() {
=======
	public String getPlanKrepsinis() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		return planKrepsinis;
	}



<<<<<<< HEAD
	public void setPlanKrepsinis(Long planKrepsinis) {
=======
	public void setPlanKrepsinis(String planKrepsinis) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
		this.planKrepsinis = planKrepsinis;
	}




	
}