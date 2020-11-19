package org.dis.Primer_parcial;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvValidationException;



public class LeeCSV {

	public static List parseaCSV(String path) throws FileNotFoundException {
	      BufferedReader fileReader = new BufferedReader(new FileReader(path));
	        CsvToBean csvToBean = new CsvToBeanBuilder(fileReader) //Lista de beans para cargar el csv
	                                 .withType(LeeCSV.class)
	                                 .withIgnoreLeadingWhiteSpace(true) // Para ignorar blancos
	                                 .build();
        List players = (List) csvToBean.parse();
        return players;
    }
	
	
	}
