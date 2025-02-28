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
        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        loginBt.click();

    }
}

