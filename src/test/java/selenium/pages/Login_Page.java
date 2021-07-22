package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
    WebDriver driver = null;
    private final By Username_Field = By.xpath("//*[@id=\"txtUsername\"]");
    private final By Password_Field = By.xpath("//*[@id=\"txtPassword\"]");
    private final By Login_Button = By.xpath("//*[@id=\"btnLogin\"]");
    private final By Forgot_Password_Button = By.xpath("//*[@id=\"forgotPasswordLink\"]/a");

    public Login_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername_Field(String username){
        driver.findElement(Username_Field).sendKeys(username);
    }

    public void setPassword_Field(String password){
        driver.findElement(Password_Field).sendKeys(password);
    }

    public void clickLogin_Button(){
        driver.findElement(Login_Button).click();
    }

    public void clickForgot_Password_Button(){
        driver.findElement(Forgot_Password_Button).click();
    }

}
