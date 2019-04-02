
public class Question {

	public static void main(String[] args) {
		//What does this output?
		System.out.println(Fact(5));

	}
	
	public static int Fact(int n) {
		//Calculate the Factorial of n
		if(n == 1) {
			return 1;
		}
		else {
			return n*Fact(n);
		}
	}

}
