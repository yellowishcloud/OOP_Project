package dll;

import java.util.Vector;

import models.Teacher;
import models.Manager;
import models.Admin;
import models.Student;
public class DBContext {
	
	private static final String fullPath = "D:\\Desktop\\oop\\practise\\week1\\university management system\\src\\data\\";
	private static DBContext db = new DBContext();
	
	public static Vector<Teacher> teacher;
	public static Vector<Manager> manager;
	public static Vector<Student> student;
	public static Vector<Admin> admin;
	
//	{
//		this.teacher = new Vector<Teacher>();
//		
//		this.teacher.add(new Teacher("a.izbassar", "1234f"));
//		this.saveTeachers();
//		
//		this.teacher = getTeachers();
//	}
	
	
	private DBContext() {
		teacher = new Vector<>();
        manager = new Vector<>();
        student = new Vector<>();
        admin = new Vector<>();

        teacher.add(new Teacher("a.izbassar", "1234f"));
        manager.add(new Manager("k.alimova", "1234f"));
        admin.add(new Admin("s.tasbolatov", "1234f"));
        student.add(new Student("a.akniet", "1234f"));

        saveTeachers();
        saveManagers();
        saveAdmins();
        saveStudents();

        teacher = getTeachers();
        manager = getManagers();
        admin = getAdmins();
        student = getStudents();
    }
    
	
	
	public static Vector<Manager> getManagers() {
		Object o = ReaderWriter.deserialize(fullPath + "manager.txt");
		
		if (o instanceof Vector) {
			return (Vector<Manager>) o;
		}
		return null;
	}
	
	public static Vector<Admin> getAdmins() {
		Object o = ReaderWriter.deserialize(fullPath + "admin.txt");
		
		if (o instanceof Vector) {
			return (Vector<Admin>) o;
		}
		return null;
	}
	
	public static Vector<Teacher> getTeachers() {
		Object o = ReaderWriter.deserialize(fullPath + "teacher.txt");
		
		if (o instanceof Vector) {
			return (Vector<Teacher>) o;
		}
		return new Vector<>(); // Return an empty vector if deserialization fails
	}
	public static Vector<Student> getStudents() {
		Object o = ReaderWriter.deserialize(fullPath + "student.txt");
		
		if (o instanceof Vector) {
			return (Vector<Student>) o;
		}
		return null;
	}
	
	public static boolean saveTeachers() {
		return ReaderWriter.serialize(teacher, fullPath + "teacher.txt");
	}
	public static boolean saveManagers() {
		return ReaderWriter.serialize(manager, fullPath + "manager.txt");
	}
	public static boolean saveAdmins() {
		return ReaderWriter.serialize(admin, fullPath + "admin.txt");
	}
	public static boolean saveStudents() {
		return ReaderWriter.serialize(student, fullPath + "student.txt");
	}
	public static DBContext getDb() {
        return db;
    }
	
//	public static Vector<Teacher> getTeachers() {
//        return deserialize(fullPath + "teachers.txt");
//    }

//	@SuppressWarnings("unchecked")
//    private static <T> Vector<T> deserialize(String filePath) {
//        Object o = ReaderWriter.deserialize(filePath);
//        if (o instanceof Vector) {
//            return (Vector<T>) o;
//        }
//        return new Vector<>();
//    }
//
//    private static boolean serialize(Vector<?> data, String filePath) {
//        return ReaderWriter.serialize(data, filePath);
//    }
	
	
}