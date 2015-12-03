package jsf;

import domain.TestTable;

import java.util.List;

/**
 * Spring Component that handles CRUD requests for TestTable entities
 * 
 */
public interface TestTableComponent {

	/**
	 * Save an existing TestTable entity
	 * 
	 */
	public String saveTestTable(TestTable testtable);

	/**
	 * Select the TestTable entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	public String confirmDeleteTestTable(Integer idKey);

	/**
	 * Delete an existing TestTable entity
	 * 
	 */
	public String deleteTestTable(Integer idKey_1);

	/**
	 * Getter for variable TestTable
	 * 
	 */
	public TestTable getTesttable();

	/**
	 * Select an existing TestTable entity
	 * 
	 */
	public String selectTestTable(Integer idKey_2);

	/**
	 * Edit an existing TestTable entity
	 * 
	 */
	public String editTestTable(Integer idKey_3);

	/**
	 * Create a new TestTable entity
	 * 
	 */
	public String newTestTable();

	/**
	 * Show all TestTable entities
	 * 
	 */
	public List<TestTable> listTestTables();
}