package main.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
 
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

public class Main 
{
     private static HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook)
     {
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        return style;
    }
     
    public static void main(String[] args) throws IOException 
    {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Расписание");
        
        List<Raspisanie> list = RaspisanieDAO.listRaspisanie();
        
        int rownum = 0;
        Cell cell;
        Row row;
        HSSFCellStyle style = createStyleForTitle(workbook);
        row = sheet.createRow(rownum);
        
        //Понедельник
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("Понедельник");
        cell.setCellStyle(style);
        
        //Вторник
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Вторник");
        cell.setCellStyle(style);
        
        //Среда
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Среда");
        cell.setCellStyle(style);
        
        //Четверг
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Четверг");
        cell.setCellStyle(style);
        
        //Пятница
        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("Пятница");
        cell.setCellStyle(style);
        
        //Итого
        cell = row.createCell(5, CellType.STRING);
        cell.setCellValue("Итого");
        cell.setCellStyle(style);
        
        // Data
        for (Raspisanie rasp : list)
        {
            rownum++;
            row = sheet.createRow(rownum);
 
            // Monday (A)
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue(rasp.getMonday());
            
            // Tuesday (B)
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue(rasp.getTuesday());
            
            // Wednesday (С)
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue(rasp.getWednesday());
            
            // Thursday (D)
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue(rasp.getThursday());
            
            // Friday (E)
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue(rasp.getFriday());
            
            // Total (F)
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue(rasp.getTotal());
        }
        File file = new File("C:/demo/raspisanie.xls");
        file.getParentFile().mkdirs();
 
        FileOutputStream outFile = new FileOutputStream(file);
        workbook.write(outFile);
        System.out.println("Файл создан: " + file.getAbsolutePath());
    }
}