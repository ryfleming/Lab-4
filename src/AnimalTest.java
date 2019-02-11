/**
 * Testing class for Animal object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 * 
 * @versionAuthor Ry Fleming
 * @version 2018-2-11
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        
    	// Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
        
    }

    /**
     * Test full Animal constructor and getters, with two different animals
     * @throws AssertException
     */
    
    public void fullConstructorTest() throws AssertException
    {
    	//Test 1
    	// Use full constructor with arbitrary, but appropriate, values for parameters
    	String colorA = "color";
    	String nameA = "name";
    	double heightA = 10.0;
    	double weightA = 10.0;
    	
    	Animal animalA = new Animal(colorA, nameA, heightA, weightA);
    	
    	// The name should be "name", color "color", height and weight 10.
    	Assert.assertEquals("color", animalA.getColor());
    	Assert.assertEquals("name", animalA.getName());
    	Assert.assertEquals(10.0, animalA.getHeight(), .01);
    	Assert.assertEquals(10.0, animalA.getWeight(), .01);
    	
    		//Test 1
    		// Use full constructor with arbitrary, but appropriate, values for parameters
    		String colorB = "Blue";
    		String nameB = "Jeff";
    		double heightB = 100.0;
    		double weightB = 100.0;
    	
    		Animal animalB = new Animal(colorB, nameB, heightB, weightB);
    	
    		// The name should be "name", color "color", height and weight 10.
    		Assert.assertEquals("Blue", animalB.getColor());
    		Assert.assertEquals("Jeff", animalB.getName());
    		Assert.assertEquals(100.0, animalB.getHeight(), .01);
    		Assert.assertEquals(100.0, animalB.getWeight(), .01);
    }
    
    /**
     * Test Animal toString method, with two different animals
     * @throws AssertException
     */
    public void toStringTest() throws AssertException
    {
    	//Test1
    	//Use arbitrary, but appropriate, string
    	String exptedA = "name, a color-colored animal. 10.0 pounds, 10.0 inches\n";
    	Animal animalA = new Animal("color", "name", 10.0, 10.0);
    	String actlA = animalA.toString();
    	Assert.assertEquals(exptedA, actlA);
    	
    		//Test2
    		//Use arbitrary, but appropriate, string
    		String exptedB = "Jeff, a Blue-colored animal. 100.0 pounds, 100.0 inches\n";
    		Animal animalB = new Animal("Blue", "Jeff", 100.0, 100.0);
    		String actlB = animalB.toString();
    		Assert.assertEquals(exptedB, actlB);
    	
    }
    /**
     * Test Animal equals() method, with two different animals
     * @throws AssertException
     */
    public void equalsTest() throws AssertException
    {
    	
    	//Test 1
    	String colorA = "color";
    	String nameA = "name";
    	double heightA = 10.0;
    	double weightA = 10.0;
    	
    	String strgA = "color, name, 10.0, 10.0";
    	
    	Animal testA = new Animal(colorA, nameA, heightA, weightA);
    	Animal testB = new Animal(colorA, nameA, heightA, weightA);
    			
    			
    	//Test same-object condition of method
    	Assert.assertTrue(testA.equals(testB));
    			
    	//Test not-an-Animal condition of method
    	Assert.assertFalse(testA.equals(strgA));
    			
    	//Test all-fields-match condition of method
    	Assert.assertEquals("color", testA.getColor());
    	Assert.assertEquals("name", testA.getName());
    	Assert.assertEquals(10.0, testA.getHeight(), .01);
    	Assert.assertEquals(10.0, testA.getWeight(), .01);
    	
    		//Test 1
    		String colorB = "Blue";
    		String nameB = "Jeff";
    		double heightB = 100.0;
    		double weightB = 100.0;
    	
    		String strgB = "Blue, Jeff, 100.0, 100.0";
    	
    		Animal testC = new Animal(colorB, nameB, heightB, weightB);
    		Animal testD = new Animal(colorB, nameB, heightB, weightB);
    			
    			
    		//Test same-object condition of method
    		Assert.assertTrue(testC.equals(testD));
    			
    		//Test not-an-Animal condition of method
    		Assert.assertFalse(testC.equals(strgB));
    			
    		//Test all-fields-match condition of method
    		Assert.assertEquals("Blue", testC.getColor());
    		Assert.assertEquals("Jeff", testC.getName());
    		Assert.assertEquals(100.0, testC.getHeight(), .01);
    		Assert.assertEquals(100.0, testC.getWeight(), .01);		
    }
    
}

