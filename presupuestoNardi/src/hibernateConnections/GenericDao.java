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

	/**
	 * @param model Object to save in database
	 * @return true if saved / false if not saved 
	 */
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

	/**
	 * @param model Object to update in database
	 * @return true if updated / false if not updated 
	 */
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

	/**
	 * @param model Object to save in database
	 * @return true if deleted / false if not deleted 
	 */
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