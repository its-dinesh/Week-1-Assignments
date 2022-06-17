package firstprogram;

public class PrimeNumbers {
public static void main(String[] args) {
	/*
	 * Methodspractice obj = new Methodspractice(); boolean airBag = obj.airBag();
	 * System.out.println(airBag);
	 */
	
	int a = 13;
	boolean flag = false;
	for (int i =2; i<a/2; i++) {
		if (a%2==0)
		{
			flag=true;
			break;
			
		}
	}
	if(!flag)
	{
		System.out.println(a + " is a prime number");
	}
	else {
		System.out.println(a + " is not a prmie number");
		
	}
}
}
