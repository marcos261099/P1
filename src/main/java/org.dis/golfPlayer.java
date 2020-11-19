package org.dis.Primer_parcial;
import com.opencsv.bean.CsvBindByName;
public class golfPlayer {
    @CsvBindByName
    private String Posicion;

    @CsvBindByName
    private String Nombre;

    @CsvBindByName
    private String Apellido;

    @CsvBindByName
    private String Pais;
    

    @CsvBindByName
    private String Edad;

}