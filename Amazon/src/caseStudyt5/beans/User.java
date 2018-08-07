package caseStudyt5.beans;

import static org.junit.Assert.assertEquals;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class User {
	@FindBy(how=How.XPATH,using="//*[@id=\"twotabsearchtextbox\"]")
	WebElement searchBox;
	@FindBy(how=How.XPATH,using="	//*[@id=\"nav-search\"]/form/div[2]/div/input	")
	WebElement searchButton;
	@FindBy(how=How.XPATH,using="//*[@id=\"result_0\"]/div/div[2]/div/div[1]/div/div/a/img")
	WebElement searchResult;
	@FindBy(how=How.XPATH,using="//*[@id=\"add-to-cart-button\"]")
	WebElement addCart;
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-cart\"]/span[3]")
	WebElement viewCart ;
	
	
	
	

	
	
}
