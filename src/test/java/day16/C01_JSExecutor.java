package day16;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

public class C01_JSExecutor extends TestBaseBeforeAfter {
    @Test
    public void test1() {

//Asagidaki carreers butonunu gorunceye kadar js ile scroll yapalim
//Carreers butonuna js ile click yapalim
        //Amazon sayfasina gidelim
        driver.get("https://www.amazon.com");


        WebElement carreers = driver.findElement(By.xpath("//*[text()='Careers']"));

        JavascriptExecutor jse= (JavascriptExecutor) driver;

        jse.executeScript("arguments[0].scrollIntoView(true);",carreers);
        jse.executeScript("arguments[0].click();",carreers);

        //odev

//Yeni bir class olusturun : ScroolInto
//hotelmycamp anasayfasina gidin
//2 farkli test method’u olusturarak actions classi ve Js Executor kullanarak asagidaki oda turlerinden  ust sira ortadaki odayi tiklayin
//istediginiz oda inceleme sayfasi acildigini test  edin
    }
}
