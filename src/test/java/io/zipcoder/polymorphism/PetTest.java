package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;


public class PetTest {
    @Test
    public void testInheritance() {
        Pet p = new Pet(null);
        Assert.assertTrue(p instanceof Pet);
    }

    @Test
    public void petGetNameTest() {
        String expected = "Goofy";
        Pet pet = new Pet(expected);
        String actual = pet.getName();

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void petSetNameTest(){
        Pet pet = new Pet("Fido");
        String expected = "Fido";
        pet.setName(expected);
        String actual = pet.getName();
        Assert.assertEquals(expected,actual);
    }

}
