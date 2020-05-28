package schedule2;

import org.testng.annotations.Test;

public class GroupsExample {
	
@Test(groups= {"sanity"})
	public void test1() {
		System.out.println("I am test1");
	}
@Test(groups= {"sanity"})
	public void test2() {
		System.out.println("I am test2");
	}
	
@Test(groups= {"integration"})
	public void test3() {
		System.out.println("I am test3");
	}
@Test(groups= {"BVT"})
	public void test4() {
		System.out.println("I am test4");
	}

@Test(groups={"sanity", "integration"})
	public void test5() {
		System.out.println("I am test5");
	}

}
