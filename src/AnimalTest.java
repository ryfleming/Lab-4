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
     * Test full Animal constructor and getters
     * @throws AssertException
     */
    
    public void fullConstructorTest() throws AssertException
    {
    	
    	// Use full constructor with arbitrary, but appropriate, values for parameters
    	String color = "color";
    	String name = "name";
    	double height = 10.0;
    	double weight = 10.0;
    	
    	Animal animal = new Animal(color, name, height, weight);
    	
    	// The name should be "name", color "color", height and weight 10.
    	Assert.assertEquals("color", animal.getColor());
    	Assert.assertEquals("name", animal.getName());
    	Assert.assertEquals(10.0, animal.getHeight(), .01);
    	Assert.assertEquals(10.0, animal.getWeight(), .01);
    	
    }
    
    /**
     * Test Animal toString method
     * @throws AssertException
     */
    public void toStringTest() throws AssertException
    {
    	Animal animal = new Animal("blue", "Jeff", 100.0, 10.0);
    	String actl = animal.toString();
    	String expted = "Jeff, a blue-colored animal. 100.0 pounds, 10.0 inches\n";
    	Assert.assertEquals(expted, actl);
    	Assert.assertEquals(10.0, animal.getHeight());
    	Assert.assertEquals(10.0, animal.getWeight());
    	
    }
    
    public void equalsTest() throws AssertException
    {
    	String color = "color";
    	String name = "name";
    	double height = 10.0;
    	double weight = 10.0;
    	
    	String strg = "color, name, 10.0, 10.0";
    	
    	Animal test = new Animal(color, name, height, weight);
    			
    			
    	//Test same-object condition of method
    	Assert.assertTrue(this.equals(test));
    			
    	//Test not-an-Animal condition of method
    	Assert.assertFalse(test.equals(strg));
    			
    	//Test all-fields-match condition of method
    	Assert.assertEquals("color", test.getColor());
    	Assert.assertEquals("name", test.getName());
    	Assert.assertEquals(10.0, test.getHeight(), .01);
    	Assert.assertEquals(10.0, test.getWeight(), .01);
    	
    			
    }
    
}

