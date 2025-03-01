package cydeo.pages;

import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePage {
    public PracticePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name = "username")
    public WebElement username;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(id = "wooden_spoon")
    public WebElement loginBt;
    @FindBy(id = "flash-messages")
    public WebElement message;

    public void clickLinkText(String linkText){
        Driver.getDriver().findElement(By.linkText(linkText)).click();
    }
    public void login(){
//        String userName = ConfigurationReader.getProperty("username");
//        String passWord = ConfigurationReader.getProperty("password");
        String userName = System.getenv("USERNAME");
        System.out.println("Username : " + userName);
        String passWord = System.getenv("PASSWORD");
        System.out.println("Password : " + passWord);
        username.sendKeys(userName);
        password.sendKeys(passWord);

        loginBt.click();

    }
}

