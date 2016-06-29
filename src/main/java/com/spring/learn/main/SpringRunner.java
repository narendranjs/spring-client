/**
 * 
 */
package com.spring.learn.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.learn.Employee;
import com.spring.learn.Student;

/**
 * @author Narendran (narendran.js@gmail.com)
 *
 */
public class SpringRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("applicationContext.xml");
	    BeanFactory factory=new XmlBeanFactory(resource);
	      
	    Student student=(Student)factory.getBean("studentbean");
	    student.displayInfo();

	    Employee employee = (Employee)factory.getBean("employeeBean");
	    System.out.println(employee.getTime());
	    
	    Employee employee1 = (Employee)factory.getBean("employeeBean");
	    System.out.println(employee1.getTime());
	    
	    if(employee==employee1){
	    	System.out.println("both are equal");
	    }
	    
	    if(employee!=employee1){
	    	System.out.println("both are not equal");
	    }
	}

}
