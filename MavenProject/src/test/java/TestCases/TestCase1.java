package TestCases;


import Util.UtilClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 extends UtilClass {

    @Test
    public void test1(){
         driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Fazil Raffy");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
    }
}
