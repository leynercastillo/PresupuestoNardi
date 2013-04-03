package hibernateConnections;

import java.lang.reflect.ParameterizedType;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class GenericDao<Model> {

	public Class<Model> domainClass = getDomainClass();

	protected Session currentSession() {
		return StoreHibernateUtil.openSession();
	}

	protected Class<Model> getDomainClass() {
		if (domainClass == null) {
			ParameterizedType type = (ParameterizedType) getClass()
					.getGenericSuperclass();
			domainClass = (Class<Model>) type.getActualTypeArguments()[0];
		}
		return domainClass;
	}

	public Boolean save(Model model) {
		Session session = currentSession();
		try {
			session.beginTransaction();
			session.save(model);
			session.getTransaction().commit();
			return true;
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
			return false;
		}
	}

	public Boolean update(Model model) {
		Session session = currentSession();
		try {
			session.beginTransaction();
			session.merge(model);
			session.getTransaction().commit();
			return true;
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
			return false;
		}
	}

	public Boolean delete(Model model) {
		Session session = currentSession();
		try {
			session.beginTransaction();
			session.delete(model);
			session.getTransaction().commit();
			return true;
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
			return false;
		}
	}
}