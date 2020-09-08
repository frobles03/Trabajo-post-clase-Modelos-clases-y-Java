import java.util.Scanner;
import java.util.*;

public class Address {
    private String streetName;
    private int  streetNumber;
    private  String city;
    private int zipCode;
    private String state;
    private String country;



    public void  address(String streetName,int  streetNumber, String city, int zipCode, String state,String country){
        this.streetName= GenerarPalabra();
        this.streetNumber=GenerarNumCalle();
        this.city= GenerarPalabra();
        this.zipCode=GenerarZip();
        this.state=GenerarPalabra();
        this.country=GenerarPalabra();
        }

        /*
    public void  address(String streetName,int  streetNumber, String city, int zipCode, String state,String country){
        this.streetName= new streetName;
        this.streetNumber=new streetNumber;
        this.city=new city;
        this.zipCode=new zipCode;
        this.state=new state;
        this.country= new country;
        }
*/
    public static String GenerarPalabra(){
        String palabra = "";
        int caracteres = (int)(Math.random()*20)+2;
        for (int i=0; i<caracteres; i++){
            int codigoAscii = (int)Math.floor(Math.random()*(122 -97)+97);
            palabra = palabra + (char)codigoAscii;
        }
        return palabra;
    }
    public static int GenerarZip(){
        Random r = new Random();
        int valor = r.nextInt(4780000)+1;
        return valor;
    }

    public static int GenerarNumCalle(){
        Random r = new Random();
        int valor = r.nextInt(9999)+1;
        return valor;
    }

}
