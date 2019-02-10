/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
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

    // TODO: test full constructor, getters, and toString
    
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
    	Assert.assertEquals(10.0, animal.getHeight());
    	Assert.assertEquals(10.0, animal.getWeight());
    	
    }
    
    public void toStringTest() throws AssertException
    {
    	Animal animal = new Animal("blue", "Jeff", 10.0, 100.0);
    	String actual = animal.toString();
    	String expected = "Jeff, a blue-colored animal. 100.0 pounds, 10.0 inches.\n";
    	
    	boolean isCorrect = false;
    	
    	if(actual.equals(expected))
    	{
    		isCorrect = true;
    	}
    	
    	Assert.assertTrue(isCorrect);
    	
    	
    	
    }
}

