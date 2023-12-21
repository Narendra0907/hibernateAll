package Com.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Course {

	@Id
	@GeneratedValue
	private int courseid;
	private String cname;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="emp_course",
	           joinColumns= {@JoinColumn(name="fkcid")},
			    inverseJoinColumns= {@JoinColumn(name="fkeid")}	)
	private List<Employee> empe;
	
	
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Employee> getEmp() {
		return empe;
	}
	public void setEmp(List<Employee> emp) {
		this.empe = emp;
	}
	
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", cname=" + cname + ", emp=" + empe + "]";
	}
	
	
}
