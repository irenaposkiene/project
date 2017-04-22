package lt.vtvpmc.ems.pw.entities;
<<<<<<< HEAD
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
=======


>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.util.Date;
<<<<<<< HEAD

=======
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b

@Entity
public class Student implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
   
    @NotNull @Length(min=5, max=15)
    private String firstName;
    @NotNull @Length(min=5, max=30)  
    private String lastName;

    private String adress;
<<<<<<< HEAD
=======
    private Date birthday;
    private Long phone;
    private String email;
<<<<<<< HEAD
 	private String location;
	private String familyState;
	  
    
    
    public Student(String firstName, String lastName, String adress,String location, Date birthday,Long phone, String email,  String familyState ) {
=======
  /* private String education;*/
<<<<<<< HEAD
	private String  location;
	
=======
<<<<<<< HEAD
	private String  location;
	
=======
<<<<<<< HEAD
	private String  location;
	
=======
<<<<<<< HEAD
	private String  location;
	
=======
<<<<<<< HEAD
	private String  location;
	
=======
<<<<<<< HEAD
	private String  location;
	
=======
	private String location;
>>>>>>> 1185e82019f8820520119a8a3e6e326901be0227
>>>>>>> f499e96bd0070e8ecabf84d7f656c41af4e0c09a
>>>>>>> 0a11dcb9064815d1f707d4abde2a258d2d8ead79
>>>>>>> 42c18efbc6930cdc07ffd3061cc55d35468f39ef
>>>>>>> 64521b49a6d5b9d17857d31512a30ef70c710707
>>>>>>> 304b62ab939c2594413a624e1d50b2852d64a2a4
 /*   private String school;
    private String schoolEndDate;*/
    private String familyState;
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
    
    @Temporal(TemporalType.DATE)
    private Date birthday;
    private Long phone;
    private String email;
 	private String location;
	private String familyState;
	  

	@OneToOne 
	public Education education;
		
	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

	public Form getForm() {
		return form;
	}

	public void setForm(Form form) {
		this.form = form;
	}

	public Additional getAdditional() {
		return additional;
	}

	public void setAdditional(Additional additional) {
		this.additional = additional;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Papild getPapild() {
		return papild;
	}

	public void setPapild(Papild papild) {
		this.papild = papild;
	}

	@OneToOne 
	public Family family;
		
	@OneToOne 
	public Form form;
	
	@OneToOne 
	public Additional additional;
	
	@OneToOne 
	public Plan plan;
	
	@OneToOne 
	public Papild papild;
	
    
<<<<<<< HEAD
    public Student(String firstName, String lastName, String adress,String location, Date birthday,Long phone, String email,  String familyState ) {
=======
    public Student(String firstName, String lastName, String adress, String birthday,String phone, String email, /*String education, String school,*/ /*String schoolEndDate, */String familyState, String location ) {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
        this.firstName = firstName;
        this.lastName = lastName;
        this.location=location;
        this.adress = adress;
       this.birthday = birthday;
        this.email=email;
        this.familyState = familyState;
        this.phone = phone;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
 /*     this.school= school;*/
    /*  this.schoolEndDate =schoolEndDate;*/
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
      
    }

   public String getLocation() {
		return location;
	}

	public void setLocation(String  location) {
		this.location = location;
	}

<<<<<<< HEAD
	public Date getBirthday() {
=======
<<<<<<< HEAD
	public Date getBirthday() {
=======
	public String getBirthday() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFamilyState() {
		return familyState;
	}

	public void setFamilyState(String familyState) {
		this.familyState = familyState;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
