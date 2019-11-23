package com.junittest.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserEmailIdTest {
    private static UserRegistration userRegistration = new UserRegistration();
    private String emailId;
    private boolean expectedResult;
    UserRegistration userEmailIdTest;

    public UserEmailIdTest(String emailId, boolean expectedResult) {

        this.emailId = emailId;
        this.expectedResult = expectedResult;
    }

    @Before

    public void initialize() {
        userEmailIdTest = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
           Object[][] data=new Object[][]{{ "abc@yahoo.com" , true },
                   {"abc.100@yahoo.com",true},
                   {"abc.100@abc.com.au",true},
                   {"abc+100@gmail.com",true},
                   {"abc.abc@gmail.co.in",true},
                   {"abc100@gmail.com",true},
                   {"abc",false},
                   {"abc@.com.my",false},
                   {"abc123@gmail.a",false},
                   {".abc@abc.com",false},
                   {"abc()*@gmail.com",false},
                   {"abc@%.com",false},
                   {"abc..2002@gmail.com",false},
                   {"abc.@g.com",false},
                   {"abc@abc@gmail.com",false},
                   {"abc@a.com.21a",false},
                   {"abc@g.cim.au.au",false}};


    return Arrays.asList(data);


    }

    @Test
    public void testValidEmail()
    {
        boolean result=userEmailIdTest.validEmailId(emailId);
        Assert.assertEquals(expectedResult,result);
    }
}

