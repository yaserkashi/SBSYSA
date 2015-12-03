package service;

import domain.TestTable;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for TestTable entities
 * 
 */
public interface TestTableService {

	/**
	 * Return all TestTable entity
	 * 
	 */
	public List<TestTable> findAllTestTables(Integer startResult, Integer maxRows);

	/**
	 */
	public TestTable findTestTableByPrimaryKey(Integer id);

	/**
	 * Load an existing TestTable entity
	 * 
	 */
	public Set<TestTable> loadTestTables();

	/**
	 * Return a count of all TestTable entity
	 * 
	 */
	public Integer countTestTables();

	/**
	 * Delete an existing TestTable entity
	 * 
	 */
	public void deleteTestTable(TestTable testtable);

	/**
	 * Save an existing TestTable entity
	 * 
	 */
	public void saveTestTable(TestTable testtable_1);
}