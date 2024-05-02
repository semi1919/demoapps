package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
		public class softassertt
		{
		@Test
		public void test()
		{
			String Actualresult="Qspiders";
			String Expectedresult="jspiders";
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(Actualresult, Expectedresult);
			sa.assertAll();
			//if condition fails then controller will not go to next line 
			System.out.println("the result is matching");
			
			
		}
		}

	}
