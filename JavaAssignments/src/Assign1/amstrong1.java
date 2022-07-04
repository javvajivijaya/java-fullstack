package Assign1;

public class amstrong1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, count = 0, a, b, c, sum = 0;
        System.out.print("Armstrong numbers from 100 to 999:");       
        for(int i = 100; i <= 999; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10; 
            }
            if(sum == i)
            {
                System.out.print(i + "Amstrong number\n  ");
                
            }
            
           sum = 0;
        }

	}

}
