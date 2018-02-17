import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int ch;
		Scanner s=new Scanner(System.in);
		for(;;)
		{
		System.out.println("enter 5 to exit");
		System.out.println("1.Addition\n2.Subtraction\n3.Division\n4.Multiplication");
		ch=s.nextInt();
		if(ch==5)
			break;
		int num1,num2;
		System.out.println("enter the 2 numbers");
		num1=s.nextInt();
		num2=s.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("result:"+(num1+num2));
			break;
		case 2:
			System.out.println("result"+(num1-num2));
			break;
		case 3:
			System.out.println("result"+(num1/num2));
			break;
		case 4:
			System.out.println("result"+(num1*num2));
			break;
		}
			// TODO Auto-generated method stub
		}

	}

}
