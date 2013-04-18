package hibernateConnections;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StoreHibernateUtil implements Filter {

    public static final SessionFactory SESSION_FACTORY;

    static {
	try {
	    SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
	} catch (Throwable ex) {
	    System.err.println("No se pudo inicializar SESSION_FACTORY." + ex);
	    throw new ExceptionInInitializerError(ex);
	}
    }

    public static SessionFactory getSessionFactory() {
	return SESSION_FACTORY;
    }

    public static Session getSession() {
	if (SESSION_FACTORY.isClosed()) {
	    return SESSION_FACTORY.openSession();
	} else {
	    return SESSION_FACTORY.getCurrentSession();
	}
    }

    /*
     * El metodo destroy se manda a llamar automaticamente al terminar el request, de esta manera aseguramos no dejar la
     * session abierta
     */
    @Override
    public void destroy() {
	try {
	    SESSION_FACTORY.close();
	} catch (HibernateException ex) {
	    throw new RuntimeException(ex);
	}
    }

    /*
     * Este metodo se debe declarar por que viene especificado en la interfaz y es donde se deberia asignar una session
     * a un thread local, pero eso ya viene especificado en el archivo de configuracion hibernate.cfg.xml. <property
     * name="hibernate.current_session_context_class">thread</property>
     */
    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
    }

    /*
     * Aqui en donde deberia crear una session de la fabrica de sessiones por que es el metodo init y este metodo se
     * hizo para inicializar valores o solicitar recursos, pero eso ya lo hice arriba.
     */
    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }
}