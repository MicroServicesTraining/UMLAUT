/**
 * 
 */
package com.mm.sb.oauth2.entities;

/**
 * @author dorak
 *
 */
public class Student {
	
	private long rollNo;
	private String name;
	private String course;
	
	public Student() {}
	
	public Student(int rollNo, String name, String course) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}
	/**
	 * @return the rollNo
	 */
	public long getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
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
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + "]";
	}
	
	
}
