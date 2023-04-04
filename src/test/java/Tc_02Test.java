import org.testng.annotations.Test;

public class Tc_02Test {
	@Test(groups = "regression")
	public void testMethod3() {
		System.out.println("build created-----03");
	}
	@Test(groups = "smoke")
	public void testMethod4() {
		System.out.println("build created-----04");
		
		System.out.println("build created--manju");
	}


}
