package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CarSearchSteps {
	
	public WebDriver driver;
	
	@Before
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();	
		
	}
	
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()){
			byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotBytes, "image/png");
			}
			if (driver !=null){
			driver.quit();
			}
		
	}
	@Given("I am on the home page http:\\/\\/www.carsguide.com.au")
	public void i_am_on_the_home_page_http_www_carsguide_com_au() {
		
		driver.get("https://www.carsguide.com.au/");
	 
	}

	@When("I move on the buy+sell menu")
	public void i_move_on_the_buy_sell_menu() throws InterruptedException {
		Actions builder = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'buy + sell')]"));
		builder.moveToElement(element).build().perform();
		Thread.sleep(1000);
		
	}
	@Then("I click on Search Cars")
	public void i_click_on_Search_Cars() {
	    driver.findElement(By.xpath("//a[contains(text(),'Search Cars')]")).click();
	}

	@When("I click on BuySellMenu link")
	public void i_click_on_BuySellMenu_link(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new cucumber.api.PendingException();
	}

	@And("I select Make as {string}")
	public void i_select_Make_as(String make) throws InterruptedException {
		
		WebElement makes = driver.findElement(By.id("makes"));
		Select select = new Select(makes);
		select.selectByVisibleText(make);
		Thread.sleep(1000);
		
	}

	@And("I select Model as {string}")
	public void i_select_Model_as(String model) throws InterruptedException {
		WebElement models = driver.findElement(By.id("models"));
		Select select = new Select(models);
		select.selectByVisibleText(model);
		Thread.sleep(1000);
	    
	}

	@And("I select location as {string}")
	public void i_select_location_as(String location) throws InterruptedException {
	    WebElement locations = driver.findElement(By.id("locations"));
	    Select select = new Select(locations);
	    select.selectByVisibleText(location);
	    Thread.sleep(1000);
	}

	@And("I select price as {string}")
	public void i_select_price_as(String price) throws InterruptedException {
		WebElement prices = driver.findElement(By.id("priceTo"));
		Select select = new Select(prices);
		select.selectByVisibleText(price);
		Thread.sleep(1000);
	    
	}

	@And("I click on Find My Next Car button")
	public void i_click_on_Find_My_Next_Car_button() {
	    driver.findElement(By.id("search-submit")).click();
	}

	@Then("I should see the list of {string} cars")
	public void i_should_see_the_list_of_cars(String carmake) {
	  Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='listing-search-title']")).getText().contains(carmake));
	}

	@And("page tilte should be {string}")
	public void page_tilte_should_be(String expected) {
		Assert.assertEquals(expected, driver.getTitle());
	   
	}


}
