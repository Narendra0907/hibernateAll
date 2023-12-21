package Com.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Mobiles {

	@Id
	@GeneratedValue
	private int mobilesid;
	private String mobilename;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="FKMID")
	private Employee emp_loyee;
	
	public Employee getEmp_loyee() {
		return emp_loyee;
	}
	public void setEmp_loyee(Employee emp_loyee) {
		this.emp_loyee = emp_loyee;
	}
	@Override
	public String toString() {
		return "Mobiles [mobilesid=" + mobilesid + ", mobilename=" + mobilename + "]";
	}
	public int getMobilesid() {
		return mobilesid;
	}
	public void setMobilesid(int mobilesid) {
		this.mobilesid = mobilesid;
	}
	public String getMobilename() {
		return mobilename;
	}
	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}
	
	
}
