package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class Buy {
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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         // Выбираем товар и конфигурацию
        WebElement webElement_choose_product = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a"));
        webElement_choose_product.click();
        WebElement webElement_choose_processor = driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[6]/dl/dd[1]/ul/li/label"));
        webElement_choose_processor.click();
        WebElement webElement_choose_ram = driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[6]/dl/dd[2]/ul/li[1]/label"));
        webElement_choose_ram.click();
        WebElement webElement_choose_hdd = driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[6]/dl/dd[3]/ul/li[2]/label"));
        webElement_choose_hdd.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         // Добавляем товар в корзину
        WebElement webElement_adding_to_cart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-75\"]"));
        webElement_adding_to_cart.click();
         // Переходим в корзину
        WebElement webElement_go_to_cart = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]"));
        webElement_go_to_cart.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         // Покупаем товар
        WebElement webElement_select_country = driver.findElement(By.xpath("//*[@id=\"CountryId\"]/option[177]"));
        webElement_select_country.click();
        WebElement webElement_select_zip = driver.findElement(By.xpath("//*[@id=\"ZipPostalCode\"]"));
        webElement_select_zip.click();
        webElement_select_zip.sendKeys("111670");
        webElement_select_zip.click();
        WebElement webElement_check_box_agree_service = driver.findElement(By.xpath("//*[@id=\"termsofservice\"]"));
        webElement_check_box_agree_service.click();
        WebElement webElement_checkout = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
        webElement_checkout.click();
        WebElement webElement_country = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]/option[177]"));
        webElement_country.click();
        WebElement webElement_city = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_City\"]"));
        webElement_city.click();
        webElement_city.sendKeys("Moscow");
        WebElement webElement_address = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address1\"]"));
        webElement_address.click();
        webElement_address.sendKeys("Lenina 22");
        WebElement webElement_zip = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]"));
        webElement_zip.click();
        webElement_zip.sendKeys("111670");
        WebElement webElement_phone_number = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]"));
        webElement_phone_number.click();
        webElement_phone_number.sendKeys("+79001001010");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement webElement_continue = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input"));
        webElement_continue.click();
        WebElement webElement_in_store_pickup = driver.findElement(By.xpath("//*[@id=\"PickUpInStore\"]"));
        webElement_in_store_pickup.click();
        WebElement webElement_continue_2 = driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input"));
        webElement_continue_2.click();
        WebElement webElement_continue_3 = driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input"));
        webElement_continue_3.click();
        WebElement webElement_continue_4 = driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input"));
        webElement_continue_4.click();
        WebElement webElement_confirm = driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input"));
        webElement_confirm.click();

        // Разлогиниться
//        WebElement webElement_8 = driver.findElement(By.xpath("//a[@href='/logout'] "));
//        webElement_8.click();

        //driver.quit();
    }
}


