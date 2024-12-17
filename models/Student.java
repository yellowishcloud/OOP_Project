package models;
import java.util.Vector;
public class Student extends User {
	
	private Vector<Organization> organizations;
	
	private int studyYear;
	
	private Vector<Course> passedCourses;
	
	private Vector<Integer> enrolledCourseId;
	
	
	private School school;
	private int credits;
	{
		passedCourses = new Vector<Course>();
		organizations = new Vector<Organization>();
		enrolledCourseId = new Vector<Integer>();
		
	}
	public Student(String username, String password) {
		super(username, password);
	}
	public Vector<Integer> getEnrolledCourseId() {
		return enrolledCourseId;
	}
	public void setEnrolledCourseId(Vector<Integer> enrolledCourseId) {
		this.enrolledCourseId = enrolledCourseId;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Vector<Organization> getOrganizations() {
		return organizations;
	}
	public void setOrganizations(Vector<Organization> organizations) {
		this.organizations = organizations;
	}
	public int getStudyYear() {
		return studyYear;
	}
	public void setStudyYear(int studyYear) {
		this.studyYear = studyYear;
	}
	public Vector<Course> getPassedCourses() {
		return passedCourses;
	}
	public void setPassedCourses(Vector<Course> passedCourses) {
		this.passedCourses = passedCourses;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
}
