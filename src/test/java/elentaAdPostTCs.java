import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class elentaAdPostTCs {

    public static WebDriver driver;

    public static String generateRndLetters(int length) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String text = "";
        for (int i = 0; i < length; i++) {
            text += symbols.charAt((int) (Math.random() * symbols.length()));
        }
        return text;
    }

    public static String generateRndNumbs(int length) {
        String symbols = "0123456789";
        String text = "";
        for (int i = 0; i < length; i++) {
            text += symbols.charAt((int) (Math.random() * symbols.length()));
        }
        return text;
    }

    public static String generateRndSpecialChars(int length) {
        String symbols = "!\"#$%&'()*+/:;<=>?@[\\]^_`{|}~";
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
        driver.get("https://elenta.lt/patalpinti/ivesti-informacija?categoryId=AutoMoto_Automobiliai&actionId=Siulo&returnurl=%2F");
        driver.findElement(By.id("title")).clear();
        driver.findElement(By.id("text")).clear();
        driver.findElement(By.id("price")).clear();
        driver.findElement(By.id("location-search-box")).clear();
        driver.findElement(By.id("phone")).clear();
        driver.findElement(By.id("email")).clear();
    }

    @Test
    public void positiveTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void noTitleTest() {
        driver.findElement(By.id("title")).sendKeys("");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void noDescriptionTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void noPriceTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void noCityTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void noPhoneNumb() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void noEmailTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void title2CharsTest() {
        driver.findElement(By.id("title")).sendKeys(generateRndLetters(2));
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void title3Chars() {
        driver.findElement(By.id("title")).sendKeys(generateRndLetters(3));
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void title150Chars() {
        driver.findElement(By.id("title")).sendKeys(generateRndLetters(150));
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void title151Chars() {
        driver.findElement(By.id("title")).sendKeys(generateRndLetters(151));
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void titleContainingSpecialCharTest () {
        driver.findElement(By.id("title")).sendKeys("Audi RS3" + generateRndSpecialChars(1));
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void titleRepetitiveTextTest() {
        driver.findElement(By.id("title")).sendKeys("AudiAudiAudi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void titleStartsWithPeriodTest() {
        driver.findElement(By.id("title")).sendKeys(".Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void description5CharsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys(generateRndLetters(5));
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void description6CharsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys(generateRndLetters(6));
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void description65_535CharsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys(generateRndLetters(65535));
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void description65_536CharsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys(generateRndLetters(65536));
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void priceSetTo99Test() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("99");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void priceSetTo100Test() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("100");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void priceSetTo999_999Test() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("999999");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void priceSetTo1_000_000Test() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("1000000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void priceNegativeTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("-100");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void priceContainingLettersTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("150k");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void priceContainingSpecialCharsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("15#00");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void priceWrittenInWordsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("penki šimtai");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void city3CharsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vil");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void city4CharsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Seda");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void city25CharsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Jungtinės Šakių Valstijos");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void city26CharsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Jungtinės Šakiai Valstijos");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void cityNumbsOnlyTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("1111");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void cityContainingSpecialCharsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("!Vil@nius#");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void citySpacesOnlyTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("   ");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void cityContainingSlashTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius/name");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void cityContainingAccentedCharTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilniũs");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void cityFakeTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Mordoras");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void phoneNumb7DigitsAndPrefixTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+3706111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void phoneNumb8DigitsAndPrefixTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void phoneNumb9DigitsAndPrefixTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+370611111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void phoneNumbContainingLettersTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+370611111aa");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void phoneNumbContainingSpecialCharsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+3706111111#");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void phoneNumbZeroesOnlyTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("000000000000");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void phoneNumbPrefix380Test() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("38061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void phoneNumbContainingSpaceTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111 111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void email5CharsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys(generateRndLetters(1).toLowerCase() + "@b.c");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void email6CharsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys(generateRndLetters(1).toLowerCase() + "@b.co");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void email64CharsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys(generateRndLetters(23) + generateRndNumbs(23) + "@exampledomain.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void email65CharsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys(generateRndLetters(23) + generateRndNumbs(24) + "@exampledomain.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void emailNumbsOnlyTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys(generateRndNumbs(6));
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void emailLettersOnlyTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys(generateRndLetters(6).toLowerCase());
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void emailAtSignOnlyTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("@");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void emailLocalAtSignOnlyTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void emailDomainAtSignOnlyTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void emailStartsWithPeriodTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys(".standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void emailEndsWithPeriodTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com.");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void emailTwoConsecutivePeriodTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail..com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void emailLocalSpecialCharTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard!@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void emailSpecialCharAfterAtSignTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@!gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void emailQuotedLocalTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("\"standard\"@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void photoFormatPDFTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.pdf");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void photoFormatJPEGTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.jpg");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void photoFormatTIFFTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.tiff");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void photoFormatGIFTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.gif");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void photoFormatBMPTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3.bmp");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void photoResized400PixelsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3_resized_400.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void photoResized500PixelsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3_resized_500.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void photoResized10000PixelsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3_resized_10000.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void photoResized10100PixelsTest() {
        driver.findElement(By.id("title")).sendKeys("Audi RS3");
        driver.findElement(By.id("text")).sendKeys("Visa info telefonu");
        driver.findElement(By.id("price")).sendKeys("25000");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37061111111");
        driver.findElement(By.id("email")).sendKeys("standard@gmail.com");
        driver.findElement(By.id("submit-button")).click();
        driver.findElement(By.id("inputfile")).sendKeys("C:\\Users\\daini\\IdeaProjects\\elentaRegTS\\src\\resources\\images\\audi_rs3_resized_10100.png");
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.id("forward-button")).click();
        driver.findElement(By.cssSelector(".action")).click();
        driver.findElement(By.className("delete")).click();
        driver.switchTo().alert().accept();
    }

}

