package Assign1;
import java.util.Scanner;

public class incometax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float r,x;

		Scanner s= new Scanner(System.in);

		System.out.println("Enter income");

		x=s.nextInt();



		if(x>500000)

		{

		r=x*(0.3f);

		}

		else if(x>300000)

		{

		r=x*(0.2f);



		}

		else if(x>180000)

		{

		r=x*(0.1f);

		}

		else

		{

		r=x;

		}

		System.out.println(r);


	}

}
