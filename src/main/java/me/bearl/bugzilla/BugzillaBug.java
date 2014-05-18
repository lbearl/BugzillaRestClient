package me.bearl.bugzilla;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BugzillaBug {
	/**
	 * The ID of the bug, readonly, must be present
	 */
	private int id;
	
	/**
	 * The ref (URL) of the bug, readonly, must be present
	 */
	private String ref;
	
	
	private float actualTime;
	
	private String alias;
	
	/**
	 * {@link me.bearl.bugzilla.BugzillaUser BugzillaUser} the bug is assigned to
	 */
	private BugzillaUser assignedTo;
	
	private BugzillaAttachment[] attachments;
	
	private int[] blocks;
	
	private BugzillaUser[] cc;
	
	private String classification;
	
	private BugzillaComment[] comments;
	
	private String component;
	
	private String creationTime;
	
	private BugzillaUser Creator;
	
	private String deadline;
	
	/**
	 * An array of bug ids that this bug depends on
	 */
	private int[] dependsOn;
	
	/**
	 * Bug ID of bug this bug is a duplicate of
	 */
	private int dupeOf;
	
	private float estimatedTime;
	
	private BugzillaFlag[] flags;
	
	private BugzillaGroup[] groups;
	
	private BugzillaChangeSet history;
	
	private boolean isCCAccessible;
	
	private boolean isConfirmed;
	
	private boolean isCreatorAccessible;
	
	private String[] keywords;
	
	/**
	 * Timestamp of the last change
	 */
	private String lastChangeTime;
	
	private String opSys;
	
	private String platform;
	
	private String priority;
	
	private String product;
	
	private BugzillaUser qa_contact;
	
	private float remainingTime;
	
	private String resolution;
	
	/**
	 * array of of URLs of related bugs
	 */
	private String[] seealso;
	
	private String severity;
	
	private String status;
	
	private String summary;
	
	private String targetMilestone;
	
	private String updateToken;
	
	private String url;
	
	private String version;
	
	private String whiteboard;
	
	private float workTime;

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
	 * @return the actualTime
	 */
	public float getActualTime() {
		return actualTime;
	}

	/**
	 * @param actualTime the actualTime to set
	 */
	public void setActualTime(float actualTime) {
		this.actualTime = actualTime;
	}

	/**
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * @return the assignedTo
	 */
	public BugzillaUser getAssignedTo() {
		return assignedTo;
	}

	/**
	 * @param assignedTo the assignedTo to set
	 */
	public void setAssignedTo(BugzillaUser assignedTo) {
		this.assignedTo = assignedTo;
	}

	/**
	 * @return the attachments
	 */
	public BugzillaAttachment[] getAttachments() {
		return attachments;
	}

	/**
	 * @param attachments the attachments to set
	 */
	public void setAttachments(BugzillaAttachment[] attachments) {
		this.attachments = attachments;
	}

	/**
	 * @return the blocks
	 */
	public int[] getBlocks() {
		return blocks;
	}

	/**
	 * @param blocks the blocks to set
	 */
	public void setBlocks(int[] blocks) {
		this.blocks = blocks;
	}

	/**
	 * @return the cc
	 */
	public BugzillaUser[] getCc() {
		return cc;
	}

	/**
	 * @param cc the cc to set
	 */
	public void setCc(BugzillaUser[] cc) {
		this.cc = cc;
	}

	/**
	 * @return the classification
	 */
	public String getClassification() {
		return classification;
	}

	/**
	 * @param classification the classification to set
	 */
	public void setClassification(String classification) {
		this.classification = classification;
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
	 * @return the component
	 */
	public String getComponent() {
		return component;
	}

	/**
	 * @param component the component to set
	 */
	public void setComponent(String component) {
		this.component = component;
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
	 * @return the creator
	 */
	public BugzillaUser getCreator() {
		return Creator;
	}

	/**
	 * @param creator the creator to set
	 */
	public void setCreator(BugzillaUser creator) {
		Creator = creator;
	}

	/**
	 * @return the deadline
	 */
	public String getDeadline() {
		return deadline;
	}

	/**
	 * @param deadline the deadline to set
	 */
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	/**
	 * @return the dependsOn
	 */
	public int[] getDependsOn() {
		return dependsOn;
	}

	/**
	 * @param dependsOn the dependsOn to set
	 */
	public void setDependsOn(int[] dependsOn) {
		this.dependsOn = dependsOn;
	}

	/**
	 * @return the dupeOf
	 */
	public int getDupeOf() {
		return dupeOf;
	}

	/**
	 * @param dupeOf the dupeOf to set
	 */
	public void setDupeOf(int dupeOf) {
		this.dupeOf = dupeOf;
	}

	/**
	 * @return the estimatedTime
	 */
	public float getEstimatedTime() {
		return estimatedTime;
	}

	/**
	 * @param estimatedTime the estimatedTime to set
	 */
	public void setEstimatedTime(float estimatedTime) {
		this.estimatedTime = estimatedTime;
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
	 * @return the groups
	 */
	public BugzillaGroup[] getGroups() {
		return groups;
	}

	/**
	 * @param groups the groups to set
	 */
	public void setGroups(BugzillaGroup[] groups) {
		this.groups = groups;
	}

	/**
	 * @return the history
	 */
	public BugzillaChangeSet getHistory() {
		return history;
	}

	/**
	 * @param history the history to set
	 */
	public void setHistory(BugzillaChangeSet history) {
		this.history = history;
	}

	/**
	 * @return the isCCAccessible
	 */
	public boolean isCCAccessible() {
		return isCCAccessible;
	}

	/**
	 * @param isCCAccessible the isCCAccessible to set
	 */
	public void setCCAccessible(boolean isCCAccessible) {
		this.isCCAccessible = isCCAccessible;
	}

	/**
	 * @return the isConfirmed
	 */
	public boolean isConfirmed() {
		return isConfirmed;
	}

	/**
	 * @param isConfirmed the isConfirmed to set
	 */
	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	/**
	 * @return the isCreatorAccessible
	 */
	public boolean isCreatorAccessible() {
		return isCreatorAccessible;
	}

	/**
	 * @param isCreatorAccessible the isCreatorAccessible to set
	 */
	public void setCreatorAccessible(boolean isCreatorAccessible) {
		this.isCreatorAccessible = isCreatorAccessible;
	}

	/**
	 * @return the keywords
	 */
	public String[] getKeywords() {
		return keywords;
	}

	/**
	 * @param keywords the keywords to set
	 */
	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}

	/**
	 * @return the lastChangeTime
	 */
	public String getLastChangeTime() {
		return lastChangeTime;
	}

	/**
	 * @param lastChangeTime the lastChangeTime to set
	 */
	public void setLastChangeTime(String lastChangeTime) {
		this.lastChangeTime = lastChangeTime;
	}

	/**
	 * @return the opSys
	 */
	public String getOpSys() {
		return opSys;
	}

	/**
	 * @param opSys the opSys to set
	 */
	public void setOpSys(String opSys) {
		this.opSys = opSys;
	}

	/**
	 * @return the platform
	 */
	public String getPlatform() {
		return platform;
	}

	/**
	 * @param platform the platform to set
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}

	/**
	 * @return the product
	 */
	public String getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * @return the qa_contact
	 */
	public BugzillaUser getQa_contact() {
		return qa_contact;
	}

	/**
	 * @param qa_contact the qa_contact to set
	 */
	public void setQa_contact(BugzillaUser qa_contact) {
		this.qa_contact = qa_contact;
	}

	/**
	 * @return the remainingTime
	 */
	public float getRemainingTime() {
		return remainingTime;
	}

	/**
	 * @param remainingTime the remainingTime to set
	 */
	public void setRemainingTime(float remainingTime) {
		this.remainingTime = remainingTime;
	}

	/**
	 * @return the resolution
	 */
	public String getResolution() {
		return resolution;
	}

	/**
	 * @param resolution the resolution to set
	 */
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	/**
	 * @return the seealso
	 */
	public String[] getSeealso() {
		return seealso;
	}

	/**
	 * @param seealso the seealso to set
	 */
	public void setSeealso(String[] seealso) {
		this.seealso = seealso;
	}

	/**
	 * @return the severity
	 */
	public String getSeverity() {
		return severity;
	}

	/**
	 * @param severity the severity to set
	 */
	public void setSeverity(String severity) {
		this.severity = severity;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * @return the targetMilestone
	 */
	public String getTargetMilestone() {
		return targetMilestone;
	}

	/**
	 * @param targetMilestone the targetMilestone to set
	 */
	public void setTargetMilestone(String targetMilestone) {
		this.targetMilestone = targetMilestone;
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
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the whiteboard
	 */
	public String getWhiteboard() {
		return whiteboard;
	}

	/**
	 * @param whiteboard the whiteboard to set
	 */
	public void setWhiteboard(String whiteboard) {
		this.whiteboard = whiteboard;
	}

	/**
	 * @return the workTime
	 */
	public float getWorkTime() {
		return workTime;
	}

	/**
	 * @param workTime the workTime to set
	 */
	public void setWorkTime(float workTime) {
		this.workTime = workTime;
	}

}
