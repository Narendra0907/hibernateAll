package Com.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class AdharCard {

	@Id
	@GeneratedValue
	private int adharid;
	private int adharnumber;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="FkAID")
	private Employee emp;
	public int getAdharid() {
		return adharid;
	}
	public void setAdharid(int adharid) {
		this.adharid = adharid;
	}
	public int getAdharnumber() {
		return adharnumber;
	}
	public void setAdharnumber(int adharnumber) {
		this.adharnumber = adharnumber;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "AdharCard [adharid=" + adharid + ", adharnumber=" + adharnumber + ", emp=" + emp + "]";
	}
}
