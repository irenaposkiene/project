package lt.vtvpmc.ems.pw.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Education.class)
public abstract class Education_ {

	public static volatile SingularAttribute<Education, String> institution;
	public static volatile SingularAttribute<Education, String> education;
	public static volatile SingularAttribute<Education, String> school;
	public static volatile SingularAttribute<Education, String> specialization;
	public static volatile SingularAttribute<Education, Date> schoolEndDate;
	public static volatile SingularAttribute<Education, String> institutionType;
	public static volatile SingularAttribute<Education, Long> id;
	public static volatile SingularAttribute<Education, Date> institutionEndDate;

}

