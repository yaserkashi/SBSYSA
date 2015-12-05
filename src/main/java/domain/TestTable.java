package domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllTestTables", query = "select myTestTable from TestTable myTestTable"),
		@NamedQuery(name = "findTestTableById", query = "select myTestTable from TestTable myTestTable where myTestTable.id = ?1"),
		@NamedQuery(name = "findTestTableByName", query = "select myTestTable from TestTable myTestTable where myTestTable.name = ?1"),
		@NamedQuery(name = "findTestTableByNameContaining", query = "select myTestTable from TestTable myTestTable where myTestTable.name like ?1"),
		@NamedQuery(name = "findTestTableByPrimaryKey", query = "select myTestTable from TestTable myTestTable where myTestTable.id = ?1") })
@Table(schema = "public", name = "test_table")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "crude/Balot/Yazd/domain", name = "TestTable")
public class TestTable implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer id;
	/**
	 */

	@Column(name = "name", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;

	/**
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 */
	public String getName() {
		return this.name;
	}

	/**
	 */
	public TestTable() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(TestTable that) {
		setId(that.getId());
		setName(that.getName());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("name=[").append(name).append("] ");
		gtf6cjrydfkyjdyd;

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof TestTable))
			return false;
		TestTable equalCheck = (TestTable) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
