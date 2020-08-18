package com.newco.marketplace.webservices.dao;

import java.util.List;

/**
 * Interface for ShcErrorLoggingDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IShcErrorLoggingDAO {
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
	 * IShcErrorLoggingDAO.save(entity);
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
	public void save(ShcErrorLogging entity);

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
	 * IShcErrorLoggingDAO.delete(entity);
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
	public void delete(ShcErrorLogging entity);

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
	 * entity = IShcErrorLoggingDAO.update(entity);
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
	public ShcErrorLogging update(ShcErrorLogging entity);

	public ShcErrorLogging findById(Integer id);

	/**
	 * Find all ShcErrorLogging entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the ShcErrorLogging property to query
	 * @param value
	 *            the property value to match
	 * @return List<ShcErrorLogging> found by query
	 */
	public List<ShcErrorLogging> findByProperty(String propertyName,
			Object value);

	public List<ShcErrorLogging> findByErrorCode(Object errorCode);

	public List<ShcErrorLogging> findByErrorMessage(Object errorMessage);

	public List<ShcErrorLogging> findByModifiedBy(Object modifiedBy);

	/**
	 * Find all ShcErrorLogging entities.
	 * 
	 * @return List<ShcErrorLogging> all ShcErrorLogging entities
	 */
	public List<ShcErrorLogging> findAll();
}