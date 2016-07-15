package com.ado.advices;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.springframework.aop.AfterReturningAdvice;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class AfterAdvice implements AfterReturningAdvice {
	private final static Logger LOGGER = Logger.getLogger(AfterAdvice.class.getName());

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		LOGGER.info(":::::::::::::::Method Name::::"+method.getName());
		LOGGER.info(":::::::::::::::Method ParameterCount::::"+method.getParameterCount());
		LOGGER.info(":::::::::::::::Method ReturnType::::"+method.getReturnType());
		LOGGER.info(":::::::::::::::Method className::::"+method.getClass());
	}

}
