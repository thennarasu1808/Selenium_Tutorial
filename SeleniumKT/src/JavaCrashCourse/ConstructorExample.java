package JavaCrashCourse;

public class ConstructorExample {
	String myName;
	int	myId;
	
	public ConstructorExample(String name, int id) {
		myName = name;
		myId = id; 

		}
	
	public void getEmployeeDetail() {
		System.out.println("My name is :" + myName +" and my Id is :"+myId );
	}
	
	
	public static void main(String[] args) {
		
ConstructorExample cons1 = new ConstructorExample("Thenna", 69);
cons1.getEmployeeDetail();
ConstructorExample cons2 = new ConstructorExample("Rithi", 8);
cons2.getEmployeeDetail();
	}

}
