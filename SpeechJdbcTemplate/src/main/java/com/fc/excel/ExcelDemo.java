package com.fc.excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {
        //创建空的excel表格
        Workbook wb = new HSSFWorkbook();
        //创建工作区
        Sheet sheet = wb.createSheet("员工数据");
        Row row = sheet.createRow(1);
        Cell cell = row.createCell(2);
        cell.setCellValue("hello world");
        FileOutputStream os = new FileOutputStream(new File("D:\\c\\hello.xls"));
        wb.write(os);
        os.flush();
        os.close();
    }
}
