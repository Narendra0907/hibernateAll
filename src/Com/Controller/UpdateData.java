package Com.Controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Com.Entity.AdharCard;
import Com.Entity.Course;
import Com.Entity.Employee;
import Com.Entity.Mobiles;
public class UpdateData {
	public static void updateEmployee(int empno) {
		Session s = HibConnection.getSession();
		Transaction t = s.beginTransaction();
		Employee e=(Employee) s.get(Employee.class, empno);
		e.setEmpname("rajusir");
		s.update(e);
		t.commit();
		s.close();
	}
	public static void updateAdharCard(int adharid) {
		Session s = HibConnection.getSession();
		Transaction t = s.beginTransaction();
		AdharCard ad=(AdharCard) s.get(AdharCard.class,adharid);
		ad.setAdharnumber(1996);
		s.update(ad);
		t.commit();
		s.close();		
	}
	public static void updateMobiles(int mobilesid) {
		Session s = HibConnection.getSession();
		Transaction t = s.beginTransaction();
		Mobiles mob=(Mobiles) s.get(Mobiles.class, mobilesid);			
				mob.setMobilename("apple");		
		s.update(mob);
		t.commit();
		s.close();
	}
	
	public static void updateCourse(int courseid) {
		Session s=HibConnection.getSession();
		Transaction t=s.beginTransaction();
		Course c=(Course) s.get(Course.class, courseid);
		System.out.println(c);
	     c.setCname("hql");
	     System.out.println(c);
	    s.update(c);
	    t.commit();
		s.close();	     
	}
	
	public static void update_AdharCard_Mobiles(int empno) {
		Session s=HibConnection.getSession();
		Transaction t=s.beginTransaction();
		Employee employee=(Employee) s.get(Employee.class, empno);
		employee.getAdhar_card().setAdharnumber(284994);
		Mobiles mom=new Mobiles();
		mom.setMobilename("redmi");
		Mobiles mom1=new Mobiles();
		mom1.setMobilename("redmi1");
		
		employee.getMobiles().add(mom);
		employee.getMobiles().add(mom1);
		 s.update(employee);
		    t.commit();
			s.close();	     
		}
		
	
	
	
		
		
		
//		Employee employee=(Employee) s.get(Employee.class, employeeid);
//		System.out.println(employee);
//       // employee.setEmployeeName("surendra");
//      //  employee.getAdharcard().setAdharNumber(99999999);        
//        List<BankAccount> list=employee.getBankaccount();     
//        for(BankAccount qq:list)
//        {
//        	if(qq.getBankAccountName().equals("narendra"))
//        	qq.setBankAccountName("surendra");
//        	qq.setBankAccountNumber(1111111);        	
//        }
	public static void update_Person_From_Course(Integer empno) {
		Session s=HibConnection.getSession();
		Transaction t=s.beginTransaction();
		Employee employee=(Employee) s.get(Course.class, empno);
		
		
		employee.getAdhar_card().setAdharnumber(284994);
		Mobiles mom=new Mobiles();
		mom.setMobilename("redmi");
		Mobiles mom1=new Mobiles();
		mom1.setMobilename("redmi1");
		
		employee.getMobiles().add(mom);
		employee.getMobiles().add(mom1);
		 s.update(employee);
		    t.commit();
			s.close();	     
		}
	

	      
	public static void main(String[] args) {
		//updateEmployee(1) ;
		//updateAdharCard(1);
		//updateMobiles(16);
		//updateCourse(1);
		//update_AdharCard_Mobiles(15);
		
	}
}
