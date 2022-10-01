package day14;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C03_ReadExcell {
    @Test
    public void readExcellTest() throws IOException {

// belirtilen satir no ve sutun no degerlerini parametre olarak alip
// o cell'deki datayi konsola yazdirin
// sonra sonucun konsolda yazanla ayni oldugunu dogrulayin

        int satir=12;
        int sutun=2;

        String  dosyaYolu = "src/main/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);

        Workbook workbook = WorkbookFactory.create(fis);

        String actualData=workbook.getSheet("Sayfa1").getRow(satir-1).getCell(sutun-1).toString();
        //Index 0'dan başladığı için bizden istenen satıra ulaşabilmek için bir eksiğini alırız

        System.out.println(actualData);


        String kosoldaYazan ="Baku";
        Assert.assertEquals(kosoldaYazan, actualData);



    }
}
