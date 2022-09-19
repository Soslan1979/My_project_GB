package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class FilteringSorting {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--incognito");
        option.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://google.com");

         // Поиск сайта
        WebElement webElement_search_field = driver.findElement(By.name("q"));
        webElement_search_field.click();
        webElement_search_field.sendKeys("demowebshop");
        WebElement webElement_search = driver.findElement(By.xpath("//*[@class='gNO89b']"));
        webElement_search.click();
        WebElement webElement_choose_a_site = driver.findElement(By.xpath("//h3[text()='Demowebshop - Tricentis']"));
        webElement_choose_a_site.click();
         // Авторизация на сайте
        WebElement webElement_authorization = driver.findElement(By.xpath("//a[@class='ico-login']"));
        webElement_authorization.click();
        WebElement webElement_email = driver.findElement(By.xpath("//input[@class='email']"));
        webElement_email.sendKeys("testmyemail85@gmail.com");
        WebElement webElement_password = driver.findElement(By.xpath("//input[@class='password']"));
        webElement_password.sendKeys("Qwerty$4");
        WebElement webElement_login = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        webElement_login.click();
         // Фильтрация и сортировка
        WebElement webElement_categories = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a"));
        webElement_categories.click();
        WebElement webElement_subcategories = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[2]/ul/li[1]/a"));
        webElement_subcategories.click();
        WebElement webElement_sort = driver.findElement(By.xpath("//*[@id=\"products-orderby\"]/option[3]"));
        webElement_sort.click();
        WebElement webElement_display = driver.findElement(By.xpath("//*[@id=\"products-pagesize\"]/option[1]"));
        webElement_display.click();
        WebElement webElement_view = driver.findElement(By.xpath("//*[@id=\"products-viewmode\"]/option[2]"));
        webElement_view.click();

        //driver.quit();
    }
}

