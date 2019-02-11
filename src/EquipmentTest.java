/**
 * Testing for class Equipment object
 * 
 * @author Ry Fleming
 * @version 2019-02-11
 * 
 */


public class EquipmentTest
{
	
	/**
	 * Test the Equipment constructor and the getters, using two different items
	 */

	public void ConstructorTest() throws AssertException
	{
		//Test 1
		//arbitrary string of proper format
		String strg1 = "name/5,5.0,50.0,a test description";
		
		
		//use the constructor
		Equipment test1 = new Equipment(strg1);
		
		//The name should be "name", count should be 5, totalWeight should be 5.0, totalPrice should be 50.0, 
		//and description should be "a test description"
		Assert.assertEquals("name", test1.getName());
		Assert.assertEquals(5, test1.getCount());
		Assert.assertEquals(5.0, test1.getTotalWeight(), .01);
		Assert.assertEquals(50.0, test1.getTotalPrice(), .01);
		Assert.assertEquals("a test description", test1.getDescription());
		
			//Test 1
			//arbitrary string of proper format
			String strg2 = "Nail/30,1.5,15.0,something to hammer";
				
				
			//use the constructor
			Equipment test2 = new Equipment(strg2);
				
			//The name should be "name", count should be 5, totalWeight should be 5.0, totalPrice should be 50.0, 
			//and description should be "a test description"
			Assert.assertEquals("Nail", test2.getName());
			Assert.assertEquals(30, test2.getCount());
			Assert.assertEquals(1.5, test2.getTotalWeight(), .01);
			Assert.assertEquals(15.0, test2.getTotalPrice(), .01);
			Assert.assertEquals("something to hammer", test2.getDescription());
		
	}
	
	/**
	 * Test the class Equipment toString() method, using two different items
	 * @throws AssertException
	 */
	
	public void toStringTest() throws AssertException
	{
		//Test 1
		//arbitrary string of proper format
		String strg1 = "name/5,5.0,50.0,a test description";
		
		Equipment test1 = new Equipment(strg1);
		Assert.assertEquals("Name: name, Number: 5, Weight: 5.00 lbs, Price: $50.00 - a test description", test1.toString());
		
			//Test 2
			//arbitrary string of proper format
			String strg2 = "Nail/30,1.5,15.0,something to hammer";
				
			Equipment test2 = new Equipment(strg2);
			Assert.assertEquals("Name: Nail, Number: 30, Weight: 1.50 lbs, Price: $15.00 - something to hammer", test2.toString());
	}
	
	/**
	 * Test the class Equipment equals() method, using two different items
	 * @throws AssertException
	 */
	
	public void equalsTest() throws AssertException
	{
		//Test 1
		//arbitrary string of proper format
		String strg1 = "name/5,5.0,50.0,a test description";
		
		Equipment testA = new Equipment(strg1);
		Equipment testB = new Equipment(strg1);
		
		
		//Test same-object condition of method
		Assert.assertTrue(testA.equals(testB));
		
		//Test not-an-Equipment condition of method
		Assert.assertFalse(testA.equals(strg1));
		
		//Test all-fields-match condition of method
		Assert.assertEquals("name", testA.getName());
		Assert.assertEquals(5, testA.getCount());
		Assert.assertEquals(5.0, testA.getTotalWeight(), .01);
		Assert.assertEquals(50.0, testA.getTotalPrice(), .01);
		Assert.assertEquals("a test description", testA.getDescription());
		
		
			//Test 2
			//arbitrary string of proper format
			String strg2 = "Nail/30,1.5,15.0,something to hammer";
				
			Equipment testC = new Equipment(strg2);
			Equipment testD = new Equipment(strg2);
				
				
			//Test same-object condition of method
			Assert.assertTrue(testC.equals(testD));
				
			//Test not-an-Equipment condition of method
			Assert.assertFalse(testC.equals(strg2));
				
			//Test all-fields-match condition of method
			Assert.assertEquals("Nail", testC.getName());
			Assert.assertEquals(30, testC.getCount());
			Assert.assertEquals(1.5, testC.getTotalWeight(), .01);
			Assert.assertEquals(15.0, testC.getTotalPrice(), .01);
			Assert.assertEquals("something to hammer", testC.getDescription());
		
		
	}
	
}