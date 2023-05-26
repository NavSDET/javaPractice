import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class brokenlinks {

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        driver.get("http://www.amazon.com");
        driver.get("https://finance.yahoo.com/trending-tickers");
        driver.findElement(By.xpath("//h1[text()='Trending Tickers']")).click();
        List<WebElement> allLinks = driver.findElements(By.xpath("//ul[@class='List(n)']//a"));
//        List<WebElement> allLinks = driver.findElements(By.xpath("//a[contains(@href,'')]"));
        System.out.println(allLinks.size());

        try {
            for(WebElement links:allLinks){

                URL url=new URL(links.getAttribute("href"));

                HttpURLConnection httpURLConnection=(HttpURLConnection) url.openConnection();
                int responseCode = httpURLConnection.getResponseCode();

                if (responseCode>=400) {
                    System.out.println(url+" is a broken Link");
                }else {
                    System.out.println("Not any broken link found");
                }
            }
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
}
