package lt.vtvpmc.ems.pw.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity

public class Form  implements Serializable {
		

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   
    private Long id;
   
    private Date date;
    private String gr;
  	private String grSpec;
  	
  	public String[] dok; 
    
	
	public Form () {
        
     }
    
    public Form (Date date, String gr, String grSpec, String []dok) {
    this.date =date;
    this.gr=gr;
    this.grSpec=grSpec;
    this.dok = dok;
    }

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getGr() {
		return gr;
	}

	public void setGr(String gr) {
		this.gr = gr;
	}

	public String getGrSpec() {
		return grSpec;
	}

	public void setGrSpec(String grSpec) {
		this.grSpec = grSpec;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
    

    public String[] getDokValue() {
    	
    	dok = new String [6];
    	dok[0]="Išsilavinimo dokumentas-Taip";
    	dok[1]="Sveikatos pažymėjimas-Taip";
    	dok[2]="Nuotraukos 3X4 (2-4 vnt.)-Taip";
    	dok[3]="Paso kopija (Asmens tapatybės kortelės kopija)-Taip";
    	dok[4]="Šauktinio liudijimas-Taip";
    	dok[5]="Stojamasis mokestis-Taip";
    	
    	
    	    			
		return dok;
	}

	public void setDok(String[] dok) {
		this.dok = dok;
	}

	public String[] getDok() {
		return dok;
	}

    
}