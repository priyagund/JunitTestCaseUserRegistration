package com.junittest.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

    @RunWith(Parameterized.class)
    public class UserpasswordCheck {
        private String password;
        private boolean expectedPassword;
        private static UserRegistration userRegistration=new UserRegistration();

        public UserpasswordCheck(String password, boolean expectedPassword) {
            this.password = password;
            this.expectedPassword=expectedPassword;
        }

        @Before
        public void initialize(){
            userRegistration=new UserRegistration();
        }

        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            Object[][] data = new Object[][]
                    {{"priyagund", true},
                            {"priya", false}};

            return Arrays.asList(data);
        }

        @Test
        public void testValidPassWord()
        {
            boolean result=userRegistration.validPassword(password);
            Assert.assertEquals(expectedPassword,result);
        }



    }

