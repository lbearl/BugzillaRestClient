package me.bearl.bugzilla;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BugzillaComment {
	/**
	 * The ID of the attachment added at the same time as this comment (if any)
	 */
	private int attachmentId;
	/**
	 * Ref (URL) of the attachment added at the same time as this comment (if any)
	 */
	private String attachmentRef;
	/**
	 * {@link me.bearl.bugzilla.BugzillaUser BugzillaUser} who created this comment
	 */
	private BugzillaUser creator;
	/**
	 * The creation time of this comment
	 */
	private String creationTime;
	/**
	 * The internal ID of the this comment
	 */
	private int id;
	/**
	 * Comment is private
	 */
	private boolean isPrivate;
	/**
	 * Text of the comment (plain text)
	 */
	private String text;
	/**
	 * @return the attachmentId
	 */
	public int getAttachmentId() {
		return attachmentId;
	}
	/**
	 * @param attachmentId the attachmentId to set
	 */
	public void setAttachmentId(int attachmentId) {
		this.attachmentId = attachmentId;
	}
	/**
	 * @return the attachmentRef
	 */
	public String getAttachmentRef() {
		return attachmentRef;
	}
	/**
	 * @param attachmentRef the attachmentRef to set
	 */
	public void setAttachmentRef(String attachmentRef) {
		this.attachmentRef = attachmentRef;
	}
	/**
	 * @return the creator
	 */
	public BugzillaUser getCreator() {
		return creator;
	}
	/**
	 * @param creator the creator to set
	 */
	public void setCreator(BugzillaUser creator) {
		this.creator = creator;
	}
	/**
	 * @return the creationTime
	 */
	public String getCreationTime() {
		return creationTime;
	}
	/**
	 * @param creationTime the creationTime to set
	 */
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}
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
	 * @return the isPrivate
	 */
	public boolean isPrivate() {
		return isPrivate;
	}
	/**
	 * @param isPrivate the isPrivate to set
	 */
	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

}
