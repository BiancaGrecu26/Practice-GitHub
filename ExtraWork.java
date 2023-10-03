package unboxing_day;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import teme.util.ta_utils.BaseTestClass;

public class ExtraWork extends BaseTestClass {
    @Test

    public void registerWithValidCredentials() {
        driver.get("http://138.68.69.185:3333/register");

        WebElement firstNameField = driver.findElement(By.xpath("//input[@placeholder= 'Enter your First Name' ]"));
        firstNameField.sendKeys("Jane");

        WebElement lastNameField = driver.findElement(By.xpath("//input[@placeholder= 'Enter your Last Name' ]"));
        lastNameField.sendKeys("Stevenson");

        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder= 'Enter your email' ]"));
        emailField.sendKeys("janestevenson@gmail.com");

        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder= 'Enter your password' ]"));
        passwordField.sendKeys("Wantsome12345");

        WebElement confirmPasswordField = driver.findElement(By.xpath("//input[@placeholder= 'Confirm password' ]"));
        confirmPasswordField.sendKeys("Wantsome12345");

        WebElement cityField = driver.findElement(By.xpath("//input[@placeholder='City']"));
        cityField.sendKeys("New York");

        WebElement nationalityField = driver.findElement(By.xpath("//input[@placeholder='Nationality']"));
        nationalityField.sendKeys("American");

        WebElement registerFromTheFormularButton = driver.findElement(By.xpath("//button[contains(text(), 'Register')]"));
        registerFromTheFormularButton.click();


    }

    @Test

    public void loginWithValidCredentials() {

        driver.get("http://138.68.69.185:3333/");

        WebElement loginButton = driver.findElement(By.xpath("//div[contains(text(), 'Login')]"));
        loginButton.click();

        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
        emailField.sendKeys("janestevenson@gmail.com");

        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
        passwordField.sendKeys("Wantsome12345");

        WebElement finalLoginButton = driver.findElement(By.xpath("//button[contains(text(), 'Login')]"));
        finalLoginButton.click();

        WebElement welcomeMessage = driver.findElement(By.xpath("//div[contains(text(), 'Welcome')]"));
        Assert.assertEquals("The message is not displayed", "Welcome, jane stevenson!", welcomeMessage.getText());
    }

    @Test
    public void loginWithValidEmailAndWrongPassword() {
        driver.get("http://138.68.69.185:3333/");

        WebElement loginButton = driver.findElement(By.xpath("//div[contains(text(), 'Login')]"));
        loginButton.click();

        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
        emailField.sendKeys("janestevenson@gmail.com");

        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
        passwordField.sendKeys("WantsomeBlaBlaBla");

        WebElement finalLoginButton = driver.findElement(By.xpath("//button[contains(text(), 'Login')]"));
        finalLoginButton.click();

        WebElement welcomeMessage = driver.findElement(By.xpath("//div[contains(text(), 'Welcome')]"));
        Assert.assertEquals("The message is not displayed", "Welcome, jane stevenson!", welcomeMessage.getText());
    }

}
