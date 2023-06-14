package com.kraftechnologie.tests.day05_xpath;

import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RelativeXpath5 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/forms/input");
        Thread.sleep(3000);

        WebElement text = driver.findElement(By.xpath("//div[@class='row mb-3'][1]/label"));
        System.out.println(text.getText());

        WebElement text1 = driver.findElement(By.xpath("(//input[@type='text'])[1]/../../label"));
        System.out.println(text1.getText());

        WebElement text2 = driver.findElement(By.xpath("(//div[@class='col-sm-10'])[1]/preceding-sibling::*"));
        System.out.println(text2.getText());

        WebElement text3 = driver.findElement(By.xpath("(//form[@method='post']//label)[1]"));
        System.out.println(text3.getText());

        driver.quit();
    }
}
