import org.testng.annotations.Test;

public class Tc_04Test {
	@Test(groups = "smoke")
	public void testMethod() {
		System.out.println("build created-----");
	}
	@Test(groups = "regression")
	public void testMethod2() {
		System.out.println("build created succesfully----");
	}


}
