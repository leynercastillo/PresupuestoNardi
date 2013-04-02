package hibernateConnections;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StoreHibernateUtil /*implements Filter*/ {

	public static final SessionFactory SESSION_FACTORY;

	static {
		try {
			SESSION_FACTORY = new Configuration().configure()
					.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("No se pudo inicializar SESSION_FACTORY." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

	public static Session openSession() {
		if (SESSION_FACTORY.isClosed()) {
			return SESSION_FACTORY.openSession();
		} else {
			return SESSION_FACTORY.getCurrentSession();
		}
	}

	/*
	 * El metodo destroy se manda a llamar automaticamente al terminar el
	 * request, de esta manera aseguramos no dejar la session abierta. Nota:
	 * Esto porque extiende de la interfaz Filter
	 *//*
	@Override
	public void destroy() {
		try {
			System.out.println("CERRADA");
			SESSION_FACTORY.close();
		} catch (HibernateException ex) {
			throw new RuntimeException(ex);
		}
	}*/

	/*
	 * No se utiliza el metodo de la interfaz Filter Leer
	 * http://www.javamexico.org
	 * /blogs/javadicto/el_patron_de_diseno_quot_open_session_view_quot
	 *//*
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub

	}
*/
	/*
	 * No se utiliza el metodo de la interfaz Filter Leer
	 * http://www.javamexico.org
	 * /blogs/javadicto/el_patron_de_diseno_quot_open_session_view_quot
	 *//*
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}*/
}