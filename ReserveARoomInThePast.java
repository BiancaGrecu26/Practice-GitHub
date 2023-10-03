package unboxing_day.reserve_a_room;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import teme.util.ta_utils.BaseTestClass;

public class ReserveARoomInThePast extends BaseTestClass {
    @Test
    public void ReserveRoomWithDateInThePast() {
        driver.get("http://138.68.69.185:3333/");

        WebElement loginButton = driver.findElement(By.xpath("//div[contains(text(), 'Login')]"));
        loginButton.click();

        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder= 'Enter your email']"));
        emailField.sendKeys("georgetailie@yahoo.com");

        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder= 'Enter your password']"));
        passwordField.sendKeys("WantsomeAcademy1!");

        WebElement secondLoginButton = driver.findElement(By.xpath("//button[contains(text(), 'Login')]"));
        secondLoginButton.click();

        WebElement whereAreYouGoingField = driver.findElement(By.xpath("//input[@placeholder='Where are you going?']"));
        whereAreYouGoingField.sendKeys("Iasi");
        whereAreYouGoingField.sendKeys(Keys.ENTER);

        WebElement hotelIasi = driver.findElement(By.xpath("//div[contains(text(), 'Hotel Iasi')]"));
        hotelIasi.click();

        WebElement dublaCameraDescription = driver.findElement(By.xpath("//div[contains(text(), 'dubla')]"));
        dublaCameraDescription.click();

        WebElement firstNextStepButton = driver.findElement(By.xpath("//button[contains(text(), 'Next step')]"));
        firstNextStepButton.click();

        WebElement dublaCameraSelect = driver.findElement(By.xpath("//div[@class='pb-4'][1]//input[@type='text']"));
        dublaCameraSelect.clear();
        dublaCameraSelect.sendKeys("1");

        WebElement checkInDate = driver.findElement(By.xpath("//input[@type='date'][1]"));
        checkInDate.click();
        checkInDate.sendKeys("05-28-1584");

        WebElement checkOutDate = driver.findElement(By.xpath("//input[@type='date'][2]"));
        checkOutDate.click();
        checkOutDate.sendKeys("05-30-1584");

        WebElement secondNextStepButton = driver.findElement(By.xpath("//button[contains(text(), 'Next step')]"));
        secondNextStepButton.click();

        WebElement peopleEatingBreakfast = driver.findElement(By.xpath("//div[contains(text(), 'people eating')]//following-sibling::div//input[@type='number']"));
        peopleEatingBreakfast.clear();
        peopleEatingBreakfast.sendKeys("1");

        WebElement thirdNextStepButton = driver.findElement(By.xpath("//button[contains(text(), 'Next step')]"));
        thirdNextStepButton.click();

        WebElement couponCodesFields = driver.findElement(By.xpath("//div[@class='p-2']//div[contains(text(), 'coupon codes')]//following-sibling::input"));
        couponCodesFields.click();
        couponCodesFields.sendKeys("No");

        WebElement lastNextStepButton = driver.findElement(By.xpath("//button[contains(text(), 'Next step')]"));
        lastNextStepButton.click();

        WebElement bookHolidayButton = driver.findElement(By.xpath("//button[contains(text(), 'Book holiday')]"));
        bookHolidayButton.click();

        WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(), 'Succes!')]"));
        Assert.assertEquals("The message is not displayed", "Invalid check-in/ check-out date", errorMessage.getText());

    }
}
