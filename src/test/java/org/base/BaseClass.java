
package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;

public static void lanBrowser() {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
}

public static void windowMaxi() {
driver.manage().window().maximize();
}

public void launchUrl(String url) {
driver.get(url);
}

public String pageTitle() {
String title = driver.getTitle();
System.out.println(title);
return title;

}
public String  currentPageurl() {
String cUrl = driver.getCurrentUrl();System.out.println(cUrl);
return cUrl;
}
public void passText(String username,WebElement ele) {
ele.sendKeys(username);
}

public void clickBtn(WebElement ele) {
ele.click();
}
public static void closeBrowser() {
driver.close();
}

}
