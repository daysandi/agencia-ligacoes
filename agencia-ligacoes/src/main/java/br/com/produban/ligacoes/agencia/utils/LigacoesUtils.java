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

import br.com.produban.ligacoes.agencia.entity.Ligacoes;


public class LigacoesUtils Collection<Ligacoes> readingSheet(String path){

	
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
               excel.setCentral((long) row.getCell(0).getNumericCellValue());  
               excel.setDataLigacao((long) row.getCell(1).getNumericCellValue());
               excel.setDiaSemana(row.getCell(2).getStringCellValue()); 
               excel.setDuracao((long) row.getCell(3).getNumericCellValue());
               excel.setHoraLigacao((long) row.getCell(4).getNumericCellValue());
               excel.setMes(row.getCell(5).getStringCellValue());
               excel.setNome(row.getCell(6).getStringCellValue());
               excel.setNumeroEntrada((long) row.getCell(7).getNumericCellValue());
               excel.setPin((long) row.getCell(8).getNumericCellValue());
               excel.setPorte(row.getCell(9).getStringCellValue());
               excel.setQuantidade((long) row.getCell(10).getNumericCellValue());
               excel.setRamal((long) row.getCell(11).getNumericCellValue());
               excel.setRamal((long) row.getCell(12).getNumericCellValue());
               excel.setRede(row.getCell(13).getStringCellValue());
               excel.setRegional(row.getCell(14).getStringCellValue());
               excel.setSemanaMes((long) row.getCell(15).getNumericCellValue());
               excel.setTipo(row.getCell(16).getStringCellValue());
               excel.setTipoRamal(row.getCell(17).getStringCellValue());
               excel.setTotalPf((long) row.getCell(18).getNumericCellValue());
               excel.setTotalPj((long) row.getCell(19).getNumericCellValue());
               excel.setUniorg((long) row.getCell(20).getNumericCellValue());
                            
               
               System.out.println("");
               System.out.println("");
           }    

       } 

       catch (FileNotFoundException e) {  
          e.printStackTrace();
       }  
       return list;
    }