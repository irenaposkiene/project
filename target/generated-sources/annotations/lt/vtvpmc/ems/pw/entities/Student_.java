package lt.vtvpmc.ems.pw.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Student.class)
public abstract class Student_ {

	public static volatile SingularAttribute<Student, Date> birthday;
	public static volatile SingularAttribute<Student, String> lastName;
	public static volatile SingularAttribute<Student, Education> education;
	public static volatile SingularAttribute<Student, Additional> additional;
	public static volatile SingularAttribute<Student, Papild> papild;
	public static volatile SingularAttribute<Student, String> adress;
	public static volatile SingularAttribute<Student, String> firstName;
	public static volatile SingularAttribute<Student, Form> form;
	public static volatile SingularAttribute<Student, Long> phone;
	public static volatile SingularAttribute<Student, String> familyState;
	public static volatile SingularAttribute<Student, String> location;
	public static volatile SingularAttribute<Student, Long> id;
	public static volatile SingularAttribute<Student, Family> family;
	public static volatile SingularAttribute<Student, Plan> plan;
	public static volatile SingularAttribute<Student, String> email;

}

