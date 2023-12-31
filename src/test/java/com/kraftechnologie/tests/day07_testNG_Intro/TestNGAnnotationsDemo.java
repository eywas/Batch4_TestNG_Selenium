package com.kraftechnologie.tests.day07_testNG_Intro;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationsDemo {
    @BeforeMethod
    public void setUp() {
        System.out.println("** Open Browser **");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("** Close Browser **");
    }

    @Test
    public void test1() {
        System.out.println("First Assertions");
        Assert.assertEquals("Title", "Title");
        System.out.println("Second Assertion");
        Assert.assertEquals("url", "url");
    }

    @Test
    public void test2() {
        System.out.println("Third Assertions");
        Assert.assertEquals("test2", "test2");
    }

    @Test
    public void test3() {
        String expectedTitle = "Kraft";
        String actualTitle = "Kraftech";
        Assert.assertTrue(actualTitle.startsWith(expectedTitle), "Verify that title starting Kraft"); // Eğer hata yoksa mesajı göstermez
    }

    @Test
    public void test4() {
        String email = "kraftech@srudy.com";

        //if(email.equals("@")){
        //    System.out.println("PASS");
        // }else {
        //    System.out.println("FAIL");
        //  }
        Assert.assertTrue(email.contains("@"));
    }

    @Test
    public void test5() {
        Assert.assertFalse(0>1);
    }
}
