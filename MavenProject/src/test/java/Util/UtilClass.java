package Util;

import BaseClass.SeleniumBase;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class UtilClass extends SeleniumBase {

    @BeforeMethod
    public void beforeHooks()
    {
       startChromeBrowser("http://google.com");
    }

    @AfterMethod
    public void afterHooks()
    {
      closeChromeBrowser();
    }

}
