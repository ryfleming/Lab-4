/**
 * Testing for class Equipment object
 * 
 * @author Ry Fleming
 * @version 2019-02-10
 * 
 */

public class EquipmentTest
{
	
	/**
	 * Test the Equipment constructor and the getters
	 */
	
	public void ConstructorTest() throws AssertException
	{
		//arbitrary string of proper format
		String strg = "name/5,5.0,50.0,a test description";
		
		
		//use the constructor
		Equipment test = new Equipment(strg);
		
		//The name should be "name", count should be 5, totalWeight should be 5.0, totalPrice should be 50.0, 
		//and description should be "a test description"
		Assert.assertEquals("name", test.getName());
		Assert.assertEquals(5, test.getCount());
		Assert.assertEquals(5.0, test.getTotalWeight(), .01);
		Assert.assertEquals(50.0, test.getTotalPrice(), .01);
		Assert.assertEquals("a test description", test.getDescription());
		
	}
	
	/**
	 * Test the class Equipment toString() method
	 * @throws AssertException
	 */
	
	public void toStringTest() throws AssertException
	{
		//arbitrary string of proper format
		String strg = "name/5,5.0,50.0,a test description";
		
		Equipment test = new Equipment(strg);
		Assert.assertEquals("Name: name, Number: 5, Weight: 5.00 lbs, Price: $50.00 - a test description", test.toString());
		
	}
	
	/**
	 * Test the class Equipment equals() method
	 * @throws AssertException
	 */
	
	public void equalsTest() throws AssertException
	{
		
	}
	
}