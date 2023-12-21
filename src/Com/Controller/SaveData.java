package Com.Controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Com.Entity.AdharCard;
import Com.Entity.Course;
import Com.Entity.Employee;
import Com.Entity.Mobiles;

public class SaveData {

	public static void insertEmployeeToAdhar() {
		Session s = HibConnection.getSession();
		Transaction t = s.beginTransaction();
		Employee employee = new Employee();
		employee.setEmpname("narendra");
		employee.setEmpsal(1000.00);
		AdharCard adharcard = new AdharCard();
		adharcard.setAdharnumber(123456789);
		adharcard.setEmp(employee);
		employee.setAdhar_card(adharcard);
		s.save(employee);
		t.commit();
		s.close();
	}

	public static void insertAdharToEmployee() {
		Session s = HibConnection.getSession();
		Transaction t = s.beginTransaction();
		AdharCard ad = new AdharCard();
		ad.setAdharnumber(987654321);
		Employee employee = new Employee();
		employee.setEmpname("kalyan");
		employee.setEmpsal(1200.00);
		employee.setAdhar_card(ad);
		ad.setEmp(employee);
		s.save(ad);
		t.commit();
		s.close();
	}

	public static void insertEmployeeToMobile() {
		Session s = HibConnection.getSession();
		Transaction t = s.beginTransaction();
		Employee employee = new Employee();
		employee.setEmpname("amar");
		employee.setEmpsal(100000);
		Mobiles m1 = new Mobiles();
		m1.setMobilename("samsung");
		Mobiles m2 = new Mobiles();
		m2.setMobilename("nokia");
		List<Mobiles> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		employee.setMobiles(list);
		s.save(employee);
		t.commit();
		s.close();

	}

	public static void insertMobileToEmployee() {
		Session s = HibConnection.getSession();
		Transaction t = s.beginTransaction();
		Employee e = new Employee();
		e.setEmpname("kumar");
		e.setEmpsal(1200);

		Mobiles m1 = new Mobiles();
		m1.setMobilename("redni");
		m1.setEmp_loyee(e);

		Mobiles m2 = new Mobiles();
		m2.setMobilename("vivo");
		m2.setEmp_loyee(e);

		List<Mobiles> list = new ArrayList<>();
		list.add(m1);
		//list.add(m1);
		e.setMobiles(list);

		s.save(m1);
		t.commit();
		s.close();
	}

	public static void insertEmployeeToCourse() {
		Session s = HibConnection.getSession();
		Transaction t = s.beginTransaction();
		Employee e = new Employee();
		e.setEmpname("narendra");
		e.setEmpsal(1200.00);

		Course c = new Course();
		c.setCname("java");

		Course c1 = new Course();
		c1.setCname("sql");

		List<Course> list1 = new ArrayList<>();
		list1.add(c);
		list1.add(c1);
		e.setCou(list1);

		s.save(e);
		t.commit();
		s.close();

	}

