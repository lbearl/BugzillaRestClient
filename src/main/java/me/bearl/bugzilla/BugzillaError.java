package me.bearl.bugzilla;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BugzillaError {

	/**
	 * Unambiguous definition of error
	 */
	private int code;
	
	/**
	 * should always be true, indicates that this object is an error object
	 */
	private boolean error;

	/**
	 * If underlying implementation is screen-scraping and if error is 
	 * not recognized; only present so you can read it manually
	 */
	private String htmlPage;
	
	/**
	 * The HTTP code of result (may not be returned)
	 */
	private int httpCode;
	
	/**
	 * Short English string describing the Error
	 */
	private String message;
	
	/**
	 * XML-RPC error code, if the error is in XML-RPC
	 */
	private int xmlRpcCode;

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the error
	 */
	public boolean isError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(boolean error) {
		this.error = error;
	}

	/**
	 * @return the htmlPage
	 */
	public String getHtmlPage() {
		return htmlPage;
	}

	/**
	 * @param htmlPage the htmlPage to set
	 */
	public void setHtmlPage(String htmlPage) {
		this.htmlPage = htmlPage;
	}

	/**
	 * @return the httpCode
	 */
	public int getHttpCode() {
		return httpCode;
	}

	/**
	 * @param httpCode the httpCode to set
	 */
	public void setHttpCode(int httpCode) {
		this.httpCode = httpCode;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the xmlRpcCode
	 */
	public int getXmlRpcCode() {
		return xmlRpcCode;
	}

	/**
	 * @param xmlRpcCode the xmlRpcCode to set
	 */
	public void setXmlRpcCode(int xmlRpcCode) {
		this.xmlRpcCode = xmlRpcCode;
	}
}
