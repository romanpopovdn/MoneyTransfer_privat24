import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckTransfer {

    @Test

    public void checkMoneyTransfer() {
        // 1. �������� ��������� ���������� ��� �������� Chrome  - ��� �������� ������ ��������
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        // 2. ������� ������ driver � ��������� �������� �� ChromeDriver
        WebDriver driver = new ChromeDriver();
        // �������� �������� �������� ����� ���, ��� ��� ��� ��������������
        // ��������� 7 ������, ��� ��� �� � ������� ������ "��������"
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

        // ��������������� ������ �����:
        // 1. ������� �� ��������
        driver.get("https://next.privat24.ua/money-transfer/card");

        // 2. ������� �������� ����������
        By card1 = By.xpath("//input [@data-qa-node='numberdebitSource']");
        By date1 = By.xpath("//input [@data-qa-node='expiredebitSource']");
        By cvv1 = By.xpath("//input [@data-qa-node='cvvdebitSource']");
        By firstName1 = By.xpath("//input [@data-qa-node='firstNamedebitSource']");
        By lastName1 = By.xpath("//input [@data-qa-node='lastNamedebitSource']");
        By card2 = By.xpath("//input [@data-qa-node='numberreceiver']");
        By firstName2 = By.xpath("//input [@data-qa-node='firstNamereceiver']");
        By lastName2 = By.xpath("//input [@data-qa-node='lastNamereceiver']");
        // ��������� ������ ������ ������
        // By currencyBtn = By.xpath("//button [@data-qa-node='currency']");
        // ����� USD
        // By currencyOption = By.xpath("//button [ @title='USD']");
        By amount = By.xpath("//input [@data-qa-node='amount']");
        By messageBtn = By.xpath("//span [@data-qa-node='toggle-comment']");
        By messageArea = By.xpath("//textarea [@data-qa-node='comment']");
        By submitBtn = By.xpath("//button [@type='submit']");

        // 3. �������� ��� ���������� ����������

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
        driver.findElement(messageArea).sendKeys("������� �������");
        driver.findElement(submitBtn).click();
        //driver.close();
    }
}
