/**
 * Testing for class Zoo object
 * 
 * @author Ry Fleming
 * @version 2019-02-11
 * 
 */

public class ZooTest
{

	/**
	 * Test class Zoo getTotalHeight() method
	 * @throws AssertException
	 */
	public void getTotalHeightTest() throws AssertException
	{
		
		Zoo test = new Zoo(0);
		Animal lion = new Animal("Yellow", "Simba", 50.0, 30.0);
		Animal tiger = new Animal("Orange", "Garfield", 80.0, 50.0);
		Animal bear = new Animal("Brown", "Yogi", 120.0, 70.0);
		
		test.addAnimal(lion);
		test.addAnimal(tiger);
		test.addAnimal(bear);
		
		Assert.assertEquals(150.0, test.getTotalHeight(), .01);
		
	}
	
	/**
	 * Test class Zoo getCapacity() method
	 * @throws AssertException
	 */
	public void getCapacityTest() throws AssertException
	{

		Zoo test = new Zoo(0);
		Animal lion = new Animal("Yellow", "Simba", 50.0, 30.0);
		Animal tiger = new Animal("Orange", "Garfield", 80.0, 50.0);
		Animal bear = new Animal("Brown", "Yogi", 120.0, 70.0);
		
		test.addAnimal(lion);
		test.addAnimal(tiger);
		test.addAnimal(bear);
		
		Assert.assertEquals(4, test.getCapacity());
	}
	
	/**
	 * Test class Zoo toString() method
	 * @throws AssertException
	 */
	public void toStringTest() throws AssertException
	{

		Zoo test = new Zoo(0);
		Animal lion = new Animal("yellow", "Simba", 50.0, 30.0);
		Animal tiger = new Animal("orange", "Garfield", 80.0, 50.0);
		Animal bear = new Animal("brown", "Yogi", 120.0, 70.0);
		
		test.addAnimal(lion);
		test.addAnimal(tiger);
		test.addAnimal(bear);
		
		String strg = "These animals live in the zoo: \n" + "Simba, a Yellow-colored animal. 50.0 pounds, 30.0 inches\n" +
					  "Garfield, a Orange-colored animal. 80.0 pounds, 50.0 inches\n" +
					  "Yogi, a Brown-colored animal. 120.0 pounds, 70.0 inches\n";
		
		Assert.assertEquals(strg, test.toString());
	}
	
}