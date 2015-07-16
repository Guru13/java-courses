import java.util.Scanner;
/**
  *Класс для запуска калькулятора. Поддерживает ввод пользователя.
  */

public class InteractRunner {
	public static void main(String[] args){						
		InteractRunner runner = new InteractRunner();
		runner.go();
	}
	public  Scanner reader = new Scanner(System.in);
	/**
	  *Операция вычисления (add/div/sub/mul).
	  */
	public  String operation = null;
	public  Calculator calc = new Calculator();
	/**
	  *Выходим или нет из программы y/n.
	  */
	public  String exit = "n";
	/**
	  *Сбрасываем результат или нет y/n.
	  */
	public  String cleanResult = "";
	/**
	  *первый параметр.
	  */
	public  String first = null;
	/**
	  *Второй параметр.
	  */
	public  String second = null;
	
	/**
	  *Запуск
	  */
	public void go(){
	try{														
		while(!exit.equals("y")){
			chooseOperation();
			enterParams();
				
			if (operation != null && operation.equals("add")){
				calc.add(Double.valueOf(first), Double.valueOf(second));
				report();
				setClean();
				setExit();
			}
			if (operation != null && operation.equals("sub")){
				calc.sub(Double.valueOf(first), Double.valueOf(second));
				report();
				setClean();
				setExit();
			}
			if (operation != null && operation.equals("div")){
				calc.div(Double.valueOf(first), Double.valueOf(second));
				report();
				setClean();
				setExit();
			}
			if (operation != null && operation.equals("mul")){
				calc.mul(Double.valueOf(first), Double.valueOf(second));
				report();
				setClean();
				setExit();
			}		
			if (operation != null && operation.equals("inv")){
				calc.inv(Double.valueOf(first), Integer.valueOf(second));
				report();
				setExit();
			}	
		}		
		}finally{
			reader.close();
		}
	}
	/**
	  * Выбор операции
	  */
	public  void chooseOperation(){
		System.out.println("Choose your operation: " + "add/div/sub/mul/inv");
			operation = reader.next();
			while (!operation.equals("add") && !operation.equals("div") && !operation.equals("sub") && !operation.equals("mul") && !operation.equals("inv")){
				System.out.println("You should write: " + "add/div/sub/mul/inv");
				operation = reader.next();
			}
	}
	/**
	  * Ввод параметров
	  */
	public  void enterParams(){
		System.out.println("Enter first arg: ");
		first = reader.next();
        
		while (first.matches("\\D")){
		System.out.println("You should enter a number!");
		first = reader.next();
		}
		System.out.println("Enter second arg: ");
		second = reader.next();
		while (second.matches("\\D")){
		System.out.println("You should enter a number!");
		second = reader.next();
		}
	}
	/**
	  *Вывод результата и запрос на стирание результата
	  */
	public  void report(){
		System.out.println("Result: " + calc.getResult());	
	}
	/**
	  * Сбрасываем результат
	  */
	public void setClean(){
		System.out.println("clean result: " + "y/n");
		cleanResult = reader.next();
			if(!cleanResult.equals("y") && !cleanResult.equals("n")){
				while(!cleanResult.equals("y") && !cleanResult.equals("n")){
						System.out.println("clean result: " + "y/n");
						cleanResult = reader.next();
				}
			}
			if (cleanResult.equals("y")){
				calc.cleanResult();							
			}
	}
	/**
	  * Спрашиваем выход
	  */
	public void setExit(){
			System.out.println("Exit: y/n");
			exit = reader.next();
			while (!"y".equals(exit) && !"n".equals(exit)){
				System.out.println("You should enter y or n");
				exit = reader.next();
			}
	}

}

