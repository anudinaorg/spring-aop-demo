/**
 * 
 */
package com.ado.springaop.domain;

import java.util.logging.Logger;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.ado.springaop.exceptions.EmployerNotFoundException;

/**
 * @author Administrator
 *
 */
public class Employer {
	private final static Logger LOGGER = Logger.getLogger(Employer.class.getName()); 
	
	private int emplId;
	private String empFirstName;
	private String empLastName;
	private String empAddress;
	private String zipCode;
	/**
	 * @return the emplId
	 */
	public int getEmplId() {
		return emplId;
	}
	/**
	 * @param emplId the emplId to set
	 */
	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}
	/**
	 * @return the empFirstName
	 */
	public String getEmpFirstName() {
		return empFirstName;
	}
	/**
	 * @param empFirstName the empFirstName to set
	 */
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	/**
	 * @return the empLastName
	 */
	public String getEmpLastName() {
		return empLastName;
	}
	/**
	 * @param empLastName the empLastName to set
	 */
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	/**
	 * @return the empAddress
	 */
	public String getEmpAddress() {
		return empAddress;
	}
	/**
	 * @param empAddress the empAddress to set
	 */
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	/**
	 * 
	 */
	public void printEmployerDetails()
	{
		LOGGER.info(":::::"+ToStringBuilder.reflectionToString(this));
	}
	
	/**
	 * 
	 */
	public void printEmployerAddress(){
		LOGGER.info(":::::"+this.getEmpAddress()+this.getZipCode());
	}
	
	public void printEmployerException() throws EmployerNotFoundException{
		throw new EmployerNotFoundException("TEST");
	}
}
