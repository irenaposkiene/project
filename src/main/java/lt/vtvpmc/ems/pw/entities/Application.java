package lt.vtvpmc.ems.pw.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Application implements Serializable {
		

	/**
    *
    */
   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   
   private Long id;
   
    private String nr;
    private String date;
  	private String group;
    private String groupId;
    
<<<<<<< HEAD
    public boolean dok;
    
=======
>>>>>>> 304b62ab939c2594413a624e1d50b2852d64a2a4
    public Application () {
        
     }
    
<<<<<<< HEAD
    public Application (String nr, String date, String group, String groupId, boolean dok) {
=======
    public Application (String nr, String date, String group, String groupId) {
>>>>>>> 304b62ab939c2594413a624e1d50b2852d64a2a4
    
    this.nr = nr;	
    this.date = date;
    this.group = group;
    this.date=date;
<<<<<<< HEAD
    this.dok=dok;
=======
>>>>>>> 304b62ab939c2594413a624e1d50b2852d64a2a4
     
}


<<<<<<< HEAD
	public boolean isDok() {
		return dok;
	}

	public void setDok(boolean dok) {
		this.dok = dok;
	}

=======
>>>>>>> 304b62ab939c2594413a624e1d50b2852d64a2a4
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNr() {
		return nr;
	}


	public void setNr(String nr) {
		this.nr = nr;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getGroup() {
		return group;
	}


	public void setGroup(String group) {
		this.group = group;
	}


	public String getGroupId() {
		return groupId;
	}


	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}


}
