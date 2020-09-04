import java.util.Scanner;

public class Address {
    public String streetName;
    public int  streetNumber;
    public  String city;
    public int zipCode;
    public String state;
    public String country;
    public String example;
    public int exampleN;
    public  Address(){
        System.out.println("ingrese el nombre de la calle en donde vive");
        validadorLetras();
        example=streetName;
        example=null;
        System.out.println("ingrese el numero de su casa");
        validadorNumero();
        exampleN=streetNumber;
        exampleN=0;
        System.out.println("ingrese nombre de la ciudad en que reside ");
        validadorLetras();
        example=city;
        example=null;
        System.out.println("ingrese codigo postal");
        validadorNumero();
        exampleN=zipCode;
        exampleN=0;
        System.out.println("ingreseen que pais reside");
        validadorLetras();
        example=country;
        example=null;
        System.out.println("ingrese en que estado reside");
        validadorLetras();
        example=state;
        example=null;


    }

    public void validadorLetras() {
        Scanner sc = new Scanner(System.in);

        try {
            example = sc.next();
        }catch (Exception ex){
            System.out.println("ingrese solo letras");
        }

    }
    public void validadorNumero() {
        Scanner sc = new Scanner(System.in);

        try {
            example = sc.next();
        }catch (Exception ex){
            System.out.println("ingrese solo numeros");
        }

    }
}
