package utilities;

import org.springframework.stereotype.Component;

@Component
public class Addition implements Calculator{
public void calculate()
{
	System.out.println("Addition");
	}
}
