package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import basic.Attendance;

public class Client {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Attendance a = (Attendance) context.getBean("ragav");
		System.out.println(a.getAttendanceSheet());

	}
}
