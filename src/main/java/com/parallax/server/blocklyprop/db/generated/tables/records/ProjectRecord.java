/**
 * This class is generated by jOOQ
 */
package com.parallax.server.blocklyprop.db.generated.tables.records;


import com.parallax.server.blocklyprop.db.enums.ProjectType;
import com.parallax.server.blocklyprop.db.generated.tables.Project;

import java.util.GregorianCalendar;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProjectRecord extends UpdatableRecordImpl<ProjectRecord> implements Record13<Long, Long, Long, String, String, String, ProjectType, String, Boolean, Boolean, GregorianCalendar, GregorianCalendar, Long> {

	private static final long serialVersionUID = 297719120;

	/**
	 * Setter for <code>blocklyprop.project.id</code>.
	 */
	public void setId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>blocklyprop.project.id</code>.
	 */
	public Long getId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>blocklyprop.project.id_user</code>.
	 */
	public void setIdUser(Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>blocklyprop.project.id_user</code>.
	 */
	public Long getIdUser() {
		return (Long) getValue(1);
	}

	/**
	 * Setter for <code>blocklyprop.project.id_clouduser</code>.
	 */
	public void setIdClouduser(Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>blocklyprop.project.id_clouduser</code>.
	 */
	public Long getIdClouduser() {
		return (Long) getValue(2);
	}

	/**
	 * Setter for <code>blocklyprop.project.name</code>.
	 */
	public void setName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>blocklyprop.project.name</code>.
	 */
	public String getName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>blocklyprop.project.description</code>.
	 */
	public void setDescription(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>blocklyprop.project.description</code>.
	 */
	public String getDescription() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>blocklyprop.project.code</code>.
	 */
	public void setCode(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>blocklyprop.project.code</code>.
	 */
	public String getCode() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>blocklyprop.project.type</code>.
	 */
	public void setType(ProjectType value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>blocklyprop.project.type</code>.
	 */
	public ProjectType getType() {
		return (ProjectType) getValue(6);
	}

	/**
	 * Setter for <code>blocklyprop.project.board</code>.
	 */
	public void setBoard(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>blocklyprop.project.board</code>.
	 */
	public String getBoard() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>blocklyprop.project.private</code>.
	 */
	public void setPrivate(Boolean value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>blocklyprop.project.private</code>.
	 */
	public Boolean getPrivate() {
		return (Boolean) getValue(8);
	}

	/**
	 * Setter for <code>blocklyprop.project.shared</code>.
	 */
	public void setShared(Boolean value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>blocklyprop.project.shared</code>.
	 */
	public Boolean getShared() {
		return (Boolean) getValue(9);
	}

	/**
	 * Setter for <code>blocklyprop.project.created</code>.
	 */
	public void setCreated(GregorianCalendar value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>blocklyprop.project.created</code>.
	 */
	public GregorianCalendar getCreated() {
		return (GregorianCalendar) getValue(10);
	}

	/**
	 * Setter for <code>blocklyprop.project.modified</code>.
	 */
	public void setModified(GregorianCalendar value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>blocklyprop.project.modified</code>.
	 */
	public GregorianCalendar getModified() {
		return (GregorianCalendar) getValue(11);
	}

	/**
	 * Setter for <code>blocklyprop.project.based_on</code>.
	 */
	public void setBasedOn(Long value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>blocklyprop.project.based_on</code>.
	 */
	public Long getBasedOn() {
		return (Long) getValue(12);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<Long, Long, Long, String, String, String, ProjectType, String, Boolean, Boolean, GregorianCalendar, GregorianCalendar, Long> fieldsRow() {
		return (Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row13<Long, Long, Long, String, String, String, ProjectType, String, Boolean, Boolean, GregorianCalendar, GregorianCalendar, Long> valuesRow() {
		return (Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return Project.PROJECT.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return Project.PROJECT.ID_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field3() {
		return Project.PROJECT.ID_CLOUDUSER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Project.PROJECT.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Project.PROJECT.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Project.PROJECT.CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ProjectType> field7() {
		return Project.PROJECT.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return Project.PROJECT.BOARD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field9() {
		return Project.PROJECT.PRIVATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field10() {
		return Project.PROJECT.SHARED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<GregorianCalendar> field11() {
		return Project.PROJECT.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<GregorianCalendar> field12() {
		return Project.PROJECT.MODIFIED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field13() {
		return Project.PROJECT.BASED_ON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value2() {
		return getIdUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value3() {
		return getIdClouduser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectType value7() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getBoard();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value9() {
		return getPrivate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value10() {
		return getShared();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GregorianCalendar value11() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GregorianCalendar value12() {
		return getModified();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value13() {
		return getBasedOn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectRecord value2(Long value) {
		setIdUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectRecord value3(Long value) {
		setIdClouduser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectRecord value4(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectRecord value5(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectRecord value6(String value) {
		setCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectRecord value7(ProjectType value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectRecord value8(String value) {
		setBoard(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectRecord value9(Boolean value) {
		setPrivate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectRecord value10(Boolean value) {
		setShared(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectRecord value11(GregorianCalendar value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectRecord value12(GregorianCalendar value) {
		setModified(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectRecord value13(Long value) {
		setBasedOn(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProjectRecord values(Long value1, Long value2, Long value3, String value4, String value5, String value6, ProjectType value7, String value8, Boolean value9, Boolean value10, GregorianCalendar value11, GregorianCalendar value12, Long value13) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProjectRecord
	 */
	public ProjectRecord() {
		super(Project.PROJECT);
	}

	/**
	 * Create a detached, initialised ProjectRecord
	 */
	public ProjectRecord(Long id, Long idUser, Long idClouduser, String name, String description, String code, ProjectType type, String board, Boolean private_, Boolean shared, GregorianCalendar created, GregorianCalendar modified, Long basedOn) {
		super(Project.PROJECT);

		setValue(0, id);
		setValue(1, idUser);
		setValue(2, idClouduser);
		setValue(3, name);
		setValue(4, description);
		setValue(5, code);
		setValue(6, type);
		setValue(7, board);
		setValue(8, private_);
		setValue(9, shared);
		setValue(10, created);
		setValue(11, modified);
		setValue(12, basedOn);
	}
}
