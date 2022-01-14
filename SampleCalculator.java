import java.util.*;

class SampleCalculator{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		boolean done=false;
		while(!done){
			System.out.print("\n1)Add two numbers");
			System.out.print("\n2)Exit");
			System.out.print("\nEnter choice:");
			int ch=sc.nextInt();
			switch(ch){
				case 1:
					System.out.print("\nEnter first number:");
					double num1=sc.nextDouble();
					System.out.print("\nEnter second number:");
					double num2=sc.nextDouble();
					System.out.print("\nAddition:"+(num1+num2));
					break;
				case 2:
					System.out.print("\nExiting...");
					done=true;
					break;
				default:
					System.out.print("\nWrong choice");
					break;
			}
		}
	}
}
