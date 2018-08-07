package com.cg.sample;

import static org.junit.Assume.assumeNoException;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;
import org.eclipse.jdt.internal.compiler.batch.FileFinder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Date;

public class Sanjeev {

	WebDriver driver;

	@Given("^user enters the details of website \"([^\"]*)\"$")
	public void user_enters_the_details_of_website(String arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/?gclid=EAIaIQobChMIsOb108zX3AIViqoYCh0pbw0OEAAYASAAEgKOy_D_BwE");

	}

	@When("^i am having \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_am_having(String arg1, String arg2, String arg3) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys(arg1);
		driver.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys(arg2);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]/td[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")).click();
	}

	@Then("^it should SearchBusses$")
	public void it_should_SearchBusses() throws Throwable {
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
		/*
		 * driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).sendKeys(Keys.TAB);
		 * driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).sendKeys(Keys.TAB);
		 * driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).sendKeys(Keys.ENTER);
		 */
	}

	@Given("^user selects view seats$")
	public void user_selects_view_seats() throws Throwable {
		Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"8826688\"]/div/div[2]/div[1]")).click();

	}

	@When("^i am having seatno$")
	public void i_am_having_seatno() throws Throwable {
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions builder= new Actions(driver);
		Action action=builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"rt_8826688\"]/div/div/div/div[2]/div[2]/div[2]/canvas")),60,30).click().build();
		action.perform();
		
		
	}

	@Then("^it should select boardingpoint and droping point$")
	public void it_should_select_boardingpoint_and_droping_point() throws Throwable {

		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//*[@id=\"8826688\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]/span[2]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//*[@id=\"8826688\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[1]/span[2]/div"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"8826688\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button"))
				.click();
	}

}
