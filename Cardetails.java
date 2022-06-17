package firstprogram;

public class Cardetails {
	public static void main(String[] args) {
		Cardetails obj = new Cardetails ();
		obj.printCarName();
		String carcolor = obj.getCarcolor();
		System.out.println(carcolor);
		boolean carPunctured = obj.isCarPunctured();
		System.out.println(carPunctured);
		int addTwoNumber = obj.addTwoNumber(5, 6);
		System.out.println(addTwoNumber);
		float subTwoNumber = obj.subTwoNumber(5, 2);
		System.out.println(subTwoNumber);
		double mutliplyTwoNumber = obj.mutliplyTwoNumber(6, 3);
		System.out.println(mutliplyTwoNumber);
		int divideTwonumbers = obj.divideTwonumbers(9, 3);
		System.out.println(divideTwonumbers);
	}
	
		public void printCarName() {
			System.out.println("Jaguar");
		}
		
		private String getCarcolor() {
			String color = "red";
			return color;
		}
		boolean isCarPunctured() {
			return false;
		}
		
			public int addTwoNumber(int a, int b) {
				return a+b;
			}
			
			public float subTwoNumber(float a,  float b) {
				return a-b;
				
			}
			
			public double mutliplyTwoNumber(double a, double b) {
				return a*b;
				
			}
			int a = 5;
			int b = a;
			public int divideTwonumbers(int a, int b) {
				System.out.println(a+b);
				return a/b;
			}
		}