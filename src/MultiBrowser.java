import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String baseURL = "https://www.saucedemo.com/ "; //storing URL in baseUrl
    static String browser = "Edge"; //Variable for declaring browser
    static WebDriver driver; //storing the browser WebDriver in "driver"

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) { //setting up chrome driver
            driver = new ChromeDriver();//open the link in chrome
        } else if (browser.equalsIgnoreCase("Firefox")) { //setting up firefox driver
            driver = new FirefoxDriver(); //open the link in Firefox
        } else if (browser.equalsIgnoreCase("Edge")) {  //setting up edge driver
            driver = new EdgeDriver(); //open the link in Edge
        } else {
            System.out.println("Invalid browser"); //if neither then print this statement
        }
        driver.get(baseURL); //open the link in chosen browser

        System.out.println("The title of the page is: " + driver.getTitle()); //Printing the title of the page
        //Getting the current URL using driver.get method with a print statement.
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        //Getting the page source using driver.get method with a print statement.
        System.out.println("Page source is: " + driver.getPageSource());

        driver.findElement(By.id("user-name")).sendKeys("standard_user"); //Finding the element by ID and then entering email
        driver.findElement(By.id("password")).sendKeys("secret_sauce"); //Finding the element by ID and then entering password
        driver.close(); //closing browser
    }
}
