package com.adactin.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.base.BaseClass;

public class AdactinProject extends BaseClass {
public static WebDriver driver;
public static void main(String[] args) throws InterruptedException, IOException {
	
	driver=browserConfig("chrome");
	
	getURL("http://adactinhotelapp.com/index.php");
	PomLoginPage lp=new PomLoginPage(driver);
	passValues(lp.getUser(),"KalaiselviGobinath");
	passValues(lp.getPass(), "kalai#1995");
	clickOnElement(lp.getLogin());
	PomWelcomePage wp=new PomWelcomePage(driver);
	dropDown(wp.getLocat(), "value", "Paris");
	dropDown(wp.getHotel(), "value", "Hotel Sunshine");
	dropDown(wp.getRoomtype(),"text","Deluxe");
	dropDown(wp.getRoomNos(), "text", "1 - One");
	wp.getCheckin().clear();
	passValues(wp.getCheckin(), "15/10/2021");
	wp.getCheckout().clear();
	passValues(wp.getCheckout(), "20/10/2021");
	dropDown(wp.getAdult(), "value", "2");
	dropDown(wp.getChild(), "value", "1");
	Thread.sleep(3000);
	snapShot("C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\screenshot\\capture1.png");
	clickOnElement(wp.getSearch());
	PomIteneraryPage ip= new PomIteneraryPage(driver);
	impWait(10);
	clickOnElement(ip.getRadio());
	snapShot("C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\screenshot\\capture2.png");
	clickOnElement(ip.getProceed());
	passValues(ip.getFname(), "Kalai");
	passValues(ip.getLname(), "Gobinath");
	passValues(ip.getAddress(), "40,jones road,saidapet,chenni-15");
	passValues(ip.getCcnum(), "9876543219876543");
	dropDown(ip.getCctype(), "value", "VISA");
	dropDown(ip.getExpmonth(),"value","2");
	dropDown(ip.getExpyear(), "value", "2022");
	passValues(ip.getCvv(), "001");
	scroll(ip.getView());
	snapShot("C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\screenshot\\capture3.png");
	clickOnElement(ip.getBooknow());
	PomBookingConfirmpage bc=new PomBookingConfirmpage(driver);
	impWait(30);
	scroll(bc.getScroll());
	Thread.sleep(5000);
	snapShot("C:\\Users\\Gobi\\eclipse-workspace\\kalai\\SeleniumProject\\driver\\screenshot\\capture4.png");
	clickOnElement(bc.getLogout());
	Thread.sleep(3000);
	clickOnElement(bc.getHome());
	
	
}	}
