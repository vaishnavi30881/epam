package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Project {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
      //it is a new file to compare witrh older version
        driver.get("https://lms.kluniversity.in/login/index.php");
        driver.findElement(By.id("username")).sendKeys("2100030881");
        driver.findElement(By.id("password")).sendKeys("#vyshu26");
        driver.findElement(By.id("loginbtn")).submit();
        driver.quit();
    }
}