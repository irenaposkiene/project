package lt.vtvpmc.ems.pw.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import javax.validation.constraints.NotNull;

import lt.vtvpmc.ems.pw.entities.Student;

import org.hibernate.validator.constraints.Length;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;

public class NewStudentBean {
	@NotNull
    @PersistenceContext
    private EntityManager entityManager;
	@NotNull @Length(min=5, max=15)
    private String studentFirstName;
    @NotNull @Length(min=5, max=30)
    private String studentLastName;
    private String studentAdress;
   private String studentLocation;

   @Temporal(TemporalType.DATE)
    private Date studentBirthday;
    private Long studentPhone;
    private String studentEmail;
    private String studentFamilyState;

	
	@Transactional
    public String save() {
        Student student = new Student(studentFirstName, studentLastName, studentAdress, studentLocation, studentBirthday, studentPhone, studentEmail,studentFamilyState );
        entityManager.persist(student);
        return "main";
    }
	
	 @Transactional
	  
	 public Student find( String name, String surname) {
		    TypedQuery<Student> query = entityManager.createQuery(
		        "SELECT c FROM Student c WHERE c.studentFirstName ="
		        + " :name and c.studentLastName = :surname ", Student.class);
		    return query.setParameter("name", name).setParameter("surname", surname).getSingleResult();
		  } 
	
    
    public String  getStudentLocation() {
		return studentLocation;
	}

	public void setStudentLocation(String  studentLocation) {
		this.studentLocation = studentLocation;
	}

	public Date getStudentBirthday() {
		return studentBirthday;
	}

	public void setStudentBirthday(Date studentBirthday) {
		this.studentBirthday = studentBirthday;
	}

	public Long getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(Long studentPhone) {
		this.studentPhone = studentPhone;
	}
	
	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentFamilyState() {
		return studentFamilyState;
	}

	public void setStudentFamilyState(String studentFamilyState) {
		this.studentFamilyState = studentFamilyState;
	}

	public String getStudentAdress() {
		return studentAdress;
	}

	public void setStudentAdress(String studentAdress) {
		this.studentAdress = studentAdress;
	}

	public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }


}
