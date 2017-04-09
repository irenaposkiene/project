package lt.vtvpmc.ems.pw.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Additional implements Serializable {
		


	/**
    *
    */
   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   
   private Long id;
   
    private String hostel;
    private String howknow;
  	private String refuce;
 
    public Additional () {
        
     }
    
    public Additional (String hostel, String howknow, String refuce) {
    this.hostel = hostel;
    this.howknow=howknow;
    this.refuce= refuce;
    
     
}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getHostel() {
		return hostel;
	}

	public void setHostel(String hostel) {
		this.hostel = hostel;
	}

	public String getHowknow() {
		return howknow;
	}

	public void setHowknow(String howknow) {
		this.howknow = howknow;
	}

	public String getRefuce() {
		return refuce;
	}

	public void setRefuce(String refuce) {
		this.refuce = refuce;
	}
	
	
	
	
}

