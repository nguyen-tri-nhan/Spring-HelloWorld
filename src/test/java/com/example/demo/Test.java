package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        checkPage();

    }
    public static void checkPage(){
        String driver = "msedgedriver.exe";

        System.setProperty("webdriver.edge.driver",driver);
        WebDriver myBrowser = new EdgeDriver();
        myBrowser.manage().window().maximize();
        myBrowser.get("http://fap.fpt.edu.vn/");
        WebElement header = myBrowser.findElement(By.xpath("/html/body/div/div[1]/h1/span"));
        System.out.println("Header: " + header.getText());
        WebElement cbBox = myBrowser.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddlCampus\"]"));
        Select obj = new Select(cbBox);
        List<WebElement> campuses = obj.getOptions();
        for (WebElement camp : campuses) {
            System.out.println(camp.getText());
        }
    }
}
