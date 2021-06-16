package com.testNG.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {
    @Test
    public void test() throws IOException {
        String dosyaYolu = "/Users/sevdetka/IdeaProjects/TestNGFramework/src/test/resources/veriler.xlsx";
        FileInputStream file = new FileInputStream(dosyaYolu);

//Excel dosyasini okuyalim
        Workbook excel = WorkbookFactory.create(file);
//Sheet secimi
        Sheet sheet = excel.getSheetAt(0);
//Satirlar
        Row birinciSatir = sheet.getRow(0);
//Hucreler
        Cell isim = birinciSatir.getCell(0);

        System.out.println(isim.toString());


        file.close();

    }
}
