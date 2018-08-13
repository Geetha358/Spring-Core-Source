package utilities;

import org.springframework.stereotype.Component;

@Component
public class Substraction implements Calculator{
public void calculate() {
	System.out.println("Substraction");
}
}
