package lt.vtvpmc.ems.pw.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
<<<<<<< HEAD
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
=======
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
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
<<<<<<< HEAD

   @Temporal(TemporalType.DATE)
    private Date studentBirthday;
    private Long studentPhone;
    private String studentEmail;
    private String studentFamilyState;

=======
<<<<<<< HEAD
    private Date studentBirthday;
    private Long studentPhone;
=======
    private String studentBirthday;
    private String studentPhone;
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
    private String studentEmail;
    private String studentFamilyState;

<<<<<<< HEAD
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
	
	@Transactional
    public String save() {
        Student student = new Student(studentFirstName, studentLastName, studentAdress, studentLocation, studentBirthday, studentPhone, studentEmail,studentFamilyState );
<<<<<<< HEAD
=======
=======
   
	@Transactional
    public String save() {
        Student student = new Student(studentFirstName, studentLastName, studentAdress, studentBirthday, studentEmail,  studentPhone, /*, studentEducation, studentSchool, studentSchoolEndDate, */studentFamilyState, studentLocation );
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
        entityManager.persist(student);
        return "main";
    }
	
<<<<<<< HEAD
	 @Transactional
	  
	 public Student find( String name, String surname) {
		    TypedQuery<Student> query = entityManager.createQuery(
		        "SELECT c FROM Student c WHERE c.studentFirstName ="
		        + " :name and c.studentLastName = :surname ", Student.class);
		    return query.setParameter("name", name).setParameter("surname", surname).getSingleResult();
		  } 
	
    
    public String  getStudentLocation() {
=======
	
	
    
<<<<<<< HEAD
    public String  getStudentLocation() {
=======
<<<<<<< HEAD
    public String  getStudentLocation() {
=======
<<<<<<< HEAD
    public String  getStudentLocation() {
=======
<<<<<<< HEAD
    public String  getStudentLocation() {
=======
<<<<<<< HEAD
    public String  getStudentLocation() {
=======
<<<<<<< HEAD
    public String  getStudentLocation() {
=======
<<<<<<< HEAD
    public String  getStudentLocation() {
=======
    public String getStudentLocation() {
>>>>>>> 1185e82019f8820520119a8a3e6e326901be0227
>>>>>>> f499e96bd0070e8ecabf84d7f656c41af4e0c09a
>>>>>>> 0a11dcb9064815d1f707d4abde2a258d2d8ead79
>>>>>>> 42c18efbc6930cdc07ffd3061cc55d35468f39ef
>>>>>>> 64521b49a6d5b9d17857d31512a30ef70c710707
>>>>>>> 304b62ab939c2594413a624e1d50b2852d64a2a4
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
		return studentLocation;
	}

	public void setStudentLocation(String  studentLocation) {
		this.studentLocation = studentLocation;
	}

<<<<<<< HEAD
	public Date getStudentBirthday() {
=======
<<<<<<< HEAD
	public Date getStudentBirthday() {
=======
	public String getStudentBirthday() {
>>>>>>> 7aa17709ddedcaad047f27d31a7764f456dc0740
>>>>>>> 021d6bec3bd85b872daf143e539576d34408991b
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
