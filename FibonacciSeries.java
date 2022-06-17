package firstprogram;

public class FibonacciSeries {
public static void main(String[] args) {
	int range = 8;
	int firstNum = 0;
	int secondNum = 1;
	int sum;
	System.out.println(firstNum);
	for (int i=1; i<=range; i++)
	{
		sum = firstNum + secondNum;
		firstNum =  secondNum;
		secondNum = sum;
		System.out.println(sum);	
	}
}
}
