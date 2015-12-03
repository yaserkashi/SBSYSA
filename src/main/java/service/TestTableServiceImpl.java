package service;

import dao.TestTableDAO;

import domain.TestTable;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for TestTable entities
 * 
 */

@Service("TestTableService")
@Transactional
public class TestTableServiceImpl implements TestTableService {

	/**
	 * DAO injected by Spring that manages TestTable entities
	 * 
	 */
	@Autowired
	private TestTableDAO testTableDAO;

	/**
	 * Instantiates a new TestTableServiceImpl.
	 *
	 */
	public TestTableServiceImpl() {
	}

	/**
	 * Return all TestTable entity
	 * 
	 */
	@Transactional
	public List<TestTable> findAllTestTables(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<TestTable>(testTableDAO.findAllTestTables(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public TestTable findTestTableByPrimaryKey(Integer id) {
		return testTableDAO.findTestTableByPrimaryKey(id);
	}

	/**
	 * Load an existing TestTable entity
	 * 
	 */
	@Transactional
	public Set<TestTable> loadTestTables() {
		return testTableDAO.findAllTestTables();
	}

	/**
	 * Return a count of all TestTable entity
	 * 
	 */
	@Transactional
	public Integer countTestTables() {
		//return ((Long) testTableDAO.createQuerySingleResult("select count(o) from TestTable o").getSingleResult()).intValue();
		return 1;
	}

	/**
	 * Delete an existing TestTable entity
	 * 
	 */
	@Transactional
	public void deleteTestTable(TestTable testtable) {
		testTableDAO.remove(testtable);
		testTableDAO.flush();
	}

	/**
	 * Save an existing TestTable entity
	 * 
	 */
	@Transactional
	public void saveTestTable(TestTable testtable) {
		TestTable existingTestTable = testTableDAO.findTestTableByPrimaryKey(testtable.getId());

		if (existingTestTable != null) {
			if (existingTestTable != testtable) {
				existingTestTable.setId(testtable.getId());
				existingTestTable.setName(testtable.getName());
			}
			testtable = testTableDAO.store(existingTestTable);
		} else {
			testtable = testTableDAO.store(testtable);
		}
		testTableDAO.flush();
	}
}
