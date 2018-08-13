package basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import utilities.Calculator;

@Component
@Scope("singleton")
public class Ragav implements Attendance {

	@Value("${user}")
	private String username;

	@Value("${password}")
	private String password;

	private Calculator calculator;

	/*
	 * @Autowired
	 * 
	 * @Qualifier("addition") private Calculator calculator;
	 */
	@Autowired
	public Ragav(@Qualifier("substraction") Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public String getAttendanceSheet() {
		System.out.println(password);
		System.out.println(username);
		calculator.calculate();
		return "Submitted the Attendance";
	}
}
