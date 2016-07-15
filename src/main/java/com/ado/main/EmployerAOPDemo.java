/**
 * 
 */
package com.ado.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ado.springaop.domain.Employer;

/**
 * @author Administrator
 *
 */
public class EmployerAOPDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "Spring-beans.xml" });
		Employer employer = (Employer) appContext.getBean("employerProxy");

		/*// Create an advice object
        BeforeAdvice beforeAdvice=new BeforeAdvice();
        ProxyFactory proxyFactory  = new ProxyFactory();
        proxyFactory.setTarget(employer);
        proxyFactory.addAdvice(beforeAdvice);
        
        Employer emp = (Employer)proxyFactory.getProxy();
		System.out.println("*************************");
		emp.printEmployerDetails();
		System.out.println("*************************");
		emp.printEmployerAddress();
		System.out.println("*************************");
		try {
			emp.printEmployerException();
		} catch (Exception e) {

		}*/
		System.out.println("*************************");
		employer.printEmployerDetails();
		System.out.println("*************************");
		employer.printEmployerAddress();
		System.out.println("*************************");
		try {
			employer.printEmployerException();
		} catch (Exception e) {

		}
	}
}
