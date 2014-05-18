package me.bearl.bugzilla;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BugzillaChange {
	
	/**
	 * Values added, if any (comma-seperated if multiple)
	 */
	private String added;
	
	/**
	 * Name of the field changed
	 */
	private String fieldName;
	
	/**
	 * Values removed, if any (comma-seperated if multiple)
	 */
	private String removed;

	/**
	 * @return the added
	 */
	public String getAdded() {
		return added;
	}

	/**
	 * @param added the added to set
	 */
	public void setAdded(String added) {
		this.added = added;
	}

	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * @param fieldName the fieldName to set
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	/**
	 * @return the removed
	 */
	public String getRemoved() {
		return removed;
	}

	/**
	 * @param removed the removed to set
	 */
	public void setRemoved(String removed) {
		this.removed = removed;
	}

}
