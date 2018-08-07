package caseStudyt5.beans;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import gherkin.lexer.Th;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		User user = PageFactory.initElements(driver, User.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		user.searchBox.sendKeys("oneplus");
		Thread.sleep(2000);
		user.searchButton.click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		user.searchResult.click();
		Thread.sleep(2000);
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);

		}
		driver.close();
		driver.switchTo().window(winHandleBefore);
		driver.get(
				"https://www.amazon.in/dp/B0756Z43QS/ref=sxnav_sxwds-bovbp-p_mh_m_1?pf_rd_m=A1VBAL9TL5WCBF&pf_rd_p=13e859bb-336d-461f-997a-f85135947890&pd_rd_wg=SajVU&pf_rd_r=N655NYXG8BKZCHQVYYQY&pf_rd_s=desktop-sx-nav&pf_rd_t=301&pd_rd_i=B0756Z43QS&pd_rd_w=smZQE&pf_rd_i=oneplus&pd_rd_r=557db4b3-be8f-4033-bba7-f19c1e2c7945&ie=UTF8&qid=1533615382&sr=1");
		Thread.sleep(2000);

		user.addCart.click();
		Thread.sleep(2000);
		user.viewCart.click();
		Thread.sleep(2000);
		user.searchBox.sendKeys("teddy bear for kids");
		Thread.sleep(2000);
		user.searchButton.click();
		Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[2]/div/div/a/img")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[3]")).click();
}

}
