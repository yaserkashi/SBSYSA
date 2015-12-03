package dao;

import domain.TestTable;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage TestTable entities.
 * 
 */
public interface TestTableDAO extends JpaDao {

	/**
	 * JPQL Query - findTestTableByName
	 *
	 */
	public Set<TestTable> findTestTableByName(String name) throws DataAccessException;

	/**
	 * JPQL Query - findTestTableByName
	 *
	 */
	public Set<TestTable> findTestTableByName(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTestTableByPrimaryKey
	 *
	 */
	public TestTable findTestTableByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findTestTableByPrimaryKey
	 *
	 */
	public TestTable findTestTableByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTestTableByNameContaining
	 *
	 */
	public Set<TestTable> findTestTableByNameContaining(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findTestTableByNameContaining
	 *
	 */
	public Set<TestTable> findTestTableByNameContaining(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllTestTables
	 *
	 */
	public Set<TestTable> findAllTestTables() throws DataAccessException;

	/**
	 * JPQL Query - findAllTestTables
	 *
	 */
	public Set<TestTable> findAllTestTables(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTestTableById
	 *
	 */
	public TestTable findTestTableById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findTestTableById
	 *
	 */
	public TestTable findTestTableById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}