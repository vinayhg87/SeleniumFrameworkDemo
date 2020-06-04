package WebpageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chapter1WebElement {

    @FindBy(linkText = "Chapter1")
    public WebElement Chapter1Link;
    @FindBy(id = "radiobutton")
    public WebElement radioButton;
    @FindBy(name = "selected(1234)")
    public WebElement checkbox;
    @FindBy(id = "storeinput")
    public WebElement inputBox;
    @FindBy(linkText = "Home Page")
    public WebElement homePage;
    @FindBy(id = "selecttype")
    public WebElement dropDown;
    @FindBy(id = "divontheleft")
    public WebElement plainText;
    WebDriver driver;

    public Chapter1WebElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
