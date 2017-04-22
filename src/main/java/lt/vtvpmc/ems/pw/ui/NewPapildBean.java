
package lt.vtvpmc.ems.pw.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ems.pw.entities.Papild;


public class NewPapildBean {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    private String papildName;
    private String papildSurname;
    
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
    private Long papildRusukalba2;
    private Long papildAngkalba2;
    private Long papildVokkalba2;
   
    private Long papildDizainas;
    private Long papildDaile;
    private Long papildTeatras;
    private Long papildMuzika;
    private Long papildInformatika;
   
    private Long papildLietuviugimtoji;
    private Long papildLietuviuvalstybine;
    private Long papildUzskalba;
    
    private Long papildIstorija;
    private Long papildMatematika;
    private Long papildBiologija;
    private Long papildChemija;
    private Long papildFizika;
    
    private Long papildBiologijamod1;
    private Long papildChemijamod;
    private Long papildBiologijamod2;
    
    private Long papildFizikamod1;
    private Long papildFizikamod2;
    private Long papildFizikamod3;
    
    private Long papildMatematikosmod1;
    private Long papildMatematikosmod2;
    private Long papildMatematikosmod3;
<<<<<<< HEAD
=======
=======
    private String papildRusukalba2;
    private String papildAngkalba2;
    private String papildVokkalba2;
   
    private String papildDizainas;
    private String papildDaile;
    private String papildTeatras;
    private String papildMuzika;
    private String papildInformatika;
   
    private String papildLietuviugimtoji;
    private String papildLietuviuvalstybine;
    private String papildUzskalba;
    
    private String papildIstorija;
    private String papildMatematika;
    private String papildBiologija;
    private String papildChemija;
    private String papildFizika;
    
    private String papildBiologijamod1;
    private String papildChemijamod;
    private String papildBiologijamod2;
    
    private String papildFizikamod1;
    private String papildFizikamod2;
    private String papildFizikamod3;
    
    private String papildMatematikosmod1;
    private String papildMatematikosmod2;
    private String papildMatematikosmod3;
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
    
    @Transactional
    public String save() {
        Papild papild = new Papild (papildName, papildSurname, papildRusukalba2, papildAngkalba2, papildVokkalba2, papildDizainas, papildDaile,
        	     papildTeatras, papildMuzika, papildInformatika, papildLietuviugimtoji, papildLietuviuvalstybine, papildUzskalba,
        	     papildIstorija, papildMatematika, papildBiologija, papildChemija, papildFizika, papildBiologijamod1, papildChemijamod, 
        	     papildBiologijamod2, papildFizikamod1, papildFizikamod2, papildFizikamod3, papildMatematikosmod1, papildMatematikosmod2, papildMatematikosmod3);
<<<<<<< HEAD
        	     		        	     
=======
<<<<<<< HEAD
        	     		        	     
=======
        	    
        		        	     
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
        entityManager.persist(papild);
        return "papildomai";
    }
    
    
    
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}



	public String getPapildName() {
		return papildName;
	}



	public void setPapildName(String papildName) {
		this.papildName = papildName;
	}



	public String getPapildSurname() {
		return papildSurname;
	}



	public void setPapildSurname(String papildSurname) {
		this.papildSurname = papildSurname;
	}



