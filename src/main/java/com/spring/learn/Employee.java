/**
 * 
 */
package com.spring.learn;

/**
 * @author Narendran (narendran.js@gmail.com)
 *
 */
public class Employee {

	private long currentTimeInMills;

	/**
	 * @return the currentTimeInMills
	 */
	public long getCurrentTimeInMills() {
		return currentTimeInMills;
	}

	/**
	 * @param currentTimeInMills the currentTimeInMills to set
	 */
	public void setCurrentTimeInMills(long currentTimeInMills) {
		this.currentTimeInMills = currentTimeInMills;
	}
	
	public long getTime(){
		setCurrentTimeInMills(System.currentTimeMillis());
		return currentTimeInMills;
	}
	
}
