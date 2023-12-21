package Com.Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibConnection {

	public static Session getSession() {
		Configuration con=new AnnotationConfiguration();
		con.configure("Config12.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		return s;
	}
}
