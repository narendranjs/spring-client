/**
 * 
 */
package com.spring.learn;

/**
 * @author Narendran (narendran.js@gmail.com)
 *
 */
public class Student {
	
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo(){
		System.out.println("Hello: "+name);
	}

}
