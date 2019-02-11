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
	 * Test class Zoo getTotalHeight() method, using two Zoos
	 * @throws AssertException
	 */
	public void getTotalHeightTest() throws AssertException
	{
		
		//Test 1
		Zoo test1 = new Zoo(1);
		Animal lion = new Animal("Yellow", "Simba", 50.0, 30.0);
		Animal tiger = new Animal("Orange", "Garfield", 80.0, 50.0);
		Animal bear = new Animal("Brown", "Yogi", 120.0, 70.0);
		
		test1.addAnimal(lion);
		test1.addAnimal(tiger);
		test1.addAnimal(bear);
		
		Assert.assertEquals(150.0, test1.getTotalHeight(), .01);
		
			//Test 2
			Zoo test2 = new Zoo(1);
			Animal duck = new Animal("Black", "Daffy", 12.0, 20.0);
			Animal rabbit = new Animal("Grey", "Bugs", 5.0, 15.0);
			Animal pig = new Animal("Pink", "Porky", 200.0, 60.0);
		
			test2.addAnimal(duck);
			test2.addAnimal(rabbit);
			test2.addAnimal(pig);
		
			Assert.assertEquals(95.0, test2.getTotalHeight(), .01);
		
	}
	
	/**
	 * Test class Zoo getCapacity() method, using two Zoos
	 * @throws AssertException
	 */
	public void getCapacityTest() throws AssertException
	{

		//Test 1
		Zoo test1 = new Zoo(1);
		Animal lion = new Animal("Yellow", "Simba", 50.0, 30.0);
		Animal tiger = new Animal("Orange", "Garfield", 80.0, 50.0);
		Animal bear = new Animal("Brown", "Yogi", 120.0, 70.0);
				
		test1.addAnimal(lion);
		test1.addAnimal(tiger);
		test1.addAnimal(bear);
				
		Assert.assertEquals(4, test1.getCapacity());
				
			//Test 2
			Zoo test2 = new Zoo(1);
			Animal duck = new Animal("Black", "Daffy", 12.0, 20.0);
			Animal rabbit = new Animal("Grey", "Bugs", 5.0, 15.0);
				
			test2.addAnimal(duck);
			test2.addAnimal(rabbit);
				
			Assert.assertEquals(2, test2.getCapacity());
	}
	
	/**
	 * Test class Zoo toString() method, using two Zoos
	 * @throws AssertException
	 */
	public void toStringTest() throws AssertException
	{

		//Test 1
		Zoo test1 = new Zoo(1);
		Animal lion = new Animal("Yellow", "Simba", 50.0, 30.0);
		Animal tiger = new Animal("Orange", "Garfield", 80.0, 50.0);
		Animal bear = new Animal("Brown", "Yogi", 120.0, 70.0);
						
		test1.addAnimal(lion);
		test1.addAnimal(tiger);
		test1.addAnimal(bear);
		
		String strg1 = "These animals live in the zoo: \n" + "Simba, a Yellow-colored animal. 50.0 pounds, 30.0 inches\n" +
					  "Garfield, a Orange-colored animal. 80.0 pounds, 50.0 inches\n" +
					  "Yogi, a Brown-colored animal. 120.0 pounds, 70.0 inches\n";
		
		Assert.assertEquals(strg1, test1.toString());
		
		
			//Test 2
			Zoo test2 = new Zoo(1);
			Animal duck = new Animal("Black", "Daffy", 12.0, 20.0);
			Animal rabbit = new Animal("Grey", "Bugs", 5.0, 15.0);
			
			test2.addAnimal(duck);
			test2.addAnimal(rabbit);
			
			String strg2 = "These animals live in the zoo: \n" + "Daffy, a Black-colored animal. 12.0 pounds, 20.0 inches\n" +
					  "Bugs, a Grey-colored animal. 5.0 pounds, 15.0 inches\n";
			
			Assert.assertEquals(strg2, test2.toString());
			
	}
	
}