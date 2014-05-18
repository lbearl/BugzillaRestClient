package me.bearl.bugzilla;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BugzillaFlag {
	/**
	 * The internal ID of the flag
	 */
	private int id;
	/**
	 * The name (read only) of the flag
	 */
	private String name;
	/**
	 * {@link me.bearl.bugzilla.BugzillaUser BugzillaUser} action is requested from, if flag is requestable
	 */
	private BugzillaUser requestee;
	/**
	 * {@link me.bearl.bugzilla.BugzillaUser BugzillaUser} who set the flag
	 */
	private BugzillaUser setter;
	/**
	 * The status of the flag: '?', '+', '-', or 'X'
	 */
	private char status;
	/**
	 * Unique numeric identifier for flag type
	 */
	private int type_id;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the requestee
	 */
	public BugzillaUser getRequestee() {
		return requestee;
	}
	/**
	 * @param requestee the requestee to set
	 */
	public void setRequestee(BugzillaUser requestee) {
		this.requestee = requestee;
	}
	/**
	 * @return the setter
	 */
	public BugzillaUser getSetter() {
		return setter;
	}
	/**
	 * @param setter the setter to set
	 */
	public void setSetter(BugzillaUser setter) {
		this.setter = setter;
	}
	/**
	 * @return the status
	 */
	public char getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(char status) {
		this.status = status;
	}
	/**
	 * @return the type_id
	 */
	public int getType_id() {
		return type_id;
	}
	/**
	 * @param type_id the type_id to set
	 */
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

}
