package lt.vtvpmc.ems.pw.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.constraints.NotNull;

import lt.vtvpmc.ems.pw.entities.Student;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;

public class NewStudentBean {
	@NotNull
    @PersistenceContext
    private EntityManager entityManager;
    
    private String studentFirstName;
    private String studentLastName;
    private String studentAdress;
   private String studentLocation;
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
