package com.ado.advices;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class BeforeHighJack implements MethodBeforeAdvice {
	private final static Logger LOGGER = Logger.getLogger(BeforeHighJack.class.getName());

	public void before(Method method, Object[] arg1, Object arg2) throws Throwable {
		LOGGER.info(":::::::::::::::Method Name::::"+method.getName());
		LOGGER.info(":::::::::::::::Method ParameterCount::::"+method.getParameterCount());
		LOGGER.info(":::::::::::::::Method ReturnType::::"+method.getReturnType());
		LOGGER.info(":::::::::::::::Method className::::"+method.getClass());
						
	}

}
