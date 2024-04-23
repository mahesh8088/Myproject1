package calsi1;
import java.util.Scanner;
public class Calsi1 {


		public static int add(int a, int b) {
		return (a + b);
		}
		public static int sub(int a, int b) {
		return (a - b);
		}
		public static int mul(int a, int b) {
		return (a * b);
		}
		public static int div(int a, int b) {
		return (a / b);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the first number ");
			int input = in.nextInt();
			Scanner in1 = new Scanner(System.in);
			System.out.println("Enter the Second number");
			int input1 = in1.nextInt();
			System.out.println(" The addition is :"+ Calsi1.add(input,input1));
			System.out.println(" The addition is :"+ Calsi1.sub(input,input1));
			System.out.println(" The addition is :"+ Calsi1.mul(input,input1));
			System.out.println(" The addition is :"+ Calsi1.div(input,input1));
			
		}

	}


