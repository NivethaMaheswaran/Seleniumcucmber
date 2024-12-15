package org.sam;
import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Instapojo extends BaseClass {
public Instapojo() {
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//input[@name='username']")
private WebElement username;
@FindBy(xpath="//input[@aria-label='Password']")
private WebElement password;
@FindBy(xpath="//div[text()='Log in']")
private WebElement submit;

public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getSubmit() {
	return submit;
}
}
