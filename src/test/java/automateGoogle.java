import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class automateGoogle{

    public static void main(String [] args){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");

        WebDriver driver =new ChromeDriver();

        driver.get("https://www.google.com");

        WebElement inputbox=driver.findElement(By.xpath("//textarea[@name='q']"));

        inputbox.sendKeys("Navnath");

        List<WebElement> eles = driver.findElements(By.xpath("//div[@class='mkHrUc']//li//div//div[@class='pcTkSc']//div"));

        for(WebElement ele:eles){
           if(ele.getAttribute("area-label")=="navnath"){
                ele.click();
           }
        }
    }
}
