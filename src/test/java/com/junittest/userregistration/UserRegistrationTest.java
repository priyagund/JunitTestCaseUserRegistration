package com.junittest.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    private static UserRegistration userRegistration = new UserRegistration();

    //private static UserLastName userLastName =new UserLastName();
    @Test
    public void givenFirstName_isStartWithCapital_shouldReturnTrue() {
        boolean value = userRegistration.validateFirstName("Priya");
        Assert.assertTrue(value);

    }


    @Test
    public void givenFirstName_WhenMinimumThreeCharacter_shouldReturnTrue() {

        boolean value = userRegistration.validateFirstName("Priya");
        Assert.assertTrue(value);
    }

    @Test
    public void givenFirstName_whenAllLowerCaseCharacter_shouldReturnFalse() {
        boolean value = userRegistration.validateFirstName("priya");
        Assert.assertFalse(value);
    }

    @Test
    public void givenFirstName_whenAllCapitalLetter_shouldReturnFalse() {
        boolean value = userRegistration.validateFirstName("PRIYA");
        Assert.assertFalse(value);
    }

    @Test
    public void giveFirstName_whenContainsNumber_shouldReturnFalse() {
        boolean value = userRegistration.validateFirstName("Priya13");
        Assert.assertFalse(value);
    }

    @Test
    public void giveFirstName_whenTwoCharacter_shouldReturnFalse() {
        boolean value = userRegistration.validateFirstName("pr");
        Assert.assertFalse(value);
    }

    @Test
    public void givenLastName_whenStartWithCapiatl_shouldReturnTrue() {
        boolean value = userRegistration.validateLastName("Gund");
        Assert.assertTrue(value);
    }

    @Test
    public void givenLastName_whenMinimumThreeChar_shouldReturnTrue() {
        boolean value = userRegistration.validateLastName("Gund");
        Assert.assertTrue(value);
    }

    @Test
    public void givenLastName_whenAllLowerCase_shouldReturnFalse() {
        boolean value = userRegistration.validateLastName("gund");
        Assert.assertFalse(value);
    }

    @Test
    public void givenLastName_whenAllCapitalLetter_shouldReturnFalse() {
        boolean value = userRegistration.validateLastName("GUND");
        Assert.assertFalse(value);
    }

    @Test
    public void givenLastName_minimumTwoChar_shouldReturnFalse() {
        boolean value = userRegistration.validateLastName("un");
        Assert.assertFalse(value);

    }

    @Test
    public void givenLastName_specialChar_shouldReturnFalse() {
        boolean value = userRegistration.validateLastName("gund@");
        Assert.assertFalse(value);
    }


}
