package lt.vtvpmc.ems.pw.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Student implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String firstName;
    
    private String lastName;

    private String adress;
    private String birthday;
    private String phone;
    private String email;
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
	private String location;
>>>>>>> 1185e82019f8820520119a8a3e6e326901be0227
>>>>>>> f499e96bd0070e8ecabf84d7f656c41af4e0c09a
>>>>>>> 0a11dcb9064815d1f707d4abde2a258d2d8ead79
>>>>>>> 42c18efbc6930cdc07ffd3061cc55d35468f39ef
 /*   private String school;
    private String schoolEndDate;*/
    private String familyState;
    
    
    public Student(String firstName, String lastName, String adress, String birthday,String phone, String email, /*String education, String school,*/ /*String schoolEndDate, */String familyState, String location ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location=location;
        this.adress = adress;
       this.birthday = birthday;
      /*  this.education =education;*/
        this.email=email;
        this.familyState = familyState;
        this.phone = phone;
 /*     this.school= school;*/
    /*  this.schoolEndDate =schoolEndDate;*/
      
    }

   public String getLocation() {
		return location;
	}

	public void setLocation(String  location) {
		this.location = location;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
/*
	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}*/

/*	public String getSchoolEndDate() {
		return schoolEndDate;
	}

	public void setSchoolEndDate(String schoolEndDate) {
		this.schoolEndDate = schoolEndDate;
	}*/

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
