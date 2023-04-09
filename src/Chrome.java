import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //Setting up chrome browser
        driver.get("https://www.saucedemo.com/");//opening the url


        System.out.println("The title of the page is: " + driver.getTitle()); //Printing the title of the page
        //Getting the current URL using driver.get method with a print statement.
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        //Getting the page source using driver.get method with a print statement.
        System.out.println("Page source is: " + driver.getPageSource());

        driver.findElement(By.id("user-name")).sendKeys("standard_user"); //Finding the element by ID and then entering email
        driver.findElement(By.id("password")).sendKeys("secret_sauce"); //Finding the element by ID and then entering password
        driver.close();
    }
}
