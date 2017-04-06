
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
    
    private String tikyba;
    private String etika;
    
    private String lietkalba1;
    private String lietkalba2;
    private String gimtojirusu;
    private String gimtojilenku;
    
    private String angkalba;
    private String vokkalba;
    private String pranckalba;
    private String rusukalba;
    
    private String biologija;
    private String chemija;
    private String fizika;
    private String gamtosmokslai;
    
    private String istorija;
    private String geografija;
    private String socmokslai;
    
    private String matematika;
     
    private String kkultura;
    private String futbolas;
    private String krepsinis;
    
    
    
 
    public Plan () {
        
     }
    
    public Plan (String name, String surname, String tikyba, String etika, String lietkalba1, String lietkalba2, String gimtojirusu,
    String gimtojilenku, String angkalba, String vokkalba, String pranckalba, String rusukalba, String biologija, String chemija,
    String fizika, String gamtosmokslai, String istorija, String geografija, String socmokslai, String matematika, String kkultura,
    String futbolas, String krepsinis ) {
    
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

	public String getTikyba() {
		return tikyba;
	}

	public void setTikyba(String tikyba) {
		this.tikyba = tikyba;
	}

	public String getEtika() {
		return etika;
	}

	public void setEtika(String etika) {
		this.etika = etika;
	}

	public String getLietkalba1() {
		return lietkalba1;
	}

	public void setLietkalba1(String lietkalba1) {
		this.lietkalba1 = lietkalba1;
	}

	public String getLietkalba2() {
		return lietkalba2;
	}

	public void setLietkalba2(String lietkalba2) {
		this.lietkalba2 = lietkalba2;
	}

	public String getGimtojirusu() {
		return gimtojirusu;
	}

	public void setGimtojirusu(String gimtojirusu) {
		this.gimtojirusu = gimtojirusu;
	}

	public String getGimtojilenku() {
		return gimtojilenku;
	}

	public void setGimtojilenku(String gimtojilenku) {
		this.gimtojilenku = gimtojilenku;
	}

	public String getAngkalba() {
		return angkalba;
	}

	public void setAngkalba(String angkalba) {
		this.angkalba = angkalba;
	}

	public String getVokkalba() {
		return vokkalba;
	}

	public void setVokkalba(String vokkalba) {
		this.vokkalba = vokkalba;
	}

	public String getPranckalba() {
		return pranckalba;
	}

	public void setPranckalba(String pranckalba) {
		this.pranckalba = pranckalba;
	}

	public String getRusukalba() {
		return rusukalba;
	}

	public void setRusukalba(String rusukalba) {
		this.rusukalba = rusukalba;
	}

	public String getBiologija() {
		return biologija;
	}

	public void setBiologija(String biologija) {
		this.biologija = biologija;
	}

	public String getChemija() {
		return chemija;
	}

	public void setChemija(String chemija) {
		this.chemija = chemija;
	}

	public String getFizika() {
		return fizika;
	}

	public void setFizika(String fizika) {
		this.fizika = fizika;
	}

	public String getGamtosmokslai() {
		return gamtosmokslai;
	}

	public void setGamtosmokslai(String gamtosmokslai) {
		this.gamtosmokslai = gamtosmokslai;
	}

	public String getIstorija() {
		return istorija;
	}

	public void setIstorija(String istorija) {
		this.istorija = istorija;
	}

	public String getGeografija() {
		return geografija;
	}

	public void setGeografija(String geografija) {
		this.geografija = geografija;
	}

	public String getSocmokslai() {
		return socmokslai;
	}

	public void setSocmokslai(String socmokslai) {
		this.socmokslai = socmokslai;
	}

	public String getMatematika() {
		return matematika;
	}

	public void setMatematika(String matematika) {
		this.matematika = matematika;
	}

	public String getKkultura() {
		return kkultura;
	}

	public void setKkultura(String kkultura) {
		this.kkultura = kkultura;
	}

	public String getFutbolas() {
		return futbolas;
	}

	public void setFutbolas(String futbolas) {
		this.futbolas = futbolas;
	}

	public String getKrepsinis() {
		return krepsinis;
	}

	public void setKrepsinis(String krepsinis) {
		this.krepsinis = krepsinis;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	
	
	
	
	
}

