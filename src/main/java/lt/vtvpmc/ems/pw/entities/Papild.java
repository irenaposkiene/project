
package lt.vtvpmc.ems.pw.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Papild implements Serializable {
		


	/**
    *
    */
   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   
   private Long id;
   
   private String name;
   private String surname;
     
    private Long rusukalba2;
    private Long angkalba2;
    private Long vokkalba2;
   
    private Long dizainas;
    private Long daile;
    private Long teatras;
    private Long muzika;
    private Long informatika;
   
    private Long lietuviugimtoji;
    private Long lietuviuvalstybine;
    private Long uzskalba;
    
    private Long istorija;
    private Long matematika;
    private Long biologija;
    private Long chemija;
    private Long fizika;
    
    private Long biologijamod1;
    private Long chemijamod;
    private Long biologijamod2;
    
    private Long fizikamod1;
    private Long fizikamod2;
    private Long fizikamod3;
    
    private Long matematikosmod1;
    private Long matematikosmod2;
    private Long matematikosmod3;
    
      
 
    public Papild () {
        
     }
    
    public Papild ( String name, String surname,Long rusukalba2, Long angkalba2, Long vokkalba2, Long dizainas, Long daile, Long teatras, Long muzika,
    		Long informatika, Long lietuviugimtoji, Long lietuviuvalstybine, Long uzskalba, Long istorija, Long matematika, Long biologija,
    		Long chemija, Long fizika, Long biologijamod1, Long chemijamod, Long biologijamod2, Long fizikamod1, Long fizikamod2, 
    		Long fizikamod3, Long matematikosmod1, Long matematikosmod2, Long matematikosmod3) {
    	this.name=name;
    	this.surname=surname;
    
    	this.rusukalba2=rusukalba2;
        this.angkalba2=angkalba2;
        this.vokkalba2=vokkalba2;
       
        this.dizainas=dizainas;
        this.daile=daile;
        this.teatras=teatras;
        this.muzika=muzika;
        this.informatika = informatika;
       
        this.lietuviugimtoji=lietuviugimtoji;
        this.lietuviuvalstybine=lietuviuvalstybine;
        this.uzskalba=uzskalba;
        
        this.istorija= istorija;
        this.matematika=matematika;
        this.biologija=biologija;
        this.chemija=chemija;
        this.fizika=fizika;
        
        this.biologijamod1=biologijamod1;
        this.chemijamod=chemijamod;
        this.biologijamod2=biologijamod2;
        
        this.fizikamod1=fizikamod1;
        this.fizikamod2=fizikamod2;
        this.fizikamod3=fizikamod3;
        
        this.matematikosmod1=matematikosmod1;
        this.matematikosmod2=matematikosmod2;
        this.matematikosmod3=matematikosmod3;
        
    } 
    	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Long getRusukalba2() {
		return rusukalba2;
	}

	public void setRusukalba2(Long rusukalba2) {
		this.rusukalba2 = rusukalba2;
	}

	public Long getAngkalba2() {
		return angkalba2;
	}

	public void setAngkalba2(Long angkalba2) {
		this.angkalba2 = angkalba2;
	}

	public Long getVokkalba2() {
		return vokkalba2;
	}

	public void setVokkalba2(Long vokkalba2) {
		this.vokkalba2 = vokkalba2;
	}

	public Long getDizainas() {
		return dizainas;
	}

	public void setDizainas(Long dizainas) {
		this.dizainas = dizainas;
	}

	public Long getDaile() {
		return daile;
	}

	public void setDaile(Long daile) {
		this.daile = daile;
	}

	public Long getTeatras() {
		return teatras;
	}

	public void setTeatras(Long teatras) {
		this.teatras = teatras;
	}

	public Long getMuzika() {
		return muzika;
	}

	public void setMuzika(Long muzika) {
		this.muzika = muzika;
	}

	public Long getInformatika() {
		return informatika;
	}

	public void setInformatika(Long informatika) {
		this.informatika = informatika;
	}

	public Long getLietuviugimtoji() {
		return lietuviugimtoji;
	}

	public void setLietuviugimtoji(Long lietuviugimtoji) {
		this.lietuviugimtoji = lietuviugimtoji;
	}

	public Long getLietuviuvalstybine() {
		return lietuviuvalstybine;
	}

	public void setLietuviuvalstybine(Long lietuviuvalstybine) {
		this.lietuviuvalstybine = lietuviuvalstybine;
	}

	public Long getUzskalba() {
		return uzskalba;
	}

	public void setUzskalba(Long uzskalba) {
		this.uzskalba = uzskalba;
	}

	public Long getIstorija() {
		return istorija;
	}

	public void setIstorija(Long istorija) {
		this.istorija = istorija;
	}

	public Long getMatematika() {
		return matematika;
	}

	public void setMatematika(Long matematika) {
		this.matematika = matematika;
	}

	public Long getBiologija() {
		return biologija;
	}

	public void setBiologija(Long biologija) {
		this.biologija = biologija;
	}

	public Long getChemija() {
		return chemija;
	}

	public void setChemija(Long chemija) {
		this.chemija = chemija;
	}

	public Long getFizika() {
		return fizika;
	}

	public void setFizika(Long fizika) {
		this.fizika = fizika;
	}

	public Long getBiologijamod1() {
		return biologijamod1;
	}

	public void setBiologijamod1(Long biologijamod1) {
		this.biologijamod1 = biologijamod1;
	}

	public Long getChemijamod() {
		return chemijamod;
	}

	public void setChemijamod(Long chemijamod) {
		this.chemijamod = chemijamod;
	}

	public Long getBiologijamod2() {
		return biologijamod2;
	}

	public void setBiologijamod2(Long biologijamod2) {
		this.biologijamod2 = biologijamod2;
	}

	public Long getFizikamod1() {
		return fizikamod1;
	}

	public void setFizikamod1(Long fizikamod1) {
		this.fizikamod1 = fizikamod1;
	}

	public Long getFizikamod2() {
		return fizikamod2;
	}

	public void setFizikamod2(Long fizikamod2) {
		this.fizikamod2 = fizikamod2;
	}

	public Long getFizikamod3() {
		return fizikamod3;
	}

	public void setFizikamod3(Long fizikamod3) {
		this.fizikamod3 = fizikamod3;
	}

	public Long getMatematikosmod1() {
		return matematikosmod1;
	}

	public void setMatematikosmod1(Long matematikosmod1) {
		this.matematikosmod1 = matematikosmod1;
	}

	public Long getMatematikosmod2() {
		return matematikosmod2;
	}

	public void setMatematikosmod2(Long matematikosmod2) {
		this.matematikosmod2 = matematikosmod2;
	}

	public Long getMatematikosmod3() {
		return matematikosmod3;
	}

	public void setMatematikosmod3(Long matematikosmod3) {
		this.matematikosmod3 = matematikosmod3;
	}

	
	
	
	
	
}

