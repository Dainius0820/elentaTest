import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class elentaRegTCs {

    public static WebDriver driver;

    public static String pass64Chars = generateRndLetters(32).toLowerCase() + generateRndNumbs(32);
    public static String pass65Chars = generateRndLetters(32).toLowerCase() + generateRndNumbs(33);
    public static String specialChar = generateRndSpecialChars(1);
    public static String passNumbsOnly = generateRndNumbs(6);
    public static String passLettersOnly = generateRndLetters(6).toLowerCase();
    public static String rndLetter = generateRndLetters(1);

    public static String generateRndLetters(int length) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String text = "";
        for (int i = 0; i < length; i++) {
            text += symbols.charAt((int) (Math.random()*symbols.length()));
        }
        return text;
    }

    public static String generateRndNumbs(int length) {
        String symbols = "0123456789";
        String text = "";
        for (int i = 0; i < length; i++) {
            text += symbols.charAt((int) (Math.random()*symbols.length()));
        }
        return text;
    }

    public static String generateRndSpecialChars(int length) {
        String symbols = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        String text = "";
        for (int i = 0; i < length; i++) {
            text += symbols.charAt((int) (Math.random()*symbols.length()));
        }
        return text;
    }

    public void acceptCookies() {
        driver.get("https://elenta.lt");
        WebElement acceptBtn = driver.findElement(By.xpath
                ("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/button[1]/p"));
        acceptBtn.click();
    }

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        acceptCookies();
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://elenta.lt/registracija");
        driver.findElement(By.id("UserName")).clear();
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password2")).clear();
    }

    @Test
    public void positiveTest() {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void noUsernameTest() {
        driver.findElement(By.id("UserName")).sendKeys("");
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void noEmailTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys("");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void noPasswordTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void noSecondPasswordTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void username2CharsTest () {
        driver.findElement(By.id("UserName")).sendKeys(generateRndLetters(2).toLowerCase());
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void username3CharsTest () {
        driver.findElement(By.id("UserName")).sendKeys(generateRndLetters(3).toLowerCase());
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void username64CharsTest () {
        driver.findElement(By.id("UserName")).sendKeys(generateRndLetters(32).toLowerCase() + generateRndNumbs(32));
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void username65CharsTest () {
        driver.findElement(By.id("UserName")).sendKeys(generateRndLetters(32).toLowerCase() + generateRndNumbs(33));
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void usernameUpperCaseLetterTest () {
        driver.findElement(By.id("UserName")).sendKeys(generateRndLetters(1) +"tandard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void usernameContainsSpecialCharTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + generateRndSpecialChars(1));
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void usernameContainsSpaceTest () {
        driver.findElement(By.id("UserName")).sendKeys("stan" + " dard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void password5CharsTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("secr1");
        driver.findElement(By.id("Password2")).sendKeys("secr1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void password6CharsTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("secre1");
        driver.findElement(By.id("Password2")).sendKeys("secre1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void password64CharsTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys(pass64Chars);
        driver.findElement(By.id("Password2")).sendKeys(pass64Chars);
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void password65CharsTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys(pass65Chars);
        driver.findElement(By.id("Password2")).sendKeys(pass65Chars);
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void passwordContainsSpecialCharTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("secret1" + specialChar);
        driver.findElement(By.id("Password2")).sendKeys("secret1" + specialChar);
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void passwordContainsSpaceTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("sec" + " ret1");
        driver.findElement(By.id("Password2")).sendKeys("sec" + " ret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void passwordLettersOnlyTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys(passLettersOnly);
        driver.findElement(By.id("Password2")).sendKeys(passLettersOnly);
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void passwordNumbsOnlyTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys(passNumbsOnly);
        driver.findElement(By.id("Password2")).sendKeys(passNumbsOnly);
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void passContainsUpperCaseLetterTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)) + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys(rndLetter + "ecret1");
        driver.findElement(By.id("Password2")).sendKeys(rndLetter + "ecret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void email5CharsTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys(generateRndLetters(1).toLowerCase() + "@b.c");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void email6CharsTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys(generateRndLetters(2).toLowerCase() + "@b.c");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void email64CharsTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys(generateRndLetters(23).toLowerCase() + generateRndNumbs(23) + "@exampledomain.com");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void email65CharsTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys(generateRndLetters(23).toLowerCase() + generateRndNumbs(24) + "@exampledomain.com");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void emailNumbsOnlyTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys(generateRndNumbs(6));
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void emailLettersOnlyTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys(generateRndLetters(6).toLowerCase());
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void emailAtSignOnlyTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys("@");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void emailLocalAtSignOnlyTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys(generateRndLetters(6).toLowerCase() + "@");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void emailDomainAtSignOnlyTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys("@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void emailStartsWithPeriodTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys("." + generateRndLetters(8).toLowerCase() + "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void emailEndsWithPeriodTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys(generateRndLetters(8).toLowerCase() + "@gmail.com.");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void email2ConsecutivePeriodsTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys(generateRndLetters(8).toLowerCase() + "@gmail..com.");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void emailLocalSpecialCharTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys(generateRndLetters(8).toLowerCase() + "!@gmail.com.");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void emailSpecialCharAfterAtSignTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys(generateRndLetters(8).toLowerCase() + "@!gmail.com.");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

    @Test
    public void emailQuotedLocalTest () {
        driver.findElement(By.id("UserName")).sendKeys("standard" + (100 + (int)(Math.random() * 9900)));
        driver.findElement(By.id("Email")).sendKeys("\"" + generateRndLetters(8).toLowerCase() + "\"@gmail.com.");
        driver.findElement(By.id("Password")).sendKeys("secret1");
        driver.findElement(By.id("Password2")).sendKeys("secret1");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }

}


