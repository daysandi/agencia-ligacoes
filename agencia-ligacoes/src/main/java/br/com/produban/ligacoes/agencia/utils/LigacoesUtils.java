package br.com.produban.ligacoes.agencia.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class LigacoesUtils <Ligacoes> Collection<Ligacoes> readingSheet(String path){

	
        List<Ligacoes> list = new ArrayList<Ligacoes>();
        try {  

           File file = new File(path);  

           String name = file.toString();  

           int pos = name.lastIndexOf('.');  

           String ext = name.substring(pos + 1);  

           FileInputStream fileIn = new FileInputStream(file);  

           Workbook obj = null;  

           if (ext.equals("xlsx")) {

               try {  
                   //Metodo aceita o path do arquivo  
                   obj = new XSSFWorkbook(fileIn);  
               } 

               catch (IOException ex) {  
                   throw new RuntimeException(ex);  
               }  
           } 

           else if (ext.equals("xls")) {  

               try {  
                   //Metodo nao aceita string do path do arquivo  
                   obj = new HSSFWorkbook(fileIn);  
               } 
               catch (IOException e) {  
                   throw new RuntimeException(e);  
               }  
           }  

           else {  
               throw new IllegalArgumentException("Arquivo recebido não é uma extensão do Excel");  
           }  

           int o = 0;  

           Sheet worksheet = obj.getSheet("Plan1");  

           Row row;  

           Cell cell;  

           for(int i = 1; i<= worksheet.getLastRowNum(); i++){  

               row = worksheet.getRow(i);  
               Ligacoes excel = new Ligacoes();
               excel.setFirstCol(row.getCell(0).getStringCellValue());  
               excel.setFirstCol(row.getCell(1).getStringCellValue());
               excel.setFirstCol((int)row.getCell(2).getNumericCellValue()); 
               System.out.println("");
               System.out.println("Linha: " + linha);  
               System.out.println("");
           }    

       } 

       catch (FileNotFoundException e) {  
          e.printStackTrace();
       }  
       return list;
    }