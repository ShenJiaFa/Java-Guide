package com.shenjiafa.theory.junit;

import org.junit.*;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/5/26
 */
public class TestUserService {

    @Before
    public void before(){
        System.out.println("I am before!");
    }

    @After
    public void after(){
        System.out.println("I am after!");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("I am beforeClass!");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("I am afterClass!");
    }

    @Test
    public void TestUserService(){
        UserService userService=new UserService();
        String rs = userService.UserLogin("admin", "123456");
        Assert.assertEquals("method execution failed","success",rs);
    }

    @Test
    public void TestUserXXX(){
        UserService userService=new UserService();
        userService.UserXXX();
    }
}
