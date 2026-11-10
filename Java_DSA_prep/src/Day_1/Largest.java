package Day_1;

public class Largest {
	public static void main(String[]args) {
		int a=56;
		int b=78;
		int c=45;
		
		if(a>b && a>c) {
			System.out.println(a+ " Is the greatest among 3 numbers");
		}
		else if(b>c && b>a) {
			System.out.println(b+" Is the greatest among 3 numbers");
		}
		else {
			System.out.println(c+"Is the greatest among 3 numbers");
		}
	}

}
