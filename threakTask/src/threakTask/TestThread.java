package threakTask;

import java.util.Scanner;

public class TestThread {

	private static Scanner sc;

	public static void main(String[] args) throws InterruptedException {
		
//Create 3 objects.
		
		Student st1 = new Student();
		Thread my_thread1 = new Thread(st1);
		Student st2 = new Student();
		Thread my_thread2 = new Thread(st2);
		Student st3 = new Student();
		Thread my_thread3 = new Thread(st3);
		
		System.out.println("Please enter student name " + "" );
		sc = new Scanner(System.in);
		String name = sc.next();
	    st1.setName(name);
	    st2.setName(name);
	    st3.setName(name);
	    
	    System.out.println("Please enter student Number " + "" );
	    int number = sc.nextInt();
	    st1.setNumber(number);
	    st2.setNumber(number);
	    st3.setNumber(number);
	    
	    System.out.println("Please enter Student Faculty " + "" );
	    String faculty = sc.next();
	    st1.setFaculty(faculty);
	    st2.setFaculty(faculty);
	    st3.setFaculty(faculty);
	    
	    System.out.println("Pleas Enter Grade name");
	    String grade_name = sc.next();
	    st1.setGrade_name(grade_name);
	    
	    st2.setGrade_name(grade_name);
	    st3.setGrade_name(grade_name);
	    
	    System.out.println("Please Enter Grade Mark");
	    double grade_mark = sc.nextDouble();
	    
	    st1.setMark(grade_mark);
	    st2.setMark(grade_mark);
	    st2.setMark(grade_mark);
	    
	    
	    my_thread1.start();
		my_thread2.start();
		my_thread3.start();

	}
	

}
