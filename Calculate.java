/**
  * Класс подсчитывает сумму чисел, введенных с параметрами
  */
public class Calculate {
	public static void main(String[] arg){
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int summ = first + second;
		double firstD = Double.parseDouble(arg[2]);
		double secondD = Double.parseDouble(arg[3]);
		double div = firstD/secondD;
		System.out.println("Sum = " + summ);
		System.out.println("Div = " + div);
	}
}