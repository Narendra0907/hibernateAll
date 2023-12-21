package Com.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int empno;
	private String empname;
	private double empsal;
	@OneToOne(cascade=CascadeType.ALL,mappedBy="emp")
	
	private AdharCard adhar_card;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="emp_loyee")

	private List<Mobiles> mobiles;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="emp_course",
	           joinColumns= {@JoinColumn(name="fkeid")},
			    inverseJoinColumns= {@JoinColumn(name="fkcid")}	)
	private List<Course> cou;
	
	
	public List<Course> getCou() {
		return cou;
	}
	public void setCou(List<Course> cou) {
		this.cou = cou;
	}
	public List<Mobiles> getMobiles() {
		return mobiles;
	}
	public void setMobiles(List<Mobiles> mobiles) {
		this.mobiles = mobiles;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	public AdharCard getAdhar_card() {
		return adhar_card;
	}
	public void setAdhar_card(AdharCard adhar_card) {
		this.adhar_card = adhar_card;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", empsal=" + empsal + ", adhar_card=" + adhar_card
				+ "]";
	}
}
