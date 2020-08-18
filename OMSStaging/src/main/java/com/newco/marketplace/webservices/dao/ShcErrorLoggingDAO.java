package com.newco.marketplace.webservices.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.context.ApplicationContext;
import org.springframework.orm.jpa.JpaCallback;
import org.springframework.orm.jpa.support.JpaDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ShcErrorLogging entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.newco.marketplace.webservices.dao.ShcErrorLogging
 * @author MyEclipse Persistence Tools
 */

public class ShcErrorLoggingDAO extends JpaDaoSupport implements
		IShcErrorLoggingDAO {
	// property constants
	public static final String ERROR_CODE = "errorCode";
	public static final String ERROR_MESSAGE = "errorMessage";
	public static final String MODIFIED_BY = "modifiedBy";

	/**
	 * Perform an initial save of a previously unsaved ShcErrorLogging entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * <p>
	 * User-managed Spring transaction example:
	 * 
	 * <pre>
	 * TransactionStatus txn = txManager
	 * 		.getTransaction(new DefaultTransactionDefinition());
	 * ShcErrorLoggingDAO.save(entity);
	 * txManager.commit(txn);
	 * </pre>
	 * 
	 * @see <a href =
	 *      "http://www.myeclipseide.com/documentation/quickstarts/jpaspring#containermanaged">Spring
	 *      container-managed transaction examples</a>
	 * @param entity
	 *            ShcErrorLogging entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(ShcErrorLogging entity) {
		logger.info("saving ShcErrorLogging instance");
		try {
			getJpaTemplate().persist(entity);
			logger.info("save successful");
		} catch (RuntimeException re) {
			logger.error("save failed", re);
			throw re;
		}
	}

	/**
	 * Delete a persistent ShcErrorLogging entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * <p>
	 * User-managed Spring transaction example:
	 * 
	 * <pre>
	 * TransactionStatus txn = txManager
	 * 		.getTransaction(new DefaultTransactionDefinition());
	 * ShcErrorLoggingDAO.delete(entity);
	 * txManager.commit(txn);
	 * entity = null;
	 * </pre>
	 * 
	 * @see <a href =
	 *      "http://www.myeclipseide.com/documentation/quickstarts/jpaspring#containermanaged">Spring
	 *      container-managed transaction examples</a>
	 * @param entity
	 *            ShcErrorLogging entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(ShcErrorLogging entity) {
		logger.info("deleting ShcErrorLogging instance");
		try {
			entity = getJpaTemplate().getReference(ShcErrorLogging.class,
					entity.getShcErrorLoggingId());
			getJpaTemplate().remove(entity);
			logger.info("delete successful");
		} catch (RuntimeException re) {
			logger.error("delete failed", re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved ShcErrorLogging entity and return it or a copy
	 * of it to the sender. A copy of the ShcErrorLogging entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * <p>
	 * User-managed Spring transaction example:
	 * 
	 * <pre>
	 * TransactionStatus txn = txManager
	 * 		.getTransaction(new DefaultTransactionDefinition());
	 * entity = ShcErrorLoggingDAO.update(entity);
	 * txManager.commit(txn);
	 * </pre>
	 * 
	 * @see <a href =
	 *      "http://www.myeclipseide.com/documentation/quickstarts/jpaspring#containermanaged">Spring
	 *      container-managed transaction examples</a>
	 * @param entity
	 *            ShcErrorLogging entity to update
	 * @returns ShcErrorLogging the persisted ShcErrorLogging entity instance,
	 *          may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public ShcErrorLogging update(ShcErrorLogging entity) {
		logger.info("updating ShcErrorLogging instance");
		try {
			ShcErrorLogging result = getJpaTemplate().merge(entity);
			logger.info("update successful");
			return result;
		} catch (RuntimeException re) {
			logger.error("update failed", re);
			throw re;
		}
	}

	public ShcErrorLogging findById(Integer id) {
		logger.info("finding ShcErrorLogging instance with id: " + id);
		try {
			ShcErrorLogging instance = getJpaTemplate().find(
					ShcErrorLogging.class, id);
			return instance;
		} catch (RuntimeException re) {
			logger.error("find failed", re);
			throw re;
		}
	}

	/**
	 * Find all ShcErrorLogging entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the ShcErrorLogging property to query
	 * @param value
	 *            the property value to match
	 * @return List<ShcErrorLogging> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<ShcErrorLogging> findByProperty(String propertyName,
			final Object value) {
		logger.info("finding ShcErrorLogging instance with property: "
				+ propertyName + ", value: " + value);
		try {
			final String queryString = "select model from ShcErrorLogging model where model."
					+ propertyName + "= :propertyValue";
			return getJpaTemplate().executeFind(new JpaCallback() {
				public Object doInJpa(EntityManager em)
						throws PersistenceException {
					Query query = em.createQuery(queryString);
					query.setParameter("propertyValue", value);
					return query.getResultList();
				}
			});
		} catch (RuntimeException re) {
			logger.error("find by property name failed", re);
			throw re;
		}
	}

	public List<ShcErrorLogging> findByErrorCode(Object errorCode) {
		return findByProperty(ERROR_CODE, errorCode);
	}

	public List<ShcErrorLogging> findByErrorMessage(Object errorMessage) {
		return findByProperty(ERROR_MESSAGE, errorMessage);
	}

	public List<ShcErrorLogging> findByModifiedBy(Object modifiedBy) {
		return findByProperty(MODIFIED_BY, modifiedBy);
	}

	/**
	 * Find all ShcErrorLogging entities.
	 * 
	 * @return List<ShcErrorLogging> all ShcErrorLogging entities
	 */
	@SuppressWarnings("unchecked")
	public List<ShcErrorLogging> findAll() {
		logger.info("finding all ShcErrorLogging instances");
		try {
			final String queryString = "select model from ShcErrorLogging model";
			return getJpaTemplate().executeFind(new JpaCallback() {
				public Object doInJpa(EntityManager em)
						throws PersistenceException {
					Query query = em.createQuery(queryString);
					return query.getResultList();
				}
			});
		} catch (RuntimeException re) {
			logger.error("find all failed", re);
			throw re;
		}
	}

	public static IShcErrorLoggingDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (IShcErrorLoggingDAO) ctx.getBean("ShcErrorLoggingDAO");
	}
}