<<<<<<< HEAD
	public Long getPapildRusukalba2() {
=======
<<<<<<< HEAD
	public Long getPapildRusukalba2() {
=======
	public String getPapildRusukalba2() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildRusukalba2;
	}



<<<<<<< HEAD
	public void setPapildRusukalba2(Long papildRusukalba2) {
=======
<<<<<<< HEAD
	public void setPapildRusukalba2(Long papildRusukalba2) {
=======
	public void setPapildRusukalba2(String papildRusukalba2) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildRusukalba2 = papildRusukalba2;
	}



<<<<<<< HEAD
	public Long getPapildAngkalba2() {
=======
<<<<<<< HEAD
	public Long getPapildAngkalba2() {
=======
	public String getPapildAngkalba2() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildAngkalba2;
	}



<<<<<<< HEAD
	public void setPapildAngkalba2(Long papildAngkalba2) {
=======
<<<<<<< HEAD
	public void setPapildAngkalba2(Long papildAngkalba2) {
=======
	public void setPapildAngkalba2(String papildAngkalba2) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildAngkalba2 = papildAngkalba2;
	}



<<<<<<< HEAD
	public Long getPapildVokkalba2() {
=======
<<<<<<< HEAD
	public Long getPapildVokkalba2() {
=======
	public String getPapildVokkalba2() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildVokkalba2;
	}



<<<<<<< HEAD
	public void setPapildVokkalba2(Long papildVokkalba2) {
=======
<<<<<<< HEAD
	public void setPapildVokkalba2(Long papildVokkalba2) {
=======
	public void setPapildVokkalba2(String papildVokkalba2) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildVokkalba2 = papildVokkalba2;
	}



<<<<<<< HEAD
	public Long getPapildDizainas() {
=======
<<<<<<< HEAD
	public Long getPapildDizainas() {
=======
	public String getPapildDizainas() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildDizainas;
	}



<<<<<<< HEAD
	public void setPapildDizainas(Long papildDizainas) {
=======
<<<<<<< HEAD
	public void setPapildDizainas(Long papildDizainas) {
=======
	public void setPapildDizainas(String papildDizainas) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildDizainas = papildDizainas;
	}



<<<<<<< HEAD
	public Long getPapildDaile() {
=======
<<<<<<< HEAD
	public Long getPapildDaile() {
=======
	public String getPapildDaile() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildDaile;
	}



<<<<<<< HEAD
	public void setPapildDaile(Long papildDaile) {
=======
<<<<<<< HEAD
	public void setPapildDaile(Long papildDaile) {
=======
	public void setPapildDaile(String papildDaile) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildDaile = papildDaile;
	}



<<<<<<< HEAD
	public Long getPapildTeatras() {
=======
<<<<<<< HEAD
	public Long getPapildTeatras() {
=======
	public String getPapildTeatras() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildTeatras;
	}



<<<<<<< HEAD
	public void setPapildTeatras(Long papildTeatras) {
=======
<<<<<<< HEAD
	public void setPapildTeatras(Long papildTeatras) {
=======
	public void setPapildTeatras(String papildTeatras) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildTeatras = papildTeatras;
	}



<<<<<<< HEAD
	public Long getPapildMuzika() {
=======
<<<<<<< HEAD
	public Long getPapildMuzika() {
=======
	public String getPapildMuzika() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildMuzika;
	}



<<<<<<< HEAD
	public void setPapildMuzika(Long papildMuzika) {
=======
<<<<<<< HEAD
	public void setPapildMuzika(Long papildMuzika) {
=======
	public void setPapildMuzika(String papildMuzika) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildMuzika = papildMuzika;
	}



<<<<<<< HEAD
	public Long getPapildInformatika() {
=======
<<<<<<< HEAD
	public Long getPapildInformatika() {
=======
	public String getPapildInformatika() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildInformatika;
	}



<<<<<<< HEAD
	public void setPapildInformatika(Long papildInformatika) {
=======
<<<<<<< HEAD
	public void setPapildInformatika(Long papildInformatika) {
=======
	public void setPapildInformatika(String papildInformatika) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildInformatika = papildInformatika;
	}



<<<<<<< HEAD
	public Long getPapildLietuviugimtoji() {
=======
<<<<<<< HEAD
	public Long getPapildLietuviugimtoji() {
=======
	public String getPapildLietuviugimtoji() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildLietuviugimtoji;
	}



<<<<<<< HEAD
	public void setPapildLietuviugimtoji(Long papildLietuviugimtoji) {
=======
<<<<<<< HEAD
	public void setPapildLietuviugimtoji(Long papildLietuviugimtoji) {
=======
	public void setPapildLietuviugimtoji(String papildLietuviugimtoji) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildLietuviugimtoji = papildLietuviugimtoji;
	}



<<<<<<< HEAD
	public Long getPapildLietuviuvalstybine() {
=======
<<<<<<< HEAD
	public Long getPapildLietuviuvalstybine() {
=======
	public String getPapildLietuviuvalstybine() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildLietuviuvalstybine;
	}



<<<<<<< HEAD
	public void setPapildLietuviuvalstybine(Long papildLietuviuvalstybine) {
=======
<<<<<<< HEAD
	public void setPapildLietuviuvalstybine(Long papildLietuviuvalstybine) {
=======
	public void setPapildLietuviuvalstybine(String papildLietuviuvalstybine) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildLietuviuvalstybine = papildLietuviuvalstybine;
	}



<<<<<<< HEAD
	public Long getPapildUzskalba() {
=======
<<<<<<< HEAD
	public Long getPapildUzskalba() {
=======
	public String getPapildUzskalba() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildUzskalba;
	}



<<<<<<< HEAD
	public void setPapildUzskalba(Long papildUzskalba) {
=======
<<<<<<< HEAD
	public void setPapildUzskalba(Long papildUzskalba) {
=======
	public void setPapildUzskalba(String papildUzskalba) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildUzskalba = papildUzskalba;
	}



<<<<<<< HEAD
	public Long getPapildIstorija() {
=======
<<<<<<< HEAD
	public Long getPapildIstorija() {
=======
	public String getPapildIstorija() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildIstorija;
	}



<<<<<<< HEAD
	public void setPapildIstorija(Long papildIstorija) {
=======
<<<<<<< HEAD
	public void setPapildIstorija(Long papildIstorija) {
=======
	public void setPapildIstorija(String papildIstorija) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildIstorija = papildIstorija;
	}



<<<<<<< HEAD
	public Long getPapildMatematika() {
=======
<<<<<<< HEAD
	public Long getPapildMatematika() {
=======
	public String getPapildMatematika() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildMatematika;
	}



<<<<<<< HEAD
	public void setPapildMatematika(Long papildMatematika) {
=======
<<<<<<< HEAD
	public void setPapildMatematika(Long papildMatematika) {
=======
	public void setPapildMatematika(String papildMatematika) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildMatematika = papildMatematika;
	}



<<<<<<< HEAD
	public Long getPapildBiologija() {
=======
<<<<<<< HEAD
	public Long getPapildBiologija() {
=======
	public String getPapildBiologija() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildBiologija;
	}



<<<<<<< HEAD
	public void setPapildBiologija(Long papildBiologija) {
=======
<<<<<<< HEAD
	public void setPapildBiologija(Long papildBiologija) {
=======
	public void setPapildBiologija(String papildBiologija) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildBiologija = papildBiologija;
	}



<<<<<<< HEAD
	public Long getPapildChemija() {
=======
<<<<<<< HEAD
	public Long getPapildChemija() {
=======
	public String getPapildChemija() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildChemija;
	}



<<<<<<< HEAD
	public void setPapildChemija(Long papildChemija) {
=======
<<<<<<< HEAD
	public void setPapildChemija(Long papildChemija) {
=======
	public void setPapildChemija(String papildChemija) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildChemija = papildChemija;
	}



<<<<<<< HEAD
	public Long getPapildFizika() {
=======
<<<<<<< HEAD
	public Long getPapildFizika() {
=======
	public String getPapildFizika() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildFizika;
	}



<<<<<<< HEAD
	public void setPapildFizika(Long papildFizika) {
=======
<<<<<<< HEAD
	public void setPapildFizika(Long papildFizika) {
=======
	public void setPapildFizika(String papildFizika) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildFizika = papildFizika;
	}



<<<<<<< HEAD
	public Long getPapildBiologijamod1() {
=======
<<<<<<< HEAD
	public Long getPapildBiologijamod1() {
=======
	public String getPapildBiologijamod1() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildBiologijamod1;
	}



<<<<<<< HEAD
	public void setPapildBiologijamod1(Long papildBiologijamod1) {
=======
<<<<<<< HEAD
	public void setPapildBiologijamod1(Long papildBiologijamod1) {
=======
	public void setPapildBiologijamod1(String papildBiologijamod1) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildBiologijamod1 = papildBiologijamod1;
	}



<<<<<<< HEAD
	public Long getPapildChemijamod() {
=======
<<<<<<< HEAD
	public Long getPapildChemijamod() {
=======
	public String getPapildChemijamod() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildChemijamod;
	}



<<<<<<< HEAD
	public void setPapildChemijamod(Long papildChemijamod) {
=======
<<<<<<< HEAD
	public void setPapildChemijamod(Long papildChemijamod) {
=======
	public void setPapildChemijamod(String papildChemijamod) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildChemijamod = papildChemijamod;
	}



<<<<<<< HEAD
	public Long getPapildBiologijamod2() {
=======
<<<<<<< HEAD
	public Long getPapildBiologijamod2() {
=======
	public String getPapildBiologijamod2() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildBiologijamod2;
	}



<<<<<<< HEAD
	public void setPapildBiologijamod2(Long papildBiologijamod2) {
=======
<<<<<<< HEAD
	public void setPapildBiologijamod2(Long papildBiologijamod2) {
=======
	public void setPapildBiologijamod2(String papildBiologijamod2) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildBiologijamod2 = papildBiologijamod2;
	}



<<<<<<< HEAD
	public Long getPapildFizikamod1() {
=======
<<<<<<< HEAD
	public Long getPapildFizikamod1() {
=======
	public String getPapildFizikamod1() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildFizikamod1;
	}



<<<<<<< HEAD
	public void setPapildFizikamod1(Long papildFizikamod1) {
=======
<<<<<<< HEAD
	public void setPapildFizikamod1(Long papildFizikamod1) {
=======
	public void setPapildFizikamod1(String papildFizikamod1) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildFizikamod1 = papildFizikamod1;
	}



<<<<<<< HEAD
	public Long getPapildFizikamod2() {
=======
<<<<<<< HEAD
	public Long getPapildFizikamod2() {
=======
	public String getPapildFizikamod2() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildFizikamod2;
	}



<<<<<<< HEAD
	public void setPapildFizikamod2(Long papildFizikamod2) {
=======
<<<<<<< HEAD
	public void setPapildFizikamod2(Long papildFizikamod2) {
=======
	public void setPapildFizikamod2(String papildFizikamod2) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildFizikamod2 = papildFizikamod2;
	}



<<<<<<< HEAD
	public Long getPapildFizikamod3() {
=======
<<<<<<< HEAD
	public Long getPapildFizikamod3() {
=======
	public String getPapildFizikamod3() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildFizikamod3;
	}



<<<<<<< HEAD
	public void setPapildFizikamod3(Long papildFizikamod3) {
=======
<<<<<<< HEAD
	public void setPapildFizikamod3(Long papildFizikamod3) {
=======
	public void setPapildFizikamod3(String papildFizikamod3) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildFizikamod3 = papildFizikamod3;
	}



<<<<<<< HEAD
	public Long getPapildMatematikosmod1() {
=======
<<<<<<< HEAD
	public Long getPapildMatematikosmod1() {
=======
	public String getPapildMatematikosmod1() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildMatematikosmod1;
	}



<<<<<<< HEAD
	public void setPapildMatematikosmod1(Long papildMatematikosmod1) {
=======
<<<<<<< HEAD
	public void setPapildMatematikosmod1(Long papildMatematikosmod1) {
=======
	public void setPapildMatematikosmod1(String papildMatematikosmod1) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildMatematikosmod1 = papildMatematikosmod1;
	}



<<<<<<< HEAD
	public Long getPapildMatematikosmod2() {
=======
<<<<<<< HEAD
	public Long getPapildMatematikosmod2() {
=======
	public String getPapildMatematikosmod2() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildMatematikosmod2;
	}



<<<<<<< HEAD
	public void setPapildMatematikosmod2(Long papildMatematikosmod2) {
=======
<<<<<<< HEAD
	public void setPapildMatematikosmod2(Long papildMatematikosmod2) {
=======
	public void setPapildMatematikosmod2(String papildMatematikosmod2) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildMatematikosmod2 = papildMatematikosmod2;
	}



<<<<<<< HEAD
	public Long getPapildMatematikosmod3() {
=======
<<<<<<< HEAD
	public Long getPapildMatematikosmod3() {
=======
	public String getPapildMatematikosmod3() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return papildMatematikosmod3;
	}



<<<<<<< HEAD
	public void setPapildMatematikosmod3(Long papildMatematikosmod3) {
=======
<<<<<<< HEAD
	public void setPapildMatematikosmod3(Long papildMatematikosmod3) {
=======
	public void setPapildMatematikosmod3(String papildMatematikosmod3) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		this.papildMatematikosmod3 = papildMatematikosmod3;
	}




	
}