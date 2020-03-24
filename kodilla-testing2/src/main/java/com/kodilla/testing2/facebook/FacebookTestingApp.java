package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DAY ="//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTH ="//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR ="//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_DAY));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(1);
        selectCombo = driver.findElement(By.xpath(XPATH_MONTH));
        selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(4);
        selectCombo = driver.findElement(By.xpath(XPATH_YEAR));
        selectBoard = new Select(selectCombo);
        selectBoard.selectByValue("1990");
    }
}
