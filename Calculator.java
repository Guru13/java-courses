/**
 *Реализует класс калькулятор
 */
public class Calculator{
	/**
	*Результат вычисления
	*/
	private double result;
	/**
	*Суммируем аргументы.
	*@param first первое слагаемое.
	*@param second второе слагаемое.
	*/
	public void add(double first, double second){
		double summ = first + second;
		this.result += summ;
	}
	/**
	*Вычитаем аргументы.
	*@param first уменьшаемое.
	*@param second вычитаемое.
	*/
	public void sub(double first, double second){	
		double sub = first - second;
		if (this.result == 0){
			this.result = sub;
		}else{
			this.result /= sub;
		}		
	}
	
	/**
	*Умножаем аргументы.
	*@param first первый множитель.
	*@param second второй множитель.
	*/
	public void mul(double first, double second){
		double mul = first * second;
		if (this.result == 0){
			this.result = mul;
		}else{
			this.result *= mul;
		}
	}
	/**
	*Делим аргументы.
	*@param делимое.
	*@param делитель.
	*/
	public void div(double first, double second){
		double div = first / second;
		if (this.result == 0){
			this.result = div;
		}else{
			this.result /= div;
		}		
	}
	/**
	*Возведение в степень.
	*@param first основание степени.
	*@param second показатель степени. Только натуральная.
	*/
	public void inv(double first, int second){
		double inv = first;
		if (second == 0){
			inv = 1;
		}
		if(second >= 2){
			for (int i = 1; i < second; i++){
				inv = inv * first;
			}
		}
		this.result = inv;
	}
	/**
	*Получить результат.
	*@return результат вычисления.
	*/
	public double getResult(){
		return this.result;
	}
	/**
	*Очистить результат вычисления
	*/
	public void cleanResult(){
		this.result = 0;
	}
}
	
	
	
