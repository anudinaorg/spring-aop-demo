package com.ado.advices;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class AroundAdvice implements MethodInterceptor {
	private final static Logger LOGGER = Logger.getLogger(AroundAdvice.class.getName());

	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		LOGGER.info(":::::::::::::::Method Name::::" +arg0.getMethod().getName());
		LOGGER.info(":::::::::::::::Method ParameterCount::::" + arg0.getMethod().getParameterCount());
		LOGGER.info(":::::::::::::::Method ReturnType::::" + arg0.getMethod().getReturnType());
		LOGGER.info(":::::::::::::::Method className::::" + arg0.getMethod().getClass());
		
		
		arg0.proceed();
		return arg0;
	}

}
