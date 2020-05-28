package JavaCrashCourse;

public class HelloWorld {
	   int a = 5;
	   int b = 8;
		
	   public int getCal() {
			 
			int c = a+b;
			return c;
		}
	   
	   
	    Integer amountCollected = 1000;
		
	   public Integer collectAmountAndGive() {
		   System.out.println("Appa, I have collected the amont :"+1000+ " ,and sent it to you");
		   return amountCollected;
		   
	   }
	   
		public static void main(String[] args) {
			
			HelloWorld obj = new HelloWorld();
			System.out.println(obj.a);
			System.out.println(obj.b);
			int value = obj.getCal();
			System.out.println(value);
			Integer amount = obj.collectAmountAndGive();
			System.out.println("Son i have got the " +amount);
			
			
					
	}

}

