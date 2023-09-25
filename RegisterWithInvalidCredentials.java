package unboxing_day;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import teme.util.ta_utils.BaseTestClass;

public class RegisterWithInvalidCredentials extends BaseTestClass {

    @Test

    public void registerWithInvalidEmailAddress() {
        driver.get("http://138.68.69.185:3333/");


        WebElement registerButton = driver.findElement(By.xpath("//div[contains(text(), 'Register')]"));
        registerButton.click();


        WebElement firstNameField = driver.findElement(By.xpath("//input[@placeholder='Enter your First Name']"));
        firstNameField.click();
        firstNameField.sendKeys("Cornel");


        WebElement lastNameField = driver.findElement(By.xpath("//input[@placeholder='Enter your Last Name']"));
        lastNameField.click();
        lastNameField.sendKeys("Ilie");


        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
        emailField.click();
        emailField.sendKeys("1cornelilieyahoo.com");


        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
        passwordField.click();
        passwordField.sendKeys("Wantsome123!");


        WebElement confirmPasswordField = driver.findElement(By.xpath("//input[@placeholder='Confirm password']"));
        confirmPasswordField.click();
        confirmPasswordField.sendKeys("Wantsome123!");


        WebElement secondRegisterButton = driver.findElement(By.xpath("//button[contains(text(), 'Register')]"));
        secondRegisterButton.click();


        Assert.assertEquals("The email is not valid! Please insert a valid email", "Welcome, Cornel Ilie!");



    }
}
