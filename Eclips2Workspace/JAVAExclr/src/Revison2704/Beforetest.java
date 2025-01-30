package Revison2704;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Beforetest {
@Test
void testCase1() {
System.out.println("Test case 1 executed");
}
@Test
void testCase2() {
System.out.println("Test case 2 executed");
}
@BeforeMethod
void beforeMethod() {
System.out.println("Before Method executed");
}
@AfterMethod
void afterMethod() {
System.out.println("After Method executed");
}
@BeforeClass
void beforeClass() {
System.out.println("Before Class executed");
}
@AfterClass
void afterClass() {
System.out.println("After Class executed");
}
@BeforeTest
void beforeTest() {
System.out.println("Before Test executed");
}
@AfterTest
void afterTest() {
System.out.println("After Test executed");
}
}
