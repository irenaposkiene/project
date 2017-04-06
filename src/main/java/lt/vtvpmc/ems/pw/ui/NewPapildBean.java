
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
    
    @Transactional
    public String save() {
        Papild papild = new Papild (papildName, papildSurname, papildRusukalba2, papildAngkalba2, papildVokkalba2, papildDizainas, papildDaile,
        	     papildTeatras, papildMuzika, papildInformatika, papildLietuviugimtoji, papildLietuviuvalstybine, papildUzskalba,
        	     papildIstorija, papildMatematika, papildBiologija, papildChemija, papildFizika, papildBiologijamod1, papildChemijamod, 
        	     papildBiologijamod2, papildFizikamod1, papildFizikamod2, papildFizikamod3, papildMatematikosmod1, papildMatematikosmod2, papildMatematikosmod3);
        	    
        		        	     
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



	public String getPapildRusukalba2() {
		return papildRusukalba2;
	}



	public void setPapildRusukalba2(String papildRusukalba2) {
		this.papildRusukalba2 = papildRusukalba2;
	}



	public String getPapildAngkalba2() {
		return papildAngkalba2;
	}



	public void setPapildAngkalba2(String papildAngkalba2) {
		this.papildAngkalba2 = papildAngkalba2;
	}



	public String getPapildVokkalba2() {
		return papildVokkalba2;
	}



	public void setPapildVokkalba2(String papildVokkalba2) {
		this.papildVokkalba2 = papildVokkalba2;
	}



	public String getPapildDizainas() {
		return papildDizainas;
	}



	public void setPapildDizainas(String papildDizainas) {
		this.papildDizainas = papildDizainas;
	}



	public String getPapildDaile() {
		return papildDaile;
	}



	public void setPapildDaile(String papildDaile) {
		this.papildDaile = papildDaile;
	}



	public String getPapildTeatras() {
		return papildTeatras;
	}



	public void setPapildTeatras(String papildTeatras) {
		this.papildTeatras = papildTeatras;
	}



	public String getPapildMuzika() {
		return papildMuzika;
	}



	public void setPapildMuzika(String papildMuzika) {
		this.papildMuzika = papildMuzika;
	}



	public String getPapildInformatika() {
		return papildInformatika;
	}



	public void setPapildInformatika(String papildInformatika) {
		this.papildInformatika = papildInformatika;
	}



	public String getPapildLietuviugimtoji() {
		return papildLietuviugimtoji;
	}



	public void setPapildLietuviugimtoji(String papildLietuviugimtoji) {
		this.papildLietuviugimtoji = papildLietuviugimtoji;
	}



	public String getPapildLietuviuvalstybine() {
		return papildLietuviuvalstybine;
	}



	public void setPapildLietuviuvalstybine(String papildLietuviuvalstybine) {
		this.papildLietuviuvalstybine = papildLietuviuvalstybine;
	}



	public String getPapildUzskalba() {
		return papildUzskalba;
	}



	public void setPapildUzskalba(String papildUzskalba) {
		this.papildUzskalba = papildUzskalba;
	}



	public String getPapildIstorija() {
		return papildIstorija;
	}



	public void setPapildIstorija(String papildIstorija) {
		this.papildIstorija = papildIstorija;
	}



	public String getPapildMatematika() {
		return papildMatematika;
	}



	public void setPapildMatematika(String papildMatematika) {
		this.papildMatematika = papildMatematika;
	}



	public String getPapildBiologija() {
		return papildBiologija;
	}



	public void setPapildBiologija(String papildBiologija) {
		this.papildBiologija = papildBiologija;
	}



	public String getPapildChemija() {
		return papildChemija;
	}



	public void setPapildChemija(String papildChemija) {
		this.papildChemija = papildChemija;
	}



	public String getPapildFizika() {
		return papildFizika;
	}



	public void setPapildFizika(String papildFizika) {
		this.papildFizika = papildFizika;
	}



	public String getPapildBiologijamod1() {
		return papildBiologijamod1;
	}



	public void setPapildBiologijamod1(String papildBiologijamod1) {
		this.papildBiologijamod1 = papildBiologijamod1;
	}



	public String getPapildChemijamod() {
		return papildChemijamod;
	}



	public void setPapildChemijamod(String papildChemijamod) {
		this.papildChemijamod = papildChemijamod;
	}



	public String getPapildBiologijamod2() {
		return papildBiologijamod2;
	}



	public void setPapildBiologijamod2(String papildBiologijamod2) {
		this.papildBiologijamod2 = papildBiologijamod2;
	}



	public String getPapildFizikamod1() {
		return papildFizikamod1;
	}



	public void setPapildFizikamod1(String papildFizikamod1) {
		this.papildFizikamod1 = papildFizikamod1;
	}



	public String getPapildFizikamod2() {
		return papildFizikamod2;
	}



	public void setPapildFizikamod2(String papildFizikamod2) {
		this.papildFizikamod2 = papildFizikamod2;
	}



	public String getPapildFizikamod3() {
		return papildFizikamod3;
	}



	public void setPapildFizikamod3(String papildFizikamod3) {
		this.papildFizikamod3 = papildFizikamod3;
	}



	public String getPapildMatematikosmod1() {
		return papildMatematikosmod1;
	}



	public void setPapildMatematikosmod1(String papildMatematikosmod1) {
		this.papildMatematikosmod1 = papildMatematikosmod1;
	}



	public String getPapildMatematikosmod2() {
		return papildMatematikosmod2;
	}



	public void setPapildMatematikosmod2(String papildMatematikosmod2) {
		this.papildMatematikosmod2 = papildMatematikosmod2;
	}



	public String getPapildMatematikosmod3() {
		return papildMatematikosmod3;
	}



	public void setPapildMatematikosmod3(String papildMatematikosmod3) {
		this.papildMatematikosmod3 = papildMatematikosmod3;
	}




	
}