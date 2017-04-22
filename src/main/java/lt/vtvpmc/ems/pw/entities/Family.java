package lt.vtvpmc.ems.pw.entities;

	
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class Family  implements Serializable {
		

	/**
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
<<<<<<< HEAD
=======
=======
    *
    */
   private static final long serialVersionUID = 1L;
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   
    private Long id;
   
    private String fatherName;
    private String fatherSurname;
  	private String fatherAdress;
  	private String fatherPhone;

  	private String motherName;
    private String motherSurname;
   	private String motherAdress;
  	private String motherPhone;
  	
  	private String patronName;
    private String patronSurname;
   	private String patronAdress;
  	private String patronPhone;
    
    public Family () {
        
     }
    
    public Family (String fatherName, String fatherSurname, String fatherAdress, String fatherPhone, String motherName, String motherSurname, String motherAdress, String motherPhone,String patronName, String patronSurname, String patronAdress, String patronPhone)
    {
    
    this.fatherName = fatherName;	
    this.fatherSurname = fatherSurname;
    this.fatherAdress = fatherAdress;
    this.fatherPhone=fatherPhone;
     
    this.motherName =motherName;
    this.motherSurname = motherSurname;
    this.motherAdress = motherAdress;
    this.motherPhone=motherPhone;
    
    this.patronName =patronName;
    this.patronSurname = patronSurname;
    this.patronAdress = patronAdress;
    this.patronPhone=patronPhone;
    
}
    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFatherSurname() {
		return fatherSurname;
	}

	public void setFatherSurname(String fatherSurname) {
		this.fatherSurname = fatherSurname;
	}

	public String getFatherAdress() {
		return fatherAdress;
	}

	public void setFatherAdress(String fatherAdress) {
		this.fatherAdress = fatherAdress;
	}

<<<<<<< HEAD
	
=======
<<<<<<< HEAD
	
=======
	public String getFatherPhone() {
		return fatherPhone;
	}

	public void setFatherPhone(String fatherPhone) {
		this.fatherPhone = fatherPhone;
	}
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherSurname() {
		return motherSurname;
	}

	public void setMotherSurname(String motherSurname) {
		this.motherSurname = motherSurname;
	}

	public String getMotherAdress() {
		return motherAdress;
	}

	public void setMotherAdress(String motherAdress) {
		this.motherAdress = motherAdress;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
	public String getMotherPhone() {
		return motherPhone;
	}

	public void setMotherPhone(String motherPhone) {
		this.motherPhone = motherPhone;
	}
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b

	public String getPatronName() {
		return patronName;
	}

	public void setPatronName(String patronName) {
		this.patronName = patronName;
	}

	public String getPatronSurname() {
		return patronSurname;
	}

	public void setPatronSurname(String patronSurname) {
		this.patronSurname = patronSurname;
	}

	public String getPatronAdress() {
		return patronAdress;
	}

	public void setPatronAdress(String patronAdress) {
		this.patronAdress = patronAdress;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
	public String getFatherPhone() {
		return fatherPhone;
	}

	public void setFatherPhone(String fatherPhone) {
		this.fatherPhone = fatherPhone;
	}

	public String getMotherPhone() {
		return motherPhone;
	}

	public void setMotherPhone(String motherPhone) {
		this.motherPhone = motherPhone;
	}

<<<<<<< HEAD
=======
=======
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
	public String getPatronPhone() {
		return patronPhone;
	}

	public void setPatronPhone(String patronPhone) {
		this.patronPhone = patronPhone;
	}

<<<<<<< HEAD


=======
<<<<<<< HEAD


=======
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
	

}