import org.testng.annotations.Test;

public class Tc_03Test {
	@Test(groups = "regression")
	public void testMethod5() {
		System.out.println("build created-----05");
	}
	@Test(groups = "smoke")
	public void testMethod6() {
		System.out.println("build created-----06");
	}
	@Test(groups = "smoke")
	public void testMethod7() {
		System.out.println("build created-----07");
		System.out.println("build created-----08");
	}


}
