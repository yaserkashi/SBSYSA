package dao;

import domain.TestTable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage TestTable entities.
 * 
 */
@Repository("TestTableDAO")
@Transactional
public class TestTableDAOImpl extends AbstractJpaDao implements
		TestTableDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { TestTable.class }));

	/**
	 * EntityManager injected by Spring for persistence unit School
	 *
	 */
	@PersistenceContext(unitName = "School")
	private EntityManager entityManager;

	/**
	 * Instantiates a new TestTableDAOImpl
	 *
	 */
	public TestTableDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findTestTableByName
	 *
	 */
	@Transactional
	public Set<TestTable> findTestTableByName(String name) throws DataAccessException {

		return findTestTableByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findTestTableByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<TestTable> findTestTableByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTestTableByName", startResult, maxRows, name);
		return new LinkedHashSet<TestTable>(query.getResultList());
	}

	/**
	 * JPQL Query - findTestTableByPrimaryKey
	 *
	 */
	@Transactional
	public TestTable findTestTableByPrimaryKey(Integer id) throws DataAccessException {

		return findTestTableByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findTestTableByPrimaryKey
	 *
	 */

	@Transactional
	public TestTable findTestTableByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTestTableByPrimaryKey", startResult, maxRows, id);
			return (domain.TestTable) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTestTableByNameContaining
	 *
	 */
	@Transactional
	public Set<TestTable> findTestTableByNameContaining(String name) throws DataAccessException {

		return findTestTableByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findTestTableByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<TestTable> findTestTableByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTestTableByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<TestTable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllTestTables
	 *
	 */
	@Transactional
	public Set<TestTable> findAllTestTables() throws DataAccessException {

		return findAllTestTables(-1, -1);
	}

	/**
	 * JPQL Query - findAllTestTables
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<TestTable> findAllTestTables(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllTestTables", startResult, maxRows);
		return new LinkedHashSet<TestTable>(query.getResultList());
	}

	/**
	 * JPQL Query - findTestTableById
	 *
	 */
	@Transactional
	public TestTable findTestTableById(Integer id) throws DataAccessException {

		return findTestTableById(id, -1, -1);
	}

	/**
	 * JPQL Query - findTestTableById
	 *
	 */

	@Transactional
	public TestTable findTestTableById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTestTableById", startResult, maxRows, id);
			return (domain.TestTable) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(TestTable entity) {
		return true;
	}
}
