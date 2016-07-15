package com.ado.advices;

import java.util.logging.Logger;

import org.springframework.aop.ThrowsAdvice;

import com.ado.springaop.exceptions.EmployerNotFoundException;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class AfterThrowingAdvice implements ThrowsAdvice {
	private final static Logger LOGGER = Logger.getLogger(AfterThrowingAdvice.class.getName());
	public void afterThrowing(EmployerNotFoundException e) throws Throwable {
		LOGGER.info(":::::::::::::::Method Name::::"+e.getMessage());
	}
		

}
