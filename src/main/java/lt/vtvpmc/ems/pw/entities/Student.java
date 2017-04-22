package lt.vtvpmc.ems.pw.entities;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.util.Date;


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
	
    
    public Student(String firstName, String lastName, String adress,String location, Date birthday,Long phone, String email,  String familyState ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location=location;
        this.adress = adress;
       this.birthday = birthday;
        this.email=email;
        this.familyState = familyState;
        this.phone = phone;

      
    }

   public String getLocation() {
		return location;
	}

	public void setLocation(String  location) {
		this.location = location;
	}

	public Date getBirthday() {
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
