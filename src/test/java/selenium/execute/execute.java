package selenium.execute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.pages.Login_Page;

public class execute {

    private static WebDriver driver = null;
    Login_Page loginPage = new Login_Page(driver);

    @BeforeAll
    static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    @DisplayName("This is login test 1")
    public void loginTest1(){
        driver.get("https://opensource-demo.orangehrmlive.com/");
        loginPage.setUsername_Field("Admin");
        loginPage.setPassword_Field("admin123");
        loginPage.clickLogin_Button();
    }

    @AfterAll
    static void teardown(){
        driver.quit();
    }

}
