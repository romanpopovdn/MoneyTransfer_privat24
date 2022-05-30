import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckTransfer {

    @Test

    public void checkMoneyTransfer() {
        // 1. Добавили системную переменную для драйвера Chrome  - для создания образа браузера
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        // 2. Создаем объект driver и добавляем свойства от ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Создание ожидания элемента перед тем, как над ним воздействовать
        // Установил 7 секунд, так как ПК и браузер иногда "тормозят"
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

        // Непосредственно логика теста:
        // 1. Перейти на страницу
        driver.get("https://next.privat24.ua/money-transfer/card");

        // 2. Описать элементы интерфейса
        By card1 = By.xpath("//input [@data-qa-node='numberdebitSource']");
        By date1 = By.xpath("//input [@data-qa-node='expiredebitSource']");
        By cvv1 = By.xpath("//input [@data-qa-node='cvvdebitSource']");
        By firstName1 = By.xpath("//input [@data-qa-node='firstNamedebitSource']");
        By lastName1 = By.xpath("//input [@data-qa-node='lastNamedebitSource']");
        By card2 = By.xpath("//input [@data-qa-node='numberreceiver']");
        By firstName2 = By.xpath("//input [@data-qa-node='firstNamereceiver']");
        By lastName2 = By.xpath("//input [@data-qa-node='lastNamereceiver']");
        // Активации списка выбора валюты
        // By currencyBtn = By.xpath("//button [@data-qa-node='currency']");
        // Выбор USD
        // By currencyOption = By.xpath("//button [ @title='USD']");
        By amount = By.xpath("//input [@data-qa-node='amount']");
        By messageBtn = By.xpath("//span [@data-qa-node='toggle-comment']");
        By messageArea = By.xpath("//textarea [@data-qa-node='comment']");
        By submitBtn = By.xpath("//button [@type='submit']");

        // 3. Действия над элементами интерфейса

        driver.findElement(card1).sendKeys("4006895689048337");
        driver.findElement(date1).sendKeys("0323");
        driver.findElement(cvv1).sendKeys("868");
        driver.findElement(firstName1).sendKeys("Peter");
        driver.findElement(lastName1).sendKeys("Edwards");
        driver.findElement(card2).sendKeys("5309233034765085");
        driver.findElement(firstName2).sendKeys("Juliana");
        driver.findElement(lastName2).sendKeys("Janssen");
        // driver.findElement(currencyBtn).click();
        // driver.findElement(currencyOption).click();
        driver.findElement(amount).sendKeys("370");
        driver.findElement(messageBtn).click();
        driver.findElement(messageArea).sendKeys("перевод средств");
        driver.findElement(submitBtn).click();
        //driver.close();
    }
}