	public static void insertCourseToEmployee() {
		Session s = HibConnection.getSession();
		Transaction t = s.beginTransaction();
		Employee e = new Employee();
		e.setEmpname("narendra");
		e.setEmpsal(1200.00);
		Employee e1 = new Employee();
		e1.setEmpname("surendra");
		e1.setEmpsal(1300.00);

		Course c = new Course();
		c.setCname("java");

		List<Employee> list = new ArrayList<>();
		list.add(e);
		list.add(e1);
		c.setEmp(list);

		s.save(c);
		t.commit();
		s.close();
	}
	public static void insertEmployeeToAdhar_Mobile_Course(){
		Session s = HibConnection.getSession();
		Transaction t = s.beginTransaction();
		Employee e=new Employee();
		e.setEmpname("narendra");
		e.setEmpsal(12000.00);
		AdharCard ad=new AdharCard();
		ad.setAdharnumber(123456);
		ad.setEmp(e);
		e.setAdhar_card(ad);
		Mobiles m1 = new Mobiles();
		m1.setMobilename("samsung");
		m1.setEmp_loyee(e);
		Mobiles m2 = new Mobiles();
		m2.setMobilename("nokia");
		m2.setEmp_loyee(e);
		List<Mobiles> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		e.setMobiles(list);
		Course c = new Course();
		c.setCname("java");
		

		Course c1 = new Course();
		c1.setCname("sql");

		List<Course> list1 = new ArrayList<>();
		list1.add(c);
		list1.add(c1);
		e.setCou(list1);
		
		
		s.save(e);
		t.commit();
		s.close();
		
	}
	public static void insertAdharToEmployee_Mobile_Course() {
		Session s = HibConnection.getSession();
		Transaction t = s.beginTransaction();
		AdharCard ad=new AdharCard();
		ad.setAdharnumber(123456);
		Employee e=new Employee();
		e.setEmpname("narendra");
		e.setEmpsal(12000.00);
		ad.setEmp(e);
		Mobiles m1 = new Mobiles();
		m1.setMobilename("samsung");
		m1.setEmp_loyee(e);
		Mobiles m2 = new Mobiles();
		m2.setMobilename("nokia");
		m2.setEmp_loyee(e);
		List<Mobiles> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);		
		e.setMobiles(list);
		Course c = new Course();
		c.setCname("java");
		

		Course c1 = new Course();
		c1.setCname("sql");

		List<Course> list1 = new ArrayList<>();
		list1.add(c);
		list1.add(c1);
		e.setCou(list1);
		s.save(ad);
		t.commit();
		s.close();		
	}
	public static void insertMobileToEmployee_Adhar_Course() {
		Session s = HibConnection.getSession();
		Transaction t = s.beginTransaction();
		Employee e=new Employee();
		e.setEmpname("kumar");
		e.setEmpsal(8900);
		Mobiles m1 = new Mobiles();
		m1.setMobilename("samsung");
		m1.setEmp_loyee(e);
		Mobiles m2 = new Mobiles();
		m2.setMobilename("nokia");
		m2.setEmp_loyee(e);
		List<Mobiles> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);		
		e.setMobiles(list);
		Course c = new Course();
		c.setCname("java");
		

		Course c1 = new Course();
		c1.setCname("sql");

		List<Course> list1 = new ArrayList<>();
		list1.add(c);
		list1.add(c1);
		e.setCou(list1);
		AdharCard ad=new AdharCard();
		ad.setAdharnumber(123456);
		e.setAdhar_card(ad);
		s.save(m1);
		t.commit();
		s.close();	
		
	}
	public static void insertCourseToEmployee_Adhar_Mobiles() {
		Session s = HibConnection.getSession();
		Transaction t = s.beginTransaction();
		
		Employee e=new Employee();
		e.setEmpname("kumar");
		e.setEmpsal(8900);
		List<Employee> list2 = new ArrayList<>();
		list2.add(e);
		
		
		
		Course c = new Course();
		c.setCname("java");
		Course c1 = new Course();
		c1.setCname("sql");
		List<Course> list1 = new ArrayList<>();
		list1.add(c);
		list1.add(c1);
		e.setCou(list1);
		c.setEmp(list2);
		
		Mobiles m1 = new Mobiles();
		m1.setMobilename("samsung");
		m1.setEmp_loyee(e);
		Mobiles m2 = new Mobiles();
		m2.setMobilename("nokia");
		m2.setEmp_loyee(e);
		List<Mobiles> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);		
		e.setMobiles(list);
		
		AdharCard ad=new AdharCard();
		ad.setAdharnumber(123456);
		e.setAdhar_card(ad);
		
		s.save(list1);
		t.commit();
		s.close();	
	}

	public static void main(String[] args) {
		//  insertEmployeeToAdhar();
		// insertAdharToEmployee();
		// insertEmployeeToMobile();
		// insertMobileToEmployee();
		// insertEmployeeToCourse();
		// insertCourseToEmployee();
		//insertEmployeeToAdhar_Mobile_Course();
		//insertAdharToEmployee_Mobile_Course();
		//insertMobileToEmployee_Adhar_Course();
		//insertCourseToEmployee_Adhar_Mobiles();

	}
}
