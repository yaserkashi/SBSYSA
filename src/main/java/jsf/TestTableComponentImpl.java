package jsf;

import dao.TestTableDAO;

import domain.TestTable;

import service.TestTableService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Component;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring Component that handles CRUD requests for TestTable entities
 * 
 */
@Scope("session")
@Component("TestTableComponent")
public class TestTableComponentImpl implements TestTableComponent {

	/**
	 * Data type variable that provides CRUD operations for TestTable entities
	 * 
	 */
	private TestTable testtable;

	/**
	 * DAO injected by Spring that manages TestTable entities
	 * 
	 */
	@Autowired
	private TestTableDAO testTableDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for TestTable entities
	 * 
	 */
	@Autowired
	private TestTableService testTableService;

	/** 
	 */
	public TestTableComponentImpl() {
	}

	/**
	 * Save an existing TestTable entity
	 * 
	 */
	@Transactional
	public String saveTestTable(TestTable testtable) {
		testTableService.saveTestTable(testtable);
		return "/jsf/testtable/listTestTables.xhtml";
	}

	/**
	 * Select the TestTable entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@Transactional
	public String confirmDeleteTestTable(Integer idKey) {
		testtable = testTableDAO.findTestTableByPrimaryKey(idKey);

		return "/jsf/testtable/deleteTestTable.xhtml";
	}

	/**
	 * Delete an existing TestTable entity
	 * 
	 */
	@Transactional
	public String deleteTestTable(Integer idKey) {
		TestTable testtable = testTableDAO.findTestTableByPrimaryKey(idKey);
		testTableService.deleteTestTable(testtable);
		return "/jsf/testtable/listTestTables.xhtml";
	}

	/**
	 * Getter for variable TestTable
	 * 
	 */
	@Transactional
	public TestTable getTesttable() {
		return testtable;
	}

	/**
	 * Select an existing TestTable entity
	 * 
	 */
	@Transactional
	public String selectTestTable(Integer idKey) {
		testtable = testTableDAO.findTestTableByPrimaryKey(idKey);

		return "/jsf/testtable/viewTestTable.xhtml";
	}

	/**
	 * Edit an existing TestTable entity
	 * 
	 */
	@Transactional
	public String editTestTable(Integer idKey) {
		testtable = testTableDAO.findTestTableByPrimaryKey(idKey);

		return "/jsf/testtable/editTestTable.xhtml";
	}

	/**
	 * Create a new TestTable entity
	 * 
	 */
	@Transactional
	public String newTestTable() {
		testtable = new TestTable();

		return "/jsf/testtable/createTestTable.xhtml";
	}

	/**
	 * Show all TestTable entities
	 * 
	 */
	@Transactional
	public List<TestTable> listTestTables() {
		return new java.util.ArrayList<TestTable>(testTableService.loadTestTables());
	}

}
