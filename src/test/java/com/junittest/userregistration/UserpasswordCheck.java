package com.junittest.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
<<<<<<< HEAD
public class UserpasswordCheck {
=======
public class UserpasswordCheck
{
>>>>>>> uc6_password_check
    private String password;
    private boolean expectedPassword;
    private static UserRegistration userRegistration=new UserRegistration();

    public UserpasswordCheck(String password, boolean expectedPassword) {
        this.password = password;
        this.expectedPassword=expectedPassword;
    }
<<<<<<< HEAD

    @Before
    public void initialize(){
      userRegistration=new UserRegistration();
=======
    @Before
    public void initialize(){
        userRegistration=new UserRegistration();
>>>>>>> uc6_password_check
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]
<<<<<<< HEAD
                {{"priyagund", true},
                        {"priya", false}};

                return Arrays.asList(data);
=======
                {{"Priyagund@123", true},
                        {"priya", false},
                        {"priyagund",false},
                        {"priyagund",false},
                        {"priyagund12@@",false}};

        return Arrays.asList(data);
>>>>>>> uc6_password_check
    }

    @Test
    public void testValidPassWord()
    {
        boolean result=userRegistration.validPassword(password);
        Assert.assertEquals(expectedPassword,result);
    }
<<<<<<< HEAD



=======
>>>>>>> uc6_password_check
}
