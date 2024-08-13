package fizzbuzz;

public class index {

	public static void main(String[] args) {
		int number =1;
		
		while (number <= 100) {
		if(number%3 ==0 && number%5 ==0) {
			System.out.println("fizzbuzz");
		}else if(number%5 ==0) {
			System.out.println("buzz");
		}else if (number%3 ==0) {
			System.out.println("fizz");
		}else {
			System.out.println(number);
		}
		number++;
		}

	}

}
