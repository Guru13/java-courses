import java.util.Scanner;
/**
  *  класс для запуска калькулятора с параметрами.
  */

public class ArgRunner {
	public static void main(String[] arg){
		
		System.out.println("Calculate...");
			if (arg.length == 2) {
				Calculator calc = new Calculator();								
				Integer first = Integer.parseInt(arg[0]);		
				Integer second = Integer.parseInt(arg[1]);
				calc.add(first,second);
				System.out.println("Result: " + calc.getResult());				
			} else {
				System.out.println("Enter two paramenters.");
		}
		
	}
}