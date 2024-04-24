package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class skillsPageTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qamarkskills.ccbp.tech");
        //html
        WebElement skill1 = driver.findElement(By.cssSelector("input[id *= 'checkbox1']"));
        skill1.click();
        WebElement getSkill  = driver.findElement(By.cssSelector("label[id $= 'bel1']"));
        String html = getSkill.getText();
        System.out.println("Selected: " + html);
        //css
        WebElement skill2 = driver.findElement(By.cssSelector("input[id *= 'checkbox2']"));
        skill2.click();
        WebElement getSkill2  = driver.findElement(By.cssSelector("label[id $= 'bel2']"));
        String css = getSkill2.getText();
        System.out.println("Selected: " + css);
        //javascript
        WebElement skill3 = driver.findElement(By.cssSelector("input[id *= 'checkbox3']"));
        skill3.click();
        WebElement getSkill3  = driver.findElement(By.cssSelector("label[id $= 'bel3']"));
        String javascript = getSkill3.getText();
        System.out.println("Selected: " + javascript);
        driver.quit();

    }
}
