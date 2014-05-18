package me.bearl.bugzilla;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BugzillaChangeSet {
	
	/**
	 * The {@link me.bearl.bugzilla.BugzillaUser BugzillaUser} who made the changes
	 */
	private BugzillaUser changer;
	
	/**
	 * An array of all of the changes
	 */
	private BugzillaChange[] changes;
	
	/**
	 * The timestamp of when the changes were made
	 */
	private String changeTime;

	/**
	 * @return the changer
	 */
	public BugzillaUser getChanger() {
		return changer;
	}

	/**
	 * @param changer the changer to set
	 */
	public void setChanger(BugzillaUser changer) {
		this.changer = changer;
	}

	/**
	 * @return the changes
	 */
	public BugzillaChange[] getChanges() {
		return changes;
	}

	/**
	 * @param changes the changes to set
	 */
	public void setChanges(BugzillaChange[] changes) {
		this.changes = changes;
	}

	/**
	 * @return the changeTime
	 */
	public String getChangeTime() {
		return changeTime;
	}

	/**
	 * @param changeTime the changeTime to set
	 */
	public void setChangeTime(String changeTime) {
		this.changeTime = changeTime;
	}

}
