package org.dis.Primer_parcial;

import java.awt.List;
import java.io.IOException;
import com.google.gson.*;
import com.opencsv.exceptions.CsvValidationException;

public class EscribeJSON {

    public static void main(String[] args) throws CsvValidationException, IOException {
    	LeeCSV myClase = new LeeCSV();
    	List players =LeeCSV.parseaCSV("best-golf-players.csv");
	    Gson gson = new Gson();
        String jsonString = gson.toJson(players);
        System.out.println(players.toString());
    }
    
 }
