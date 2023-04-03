import org.testng.annotations.Test;

public class tc_01Test {

	@Test(groups = "smoke")
	public void testMethod() {
		System.out.println("build created-----01");
	}
	@Test(groups = "regression")
	public void testMethod2() {
		System.out.println("build created-----01");
	}

}
