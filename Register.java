package unboxing_day;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import teme.util.ta_utils.BaseTestClass;

public class Register extends BaseTestClass {
    @Test
    public void registerIntoApplication(){
        driver.get("http://138.68.69.185:3333/");
        WebElement registerButton = driver.findElement(By.xpath("//div[text()= 'Register']"));
        registerButton.click();

        WebElement firstNameField = driver.findElement(By.xpath("//input[@required and contains(@class, 'outline-none p-2 rounded') and @placeholder= 'Enter your First Name']"));
        firstNameField.click();
        firstNameField.sendKeys("Georgeta");

        WebElement lastNameField = driver.findElement(By.xpath("//input[@required and contains(@class, 'outline-none p-2 rounded') and @placeholder='Enter your Last Name']"));
        lastNameField.click();
        lastNameField.sendKeys("Ilie");

        WebElement emailField = driver.findElement(By.xpath("//input[@required and contains(@class,'outline-none p-2 rounded') and @placeholder= 'Enter your email']"));
        emailField.click();
        emailField.sendKeys("08georgetailie@yahoo.com");
        //pentru a rula testul, va fi necesara o modificare in interiorul adresei de email, intrucat s-a mai facut o data "Register" cu aceste date.

        WebElement passwordField = driver.findElement(By.xpath("//input[@required and contains(@class, 'outline-none p-2 rounded') and @placeholder= 'Enter your password']"));
        passwordField.click();
        passwordField.sendKeys("WantsomeAcademy1!");

        WebElement confirmPasswordField = driver.findElement(By.xpath("//input[@required and contains(@class, 'outline-none p-2 rounded') and @placeholder= 'Confirm password']"));
        confirmPasswordField.click();
        confirmPasswordField.sendKeys("WantsomeAcademy1!");


        WebElement cityField = driver.findElement(By.xpath("//input[contains (@class, 'outline-none p-2 rounded') and @placeholder = 'City']"));
        cityField.sendKeys("Bacau");

        WebElement registrationButton = driver.findElement(By.xpath("//button[contains(text(), 'Register')]"));
        registrationButton.click();

        WebElement welcomeMessage = driver.findElement(By.xpath("//div[contains(text(), 'Welcome')]"));
        Assert.assertEquals("The message is not displayed", "Welcome, Georgeta Ilie!", welcomeMessage.getText());
    }
}
