package models;


import java.util.Vector;

import java.util.Map;
import java.util.*;
public class Course {
	
	private String courseName;
	private Vector<Teacher> instructors;
	private Vector<Course> prereq;
	private ElectiveType elective;
	private Vector<School> schools;
	private int costInCredits;
	private Map <Student,Mark> marks;
	private Vector<Lesson> lessons;

	{
		
		lessons = new Vector<Lesson>();
		instructors = new Vector<Teacher>();
		prereq = new Vector<Course>();
		marks = new HashMap<Student, Mark>();
	}
	
	public Course() {
		
	}
	
    public Course(String courseName, ElectiveType elective, Vector<School> schools, int costInCredits,
			Vector<Lesson> lessons) {
		super();
		this.courseName = courseName;
		this.elective = elective;
		this.schools = schools;
		this.costInCredits = costInCredits;
		this.lessons = lessons;
	}
    
    
    public String getCourseName() {
        return this.courseName;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public Vector<Teacher> getInstructors() {
        return this.instructors;
    }
    
    
    public void setInstructors(Vector<Teacher> instructors) {
        this.instructors = instructors;
    }
    
    public void addInstructors(Teacher teacher) {
        this.instructors.add(teacher);
    }
    
    public void removeInstructor(Teacher teacher) {
        this.instructors.remove(teacher);
    }
    
    public Vector<Course> getPrereq() {
        return this.prereq;
    }

    public void setPrereq(Vector<Course> prereq) {
        this.prereq = prereq;
    }
    
    public void addPrereq(Course prereq) {
        this.prereq.add(prereq);
    }
    
    public void removePrereq(Course prereq) {
        this.prereq.remove(prereq);
    }
    
    public ElectiveType getElective() {
        return this.elective;
    }
   
    public void setElective(ElectiveType elective) {
        this.elective = elective;
    }
    
    public Vector<School> getSchools() {
        return this.schools;
    }
    
    public void setSchools(Vector<School> schools) {
        this.schools = schools;
    }
    
    public int getCostInCredits() {
        return this.costInCredits;
    }
    
    public void setCostInCredits(int costInCredits) {
        this.costInCredits = costInCredits;
    }
   
    public Map<Student, Mark> getMarks() {
        return this.marks;
    }
    
    public Vector<Lesson> getLessons() {
        return this.lessons;
    }

    public void setLessons(Vector<Lesson> lessons) {
        this.lessons = lessons;
    }

    public void addLesson(Lesson lesson) {
        this.lessons.add(lesson);
    }

    public Mark getMark(Student student) {
        return this.marks.get(student);
    }
}
