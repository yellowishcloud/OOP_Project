package controllers;

import java.util.Vector;

import dll.DBContext;
import models.Manager;
import models.Student;
import models.Teacher;
import models.Admin;
import models.User;
import models.UserType;

public class UserController {
	
	public static boolean createUser(
			String username,
			String password, 
			UserType type) {
		switch(type) {
			case TEACHER:
				Teacher newTeacher = new Teacher(username, password);
				DBContext.teacher.add(newTeacher);
				return DBContext.saveTeachers();
				
			case STUDENT:
				Student newStudent = new Student(username, password);
				DBContext.student.add(newStudent);
				return DBContext.saveStudents();
				
			case MANAGER:
				Manager newManager = new Manager(username, password);
				DBContext.manager.add(newManager);
				return DBContext.saveManagers();
				
			case ADMIN:
				Admin newAdmin = new Admin(username, password);
				DBContext.admin.add(newAdmin);
				return DBContext.saveAdmins();
				
			default:
				return false;
		}
		//return true;
	}
	
	public static Object getUsers(UserType type) {
		switch(type) {
		case TEACHER:
			return DBContext.getTeachers();
		case STUDENT:
			return DBContext.getStudents();
		case ADMIN:
			return DBContext.getAdmins();
		case MANAGER:
			return DBContext.getManagers();
		default:
			return null;
		}
	}
	
	
	
	public static boolean authorize(String fileName, String username, String password) {
		if(fileName.equals("teacher.txt")) {
			Vector<Teacher> teachers = (Vector<Teacher>) getUsers(UserType.TEACHER);
			
			for(Teacher t: teachers) {
				if (t.getUsername().equals(username)
						&& t.getPassword().equals(password))
					return true;
			}
		}
		if(fileName.equals("manager.txt")) {
			Vector<Manager> managers = (Vector<Manager>) getUsers(UserType.MANAGER);
			for(Manager m: managers) {
				if (m.getUsername().equals(username)
						&& m.getPassword().equals(password))
					return true;
			}
		}
		if(fileName.equals("admin.txt")) {
			Vector<Admin> admins = (Vector<Admin>) getUsers(UserType.ADMIN);
			for(Admin m: admins) {
				if (m.getUsername().equals(username)
						&& m.getPassword().equals(password))
					return true;
			}
		}
		if(fileName.equals("student.txt")) {
			Vector<Student> students = (Vector<Student>) getUsers(UserType.STUDENT);
			for(Student s: students) {
				if (s.getUsername().equals(username)
						&& s.getPassword().equals(password))
					return true;
			}
		}
		
		return false;
	}
}