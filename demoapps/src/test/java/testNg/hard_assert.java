package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hard_assert {
	public class hardassert
	{
	@Test
	public void test()
	{
		String Actualresult="Qspiders";
		String Expectedresult="jspiders";
		Assert.assertEquals(Actualresult, Expectedresult);
	}
	public void testcontains()
	{
		String Actualresult="Qspiders";
		String Expectedresult="jspiders";
		Assert.assertTrue(Actualresult.contains(Expectedresult));
	}
	}

}
