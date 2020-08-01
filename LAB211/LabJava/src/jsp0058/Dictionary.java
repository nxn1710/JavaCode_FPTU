package jsp0058;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dictionary {

    Sheet sheet;
    FileInputStream fis;
    FileOutputStream fos;
    Workbook wb = null;
    String file;

    private HashMap<String, String> dictionary = new HashMap<>();

    public Dictionary(String file) {
        this.file = file;
        try {
            fis = new FileInputStream(file);
            wb = new XSSFWorkbook(fis);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
        sheet = wb.getSheetAt(0);
    }

    public void loadData() {
        int row = getRowCount();
        for (int i = 0; i < row; i++) {
            String isDel = ReadCellData(i, 0);
            if (isDel.equalsIgnoreCase("1.0")) {
                String eng = ReadCellData(i, 1);
                String vnam = ReadCellData(i, 2);
                dictionary.put(eng, vnam);
            }
        }
    }

    public void clearRecycleBin() {
        int row = getRowCount();
        int i = 0;
        while (i != row) {
            Row r = sheet.getRow(i);
            Cell cell = r.getCell(0);
            int a = (int) cell.getNumericCellValue();
            if (a == 0) {
                String eng = r.getCell(1).getStringCellValue();
                dictionary.remove(eng);
                sheet.removeRow(r);
                sheet.shiftRows(i + 1, row, -1);
                i--;
                row--;
            } else {
                i++;
            }
        }
        try {
            fos = new FileOutputStream(file);
            wb.write(fos);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addnewWord(String eng, String vnm) {
        int nrow = getRowCount();
        int i;
        if (dictionary.get(eng) == null) {
            if ((i = getRow(eng)) == -1) {
                Row row = sheet.createRow(nrow);
                row.createCell(0).setCellValue(1);
                row.createCell(1).setCellValue(eng);
                row.createCell(2).setCellValue(vnm);
                dictionary.put(eng, vnm);
            } else {
                Row row = sheet.getRow(i);
                Cell cell1 = row.getCell(0);
                Cell cell2 = row.getCell(1);
                Cell cell3 = row.getCell(2);
                cell1.setCellValue(1);
                cell2.setCellValue(eng);
                cell3.setCellValue(vnm);
                dictionary.put(eng, vnm);
            }
        }
        try {
            fos = new FileOutputStream(file);
            wb.write(fos);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getRowCount() {
        int rowTotal = sheet.getLastRowNum();
        if ((rowTotal > 0) || (sheet.getPhysicalNumberOfRows() > 0)) {
            rowTotal++;
        }
        return rowTotal;
    }

    public String ReadCellData(int vRow, int vColumn) {
        String value = null;
        Row row = sheet.getRow(vRow);
        Cell cell = row.getCell(vColumn);
        if (vColumn == 0) {
            value = String.valueOf(cell.getNumericCellValue());
        } else {
            value = cell.getStringCellValue();
        }
        return value;
    }

    public void search(String eng) {
        String vietnamese = dictionary.get(eng);
        if (vietnamese != null) {
            System.out.println("Vietnamese: " + vietnamese);
        } else {
            System.out.println("Dont have that word in dictionary");
        }
    }

    public int getRow(String eng) {
        int rowTotal = sheet.getLastRowNum();
        for (int i = 0; i < rowTotal; i++) {
            Row row = sheet.getRow(i);
            Cell cell = row.getCell(1);
            String eng1 = cell.getStringCellValue();
            if (eng.equalsIgnoreCase(eng1)) {
                return i;
            }
        }
        return -1;
    }

    public void moveRecycleBin(int Rrow, String eng) {
        Row row = sheet.getRow(Rrow);
        Cell cell = row.getCell(0);
        cell.setCellValue(0);
        dictionary.remove(eng);
        System.out.println("Remove " + eng + " successfully");
        try {
            FileOutputStream out = new FileOutputStream(file);
            wb.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readDictionary() {
        Iterator<String> key = dictionary.keySet().iterator();
        while (key.hasNext()) {
            String eng = key.next();
            System.out.println("English: " + eng);
            System.out.println("Vietnamese: " + dictionary.get(eng));
        }
    }
}
