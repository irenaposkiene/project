
package lt.vtvpmc.ems.pw.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Plan implements Serializable {
		


	/**
    *
    */
   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   
   private Long id;
   
    private String name;
    private String surname;
    
    private Long tikyba;
    private Long etika;
    
    private Long lietkalba1;
    private Long lietkalba2;
    private Long gimtojirusu;
    private Long gimtojilenku;
    
    private Long angkalba;
    private Long vokkalba;
    private Long pranckalba;
    private Long rusukalba;
    
    private Long biologija;
    private Long chemija;
    private Long fizika;
    private Long gamtosmokslai;
    
    private Long istorija;
    private Long geografija;
    private Long socmokslai;
    
    private Long matematika;
     
    private Long kkultura;
    private Long futbolas;
    private Long krepsinis;
    
    
    
 
    public Plan () {
        
     }
    
    public Plan (String name, String surname, Long tikyba, Long etika, Long lietkalba1, Long lietkalba2, Long gimtojirusu,
    Long gimtojilenku, Long angkalba, Long vokkalba, Long pranckalba, Long rusukalba, Long biologija, Long chemija,
    Long fizika, Long gamtosmokslai, Long istorija, Long geografija, Long socmokslai, Long matematika, Long kkultura,
    Long futbolas, Long krepsinis ) {
    
    	this.name =name;
    	this.surname = surname;
    	this.tikyba = tikyba;
    	this.etika = etika;
    	this.lietkalba1= lietkalba1;
    	this.lietkalba2=lietkalba2;
    	this.gimtojirusu= gimtojirusu;
    	this.gimtojilenku = gimtojilenku;
    	this.angkalba = angkalba;
    	this.vokkalba= vokkalba;
    	this.pranckalba =pranckalba;
    	this.rusukalba = rusukalba;
    	this.biologija = biologija;
    	this.chemija = chemija;
    	this.fizika = fizika;
    	this.gamtosmokslai = gamtosmokslai;
    	this.istorija = istorija;
    	this.geografija= geografija;
    	this.socmokslai = socmokslai;
    	this.matematika= matematika;
    	this.kkultura =kkultura;
    	this.futbolas= futbolas;
    	this.krepsinis=krepsinis;
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

	public Long getTikyba() {
		return tikyba;
	}

	public void setTikyba(Long tikyba) {
		this.tikyba = tikyba;
	}

	public Long getEtika() {
		return etika;
	}

	public void setEtika(Long etika) {
		this.etika = etika;
	}

	public Long getLietkalba1() {
		return lietkalba1;
	}

	public void setLietkalba1(Long lietkalba1) {
		this.lietkalba1 = lietkalba1;
	}

	public Long getLietkalba2() {
		return lietkalba2;
	}

	public void setLietkalba2(Long lietkalba2) {
		this.lietkalba2 = lietkalba2;
	}

	public Long getGimtojirusu() {
		return gimtojirusu;
	}

	public void setGimtojirusu(Long gimtojirusu) {
		this.gimtojirusu = gimtojirusu;
	}

	public Long getGimtojilenku() {
		return gimtojilenku;
	}

	public void setGimtojilenku(Long gimtojilenku) {
		this.gimtojilenku = gimtojilenku;
	}

	public Long getAngkalba() {
		return angkalba;
	}

	public void setAngkalba(Long angkalba) {
		this.angkalba = angkalba;
	}

	public Long getVokkalba() {
		return vokkalba;
	}

	public void setVokkalba(Long vokkalba) {
		this.vokkalba = vokkalba;
	}

	public Long getPranckalba() {
		return pranckalba;
	}

	public void setPranckalba(Long pranckalba) {
		this.pranckalba = pranckalba;
	}

	public Long getRusukalba() {
		return rusukalba;
	}

	public void setRusukalba(Long rusukalba) {
		this.rusukalba = rusukalba;
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

	public Long getGamtosmokslai() {
		return gamtosmokslai;
	}

	public void setGamtosmokslai(Long gamtosmokslai) {
		this.gamtosmokslai = gamtosmokslai;
	}

	public Long getIstorija() {
		return istorija;
	}

	public void setIstorija(Long istorija) {
		this.istorija = istorija;
	}

	public Long getGeografija() {
		return geografija;
	}

	public void setGeografija(Long geografija) {
		this.geografija = geografija;
	}

	public Long getSocmokslai() {
		return socmokslai;
	}

	public void setSocmokslai(Long socmokslai) {
		this.socmokslai = socmokslai;
	}

	public Long getMatematika() {
		return matematika;
	}

	public void setMatematika(Long matematika) {
		this.matematika = matematika;
	}

	public Long getKkultura() {
		return kkultura;
	}

	public void setKkultura(Long kkultura) {
		this.kkultura = kkultura;
	}

	public Long getFutbolas() {
		return futbolas;
	}

	public void setFutbolas(Long futbolas) {
		this.futbolas = futbolas;
	}

	public Long getKrepsinis() {
		return krepsinis;
	}

	public void setKrepsinis(Long krepsinis) {
		this.krepsinis = krepsinis;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	
	
	
	
	
}

