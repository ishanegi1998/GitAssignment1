package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMLogin {
	WebDriver driver;  
	@Given("User is on HRMLogin page")
	public void user_is_on_hrm_login_page() {
		String projectPath = System.getProperty("user.dir");
    	System.out.println("project path is " + projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
	           driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("User enters valid credentials")
	public void user_enters_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("Credentials Entered");          
        List<String> signUpForm = dataTable.asList();         
      String userName = signUpForm.get(0);
      String passWord = signUpForm.get(1);          
        driver.findElement(By.name("txtUsername")).sendKeys(userName);
        driver.findElement(By.name("txtPassword")).sendKeys(passWord);       
        driver.findElement(By.id("btnLogin")).submit();
	    
	}
//
	@Then("User should be able to login sucessfully and new page open")
	public void user_should_be_able_to_login_sucessfully_and_new_page_open() {
		String newPageText = driver.findElement(By.id("welcome")).getText();
           
	}
	 /*@After
    public void teardown(){
            driver.close();
     }*/

//
}
