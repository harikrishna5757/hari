package arrayCondition;
import java.util.Scanner;
public class GivenNumberDivisibleSumOfDigit {
int n,h,i;
int sum;
int division;
int []number=new int[5];
int []divied=new int[5];
int []divieds=new int[5];
	void input()
	{
		for(i=0;i<=4;i++)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		number[i]=sc.nextInt();
		divied[i]=number[i];
	}
	}
	void process()
	{
		for(i=0;i<=4;i++)
		{
		int sum=0;
		while(number[i]>0)
		{
		int remainter=number[i]%10;
		sum=sum+remainter;
		number[i]=number[i]/10;
		divieds[i]=sum;
		}
		
		System.out.println(sum);
		//divieds[k]=divied[j]%sum;
	}
//	}
//	void output()
//	{
		for(i=0;i<=4;i++)
		{
     if(divied[i]%divieds[i]==0)
     {
    	 System.out.println("good");
     }
     else
     {
    	 System.out.println("not good");
     }
	}
	}
	//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GivenNumberDivisibleSumOfDigit d=new GivenNumberDivisibleSumOfDigit();
		d.input();
		d.process();
		//d.output();
	
	}
}