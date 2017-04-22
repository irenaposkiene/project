
package lt.vtvpmc.ems.pw.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ems.pw.entities.Plan;


public class NewPlanBean {
    
    @PersistenceContext
    private EntityManager entityManager;
    

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
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
<<<<<<< HEAD
=======
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
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
     
 
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
<<<<<<< HEAD
	public Long getPlanTikyba() {
=======
	public String getPlanTikyba() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planTikyba;
	}



<<<<<<< HEAD
	public void setPlanTikyba(Long planTikyba) {
=======
<<<<<<< HEAD
	public void setPlanTikyba(Long planTikyba) {
=======
	public void setPlanTikyba(String planTikyba) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planTikyba = planTikyba;
	}



<<<<<<< HEAD
	public Long getPlanEtika() {
=======
<<<<<<< HEAD
	public Long getPlanEtika() {
=======
	public String getPlanEtika() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planEtika;
	}



<<<<<<< HEAD
	public void setPlanEtika(Long planEtika) {
=======
<<<<<<< HEAD
	public void setPlanEtika(Long planEtika) {
=======
	public void setPlanEtika(String planEtika) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planEtika = planEtika;
	}



<<<<<<< HEAD
	public Long getPlanLietkalba1() {
=======
<<<<<<< HEAD
	public Long getPlanLietkalba1() {
=======
	public String getPlanLietkalba1() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planLietkalba1;
	}



<<<<<<< HEAD
	public void setPlanLietkalba1(Long planLietkalba1) {
=======
<<<<<<< HEAD
	public void setPlanLietkalba1(Long planLietkalba1) {
=======
	public void setPlanLietkalba1(String planLietkalba1) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planLietkalba1 = planLietkalba1;
	}



<<<<<<< HEAD
	public Long getPlanLietkalba2() {
=======
<<<<<<< HEAD
	public Long getPlanLietkalba2() {
=======
	public String getPlanLietkalba2() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planLietkalba2;
	}



<<<<<<< HEAD
	public void setPlanLietkalba2(Long planLietkalba2) {
=======
<<<<<<< HEAD
	public void setPlanLietkalba2(Long planLietkalba2) {
=======
	public void setPlanLietkalba2(String planLietkalba2) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planLietkalba2 = planLietkalba2;
	}



<<<<<<< HEAD
	public Long getPlanGimtojirusu() {
=======
<<<<<<< HEAD
	public Long getPlanGimtojirusu() {
=======
	public String getPlanGimtojirusu() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planGimtojirusu;
	}



<<<<<<< HEAD
	public void setPlanGimtojirusu(Long planGimtojirusu) {
=======
<<<<<<< HEAD
	public void setPlanGimtojirusu(Long planGimtojirusu) {
=======
	public void setPlanGimtojirusu(String planGimtojirusu) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planGimtojirusu = planGimtojirusu;
	}



<<<<<<< HEAD
	public Long getPlanGimtojilenku() {
=======
<<<<<<< HEAD
	public Long getPlanGimtojilenku() {
=======
	public String getPlanGimtojilenku() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planGimtojilenku;
	}



<<<<<<< HEAD
	public void setPlanGimtojilenku(Long planGimtojilenku) {
=======
<<<<<<< HEAD
	public void setPlanGimtojilenku(Long planGimtojilenku) {
=======
	public void setPlanGimtojilenku(String planGimtojilenku) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planGimtojilenku = planGimtojilenku;
	}



<<<<<<< HEAD
	public Long getPlanAngkalba() {
=======
<<<<<<< HEAD
	public Long getPlanAngkalba() {
=======
	public String getPlanAngkalba() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planAngkalba;
	}



<<<<<<< HEAD
	public void setPlanAngkalba(Long planAngkalba) {
=======
<<<<<<< HEAD
	public void setPlanAngkalba(Long planAngkalba) {
=======
	public void setPlanAngkalba(String planAngkalba) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planAngkalba = planAngkalba;
	}



<<<<<<< HEAD
	public Long getPlanVokkalba() {
=======
<<<<<<< HEAD
	public Long getPlanVokkalba() {
=======
	public String getPlanVokkalba() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planVokkalba;
	}



<<<<<<< HEAD
	public void setPlanVokkalba(Long planVokkalba) {
=======
<<<<<<< HEAD
	public void setPlanVokkalba(Long planVokkalba) {
=======
	public void setPlanVokkalba(String planVokkalba) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planVokkalba = planVokkalba;
	}



<<<<<<< HEAD
	public Long getPlanPranckalba() {
=======
<<<<<<< HEAD
	public Long getPlanPranckalba() {
=======
	public String getPlanPranckalba() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planPranckalba;
	}



<<<<<<< HEAD
	public void setPlanPranckalba(Long planPranckalba) {
=======
<<<<<<< HEAD
	public void setPlanPranckalba(Long planPranckalba) {
=======
	public void setPlanPranckalba(String planPranckalba) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planPranckalba = planPranckalba;
	}



<<<<<<< HEAD
	public Long getPlanRusukalba() {
=======
<<<<<<< HEAD
	public Long getPlanRusukalba() {
=======
	public String getPlanRusukalba() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planRusukalba;
	}



<<<<<<< HEAD
	public void setPlanRusukalba(Long planRusukalba) {
=======
<<<<<<< HEAD
	public void setPlanRusukalba(Long planRusukalba) {
=======
	public void setPlanRusukalba(String planRusukalba) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planRusukalba = planRusukalba;
	}



<<<<<<< HEAD
	public Long getPlanBiologija() {
=======
<<<<<<< HEAD
	public Long getPlanBiologija() {
=======
	public String getPlanBiologija() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planBiologija;
	}



<<<<<<< HEAD
	public void setPlanBiologija(Long planBiologija) {
=======
<<<<<<< HEAD
	public void setPlanBiologija(Long planBiologija) {
=======
	public void setPlanBiologija(String planBiologija) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planBiologija = planBiologija;
	}



<<<<<<< HEAD
	public Long getPlanChemija() {
=======
<<<<<<< HEAD
	public Long getPlanChemija() {
=======
	public String getPlanChemija() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planChemija;
	}



<<<<<<< HEAD
	public void setPlanChemija(Long planChemija) {
=======
<<<<<<< HEAD
	public void setPlanChemija(Long planChemija) {
=======
	public void setPlanChemija(String planChemija) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planChemija = planChemija;
	}



<<<<<<< HEAD
	public Long getPlanFizika() {
=======
<<<<<<< HEAD
	public Long getPlanFizika() {
=======
	public String getPlanFizika() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planFizika;
	}



<<<<<<< HEAD
	public void setPlanFizika(Long planFizika) {
=======
<<<<<<< HEAD
	public void setPlanFizika(Long planFizika) {
=======
	public void setPlanFizika(String planFizika) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planFizika = planFizika;
	}



<<<<<<< HEAD
	public Long getPlanGamtosmokslai() {
=======
<<<<<<< HEAD
	public Long getPlanGamtosmokslai() {
=======
	public String getPlanGamtosmokslai() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planGamtosmokslai;
	}



<<<<<<< HEAD
	public void setPlanGamtosmokslai(Long planGamtosmokslai) {
=======
<<<<<<< HEAD
	public void setPlanGamtosmokslai(Long planGamtosmokslai) {
=======
	public void setPlanGamtosmokslai(String planGamtosmokslai) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planGamtosmokslai = planGamtosmokslai;
	}



<<<<<<< HEAD
	public Long getPlanIstorija() {
=======
<<<<<<< HEAD
	public Long getPlanIstorija() {
=======
	public String getPlanIstorija() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planIstorija;
	}



<<<<<<< HEAD
	public void setPlanIstorija(Long planIstorija) {
=======
<<<<<<< HEAD
	public void setPlanIstorija(Long planIstorija) {
=======
	public void setPlanIstorija(String planIstorija) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planIstorija = planIstorija;
	}



<<<<<<< HEAD
	public Long getPlanGeografija() {
=======
<<<<<<< HEAD
	public Long getPlanGeografija() {
=======
	public String getPlanGeografija() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planGeografija;
	}



<<<<<<< HEAD
	public void setPlanGeografija(Long planGeografija) {
=======
<<<<<<< HEAD
	public void setPlanGeografija(Long planGeografija) {
=======
	public void setPlanGeografija(String planGeografija) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planGeografija = planGeografija;
	}



<<<<<<< HEAD
	public Long getPlanSocmokslai() {
=======
<<<<<<< HEAD
	public Long getPlanSocmokslai() {
=======
	public String getPlanSocmokslai() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planSocmokslai;
	}



<<<<<<< HEAD
	public void setPlanSocmokslai(Long planSocmokslai) {
=======
<<<<<<< HEAD
	public void setPlanSocmokslai(Long planSocmokslai) {
=======
	public void setPlanSocmokslai(String planSocmokslai) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planSocmokslai = planSocmokslai;
	}



<<<<<<< HEAD
	public Long getPlanMatematika() {
=======
<<<<<<< HEAD
	public Long getPlanMatematika() {
=======
	public String getPlanMatematika() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planMatematika;
	}



<<<<<<< HEAD
	public void setPlanMatematika(Long planMatematika) {
=======
<<<<<<< HEAD
	public void setPlanMatematika(Long planMatematika) {
=======
	public void setPlanMatematika(String planMatematika) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planMatematika = planMatematika;
	}



<<<<<<< HEAD
	public Long getPlanKkultura() {
=======
<<<<<<< HEAD
	public Long getPlanKkultura() {
=======
	public String getPlanKkultura() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planKkultura;
	}



<<<<<<< HEAD
	public void setPlanKkultura(Long planKkultura) {
=======
<<<<<<< HEAD
	public void setPlanKkultura(Long planKkultura) {
=======
	public void setPlanKkultura(String planKkultura) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planKkultura = planKkultura;
	}



<<<<<<< HEAD
	public Long getPlanFutbolas() {
=======
<<<<<<< HEAD
	public Long getPlanFutbolas() {
=======
	public String getPlanFutbolas() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planFutbolas;
	}



<<<<<<< HEAD
	public void setPlanFutbolas(Long planFutbolas) {
=======
<<<<<<< HEAD
	public void setPlanFutbolas(Long planFutbolas) {
=======
	public void setPlanFutbolas(String planFutbolas) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planFutbolas = planFutbolas;
	}



<<<<<<< HEAD
	public Long getPlanKrepsinis() {
=======
<<<<<<< HEAD
	public Long getPlanKrepsinis() {
=======
	public String getPlanKrepsinis() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return planKrepsinis;
	}



<<<<<<< HEAD
	public void setPlanKrepsinis(Long planKrepsinis) {
=======
<<<<<<< HEAD
	public void setPlanKrepsinis(Long planKrepsinis) {
=======
	public void setPlanKrepsinis(String planKrepsinis) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.planKrepsinis = planKrepsinis;
	}




	
}