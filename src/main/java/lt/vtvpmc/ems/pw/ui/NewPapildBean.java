
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



	public Long getPapildRusukalba2() {
		return papildRusukalba2;
	}



	public void setPapildRusukalba2(Long papildRusukalba2) {
		this.papildRusukalba2 = papildRusukalba2;
	}



	public Long getPapildAngkalba2() {
		return papildAngkalba2;
	}



	public void setPapildAngkalba2(Long papildAngkalba2) {
		this.papildAngkalba2 = papildAngkalba2;
	}



	public Long getPapildVokkalba2() {
		return papildVokkalba2;
	}



	public void setPapildVokkalba2(Long papildVokkalba2) {
		this.papildVokkalba2 = papildVokkalba2;
	}



	public Long getPapildDizainas() {
		return papildDizainas;
	}



	public void setPapildDizainas(Long papildDizainas) {
		this.papildDizainas = papildDizainas;
	}



	public Long getPapildDaile() {
		return papildDaile;
	}



	public void setPapildDaile(Long papildDaile) {
		this.papildDaile = papildDaile;
	}



	public Long getPapildTeatras() {
		return papildTeatras;
	}



	public void setPapildTeatras(Long papildTeatras) {
		this.papildTeatras = papildTeatras;
	}



	public Long getPapildMuzika() {
		return papildMuzika;
	}



	public void setPapildMuzika(Long papildMuzika) {
		this.papildMuzika = papildMuzika;
	}



	public Long getPapildInformatika() {
		return papildInformatika;
	}



	public void setPapildInformatika(Long papildInformatika) {
		this.papildInformatika = papildInformatika;
	}



	public Long getPapildLietuviugimtoji() {
		return papildLietuviugimtoji;
	}



	public void setPapildLietuviugimtoji(Long papildLietuviugimtoji) {
		this.papildLietuviugimtoji = papildLietuviugimtoji;
	}



	public Long getPapildLietuviuvalstybine() {
		return papildLietuviuvalstybine;
	}



	public void setPapildLietuviuvalstybine(Long papildLietuviuvalstybine) {
		this.papildLietuviuvalstybine = papildLietuviuvalstybine;
	}



	public Long getPapildUzskalba() {
		return papildUzskalba;
	}



	public void setPapildUzskalba(Long papildUzskalba) {
		this.papildUzskalba = papildUzskalba;
	}



	public Long getPapildIstorija() {
		return papildIstorija;
	}



	public void setPapildIstorija(Long papildIstorija) {
		this.papildIstorija = papildIstorija;
	}



	public Long getPapildMatematika() {
		return papildMatematika;
	}



	public void setPapildMatematika(Long papildMatematika) {
		this.papildMatematika = papildMatematika;
	}



	public Long getPapildBiologija() {
		return papildBiologija;
	}



	public void setPapildBiologija(Long papildBiologija) {
		this.papildBiologija = papildBiologija;
	}



	public Long getPapildChemija() {
		return papildChemija;
	}



	public void setPapildChemija(Long papildChemija) {
		this.papildChemija = papildChemija;
	}



	public Long getPapildFizika() {
		return papildFizika;
	}



	public void setPapildFizika(Long papildFizika) {
		this.papildFizika = papildFizika;
	}



	public Long getPapildBiologijamod1() {
		return papildBiologijamod1;
	}



	public void setPapildBiologijamod1(Long papildBiologijamod1) {
		this.papildBiologijamod1 = papildBiologijamod1;
	}



	public Long getPapildChemijamod() {
		return papildChemijamod;
	}



	public void setPapildChemijamod(Long papildChemijamod) {
		this.papildChemijamod = papildChemijamod;
	}



	public Long getPapildBiologijamod2() {
		return papildBiologijamod2;
	}



	public void setPapildBiologijamod2(Long papildBiologijamod2) {
		this.papildBiologijamod2 = papildBiologijamod2;
	}



	public Long getPapildFizikamod1() {
		return papildFizikamod1;
	}



	public void setPapildFizikamod1(Long papildFizikamod1) {
		this.papildFizikamod1 = papildFizikamod1;
	}



	public Long getPapildFizikamod2() {
		return papildFizikamod2;
	}



	public void setPapildFizikamod2(Long papildFizikamod2) {
		this.papildFizikamod2 = papildFizikamod2;
	}



	public Long getPapildFizikamod3() {
		return papildFizikamod3;
	}



	public void setPapildFizikamod3(Long papildFizikamod3) {
		this.papildFizikamod3 = papildFizikamod3;
	}



	public Long getPapildMatematikosmod1() {
		return papildMatematikosmod1;
	}



	public void setPapildMatematikosmod1(Long papildMatematikosmod1) {
		this.papildMatematikosmod1 = papildMatematikosmod1;
	}



	public Long getPapildMatematikosmod2() {
		return papildMatematikosmod2;
	}



	public void setPapildMatematikosmod2(Long papildMatematikosmod2) {
		this.papildMatematikosmod2 = papildMatematikosmod2;
	}



	public Long getPapildMatematikosmod3() {
		return papildMatematikosmod3;
	}



	public void setPapildMatematikosmod3(Long papildMatematikosmod3) {
		this.papildMatematikosmod3 = papildMatematikosmod3;
	}




	
}