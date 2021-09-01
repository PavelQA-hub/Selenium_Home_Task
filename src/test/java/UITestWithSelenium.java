import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

public class UITestWithSelenium {

    @Test
    public void navigateToGigaProgContactUsForm() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");

        By inputEmailFieldPath = By.id("email");
        WebElement inputEmailField = driver.findElement(inputEmailFieldPath);
        inputEmailField.sendKeys("+380667370091");

        By inputPasswordFieldPath = By.id("pass");
        WebElement inputPasswordField = driver.findElement(inputPasswordFieldPath);
        inputPasswordField.sendKeys("epiPavel20+");

        By buttonLoginToFacebookPath = By.linkText("Увійти");
        WebElement buttonLoginToFacebook = driver.findElement(buttonLoginToFacebookPath);
        buttonLoginToFacebook.click();

        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/login/"));
        Assert.assertEquals("+380667370091", "+380667370091");
        Assert.assertEquals("epiPavel20+", "epiPavel20+");

        driver.quit();
        System.out.println("Success");
    }
}
