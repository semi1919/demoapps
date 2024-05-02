
package testNg;

import org.testng.annotations.Test;
public class multiple_test {
	@Test (priority=1)

	public void register()
	{
		System.out.println("user is registered");
	}
	@Test (priority=2)
	public void login()
	{
		System.out.println("user is logged in");
	}
	@Test (priority=3)
	public void addproduc()
	{
		System.out.println("product added");
	}

}