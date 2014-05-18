package me.bearl.bugzilla;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BugzillaAttachment {

	/**
	 * The {@link me.bearl.bugzilla.BugzillaUser BugzillaUser} who attached the attachment
	 */
	private BugzillaUser attacher;
	/**
	 * The ID of the bug that this attachment is associated with
	 */
	private int bug_id;
	/**
	 * The ref (URL) of the bug that this attachment is associated with
	 */
	private String bug_ref;
	/**
	 * An array of {@link me.bearlBugzillaComment BugzillaComments} associated with this attachment
	 */
	private BugzillaComment[] comments;
	/**
	 * The creation time of the attachment
	 */
	//TODO import joda time, and use a JODA date
	private String creationTime;
	/**
	 * Attachment data encoded with the encoding provided by {@link me.bearl.bugzilla.BugzillaAttachment#encoding encoding}.
	 */
	private String data;
	/**
	 * Text describing the description (not a full fledged comment)
	 */
	private String description;
	/**
	 * The encoding of the data, must be base64, only present if data is requested
	 */
	private String encoding;
	/**
	 * Path-less filename of attachment
	 */
	private String file_name;
	/**
	 * An array of flags set on this attachment
	 */
	private BugzillaFlag[] flags;
	/**
	 * The internal identifier of this attachment
	 */
	private int id;
	/**
	 * The attachment is obsolete
	 */
	private boolean isObsolete;
	/**
	 * The attachment is a patch
	 */
	private boolean isPatch;
	/**
	 * The attachment is private
	 */
	private boolean isPrivate;
	/** 
	 * The ref (URL) of the attachment
	 */
	private String ref;
	/**
	 * The size of the attachment (in bytes)
	 */
	private int size;
	/**
	 * The token to submit changes to attachment metadata; only supplied when logged in
	 */
	private String updateToken;
	/**
	 * The MIME type of the attachment
	 */
	private String contentType;
	
	
	/* start methods */
	/**
	 * @return the attacher
	 */
	public BugzillaUser getAttacher() {
		return attacher;
	}
	/**
	 * @param attacher the attacher to set
	 */
	public void setAttacher(BugzillaUser attacher) {
		this.attacher = attacher;
	}
	/**
	 * @return the bug_id
	 */
	public int getBug_id() {
		return bug_id;
	}
	/**
	 * @param bug_id the bug_id to set
	 */
	public void setBug_id(int bug_id) {
		this.bug_id = bug_id;
	}
	/**
	 * @return the bug_ref
	 */
	public String getBug_ref() {
		return bug_ref;
	}
	/**
	 * @param bug_ref the bug_ref to set
	 */
	public void setBug_ref(String bug_ref) {
		this.bug_ref = bug_ref;
	}
	/**
	 * @return the comments
	 */
	public BugzillaComment[] getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(BugzillaComment[] comments) {
		this.comments = comments;
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
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the encoding
	 */
	public String getEncoding() {
		return encoding;
	}
	/**
	 * @param encoding the encoding to set
	 */
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
	/**
	 * @return the file_name
	 */
	public String getFile_name() {
		return file_name;
	}
	/**
	 * @param file_name the file_name to set
	 */
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	/**
	 * @return the flags
	 */
	public BugzillaFlag[] getFlags() {
		return flags;
	}
	/**
	 * @param flags the flags to set
	 */
	public void setFlags(BugzillaFlag[] flags) {
		this.flags = flags;
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
	 * @return the isObsolete
	 */
	public boolean isObsolete() {
		return isObsolete;
	}
	/**
	 * @param isObsolete the isObsolete to set
	 */
	public void setObsolete(boolean isObsolete) {
		this.isObsolete = isObsolete;
	}
	/**
	 * @return the isPatch
	 */
	public boolean isPatch() {
		return isPatch;
	}
	/**
	 * @param isPatch the isPatch to set
	 */
	public void setPatch(boolean isPatch) {
		this.isPatch = isPatch;
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
	 * @return the ref
	 */
	public String getRef() {
		return ref;
	}
	/**
	 * @param ref the ref to set
	 */
	public void setRef(String ref) {
		this.ref = ref;
	}
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/**
	 * @return the updateToken
	 */
	public String getUpdateToken() {
		return updateToken;
	}
	/**
	 * @param updateToken the updateToken to set
	 */
	public void setUpdateToken(String updateToken) {
		this.updateToken = updateToken;
	}
	/**
	 * @return the contentType
	 */
	public String getContentType() {
		return contentType;
	}
	/**
	 * @param contentType the contentType to set
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	
	
}
