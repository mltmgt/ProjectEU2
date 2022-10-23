package Project2;

/* Provide Implementation for the diagram below.
 * Then create a test class in which you need to create Objects of ChromeDriver, FirefoxDrive and SafariDriver
 * classes and see which methods available to them.
 */
public class Task4{

}
interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakesScheenshot {
    void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakesScheenshot {
    void navigate();
}

class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("open the Chrome");
    }
    @Override
    public void close() {
        System.out.println("close the Chrome");
    }
    @Override
    public String getTitle() {
        return "Chrome";
    }
    @Override
    public void getScreenshot() {
        System.out.println("get screenshoot the Chrome");
    }
    @Override
    public void navigate() {
        System.out.println("navigate the Chrome");
    }
}

class FirefoxDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("open the Firefox");
    }
    @Override
    public void close() {
        System.out.println("close the Firefox");
    }
    @Override
    public String getTitle() {
        return "Firefox";
    }
    @Override
    public void getScreenshot() {
        System.out.println("get screenshoot the Firefox");
    }
    @Override
    public void navigate() {
        System.out.println("navigate the Firefox");
    }
}
class SafariDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("open the Safari");
    }
    @Override
    public void close() {
        System.out.println("close the Safari");
    }
    @Override
    public String getTitle() {
        return "Safari";
    }
    @Override
    public void getScreenshot() {
        System.out.println("get screenshoot the Safari");
    }
    @Override
    public void navigate() {
        System.out.println("navigate the Safari");
    }
}

class Test {

    public static void main(String[] args) {

        RemoteWebDriver [] driver = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};

        for(RemoteWebDriver web : driver) {

            web.open();
            web.close();
            System.out.println("Browser title: "+web.getTitle());
            web.getScreenshot();
            web.navigate();
            System.out.println("-------------------------------------");

        }
    }
}
