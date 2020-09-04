import java.util.Scanner;

public class Person {
    public String firstName;
    public String lastName;
    public String email;
    public String userName;
    public String password;
    public Address address;
    public String example;


   public void datos(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese su nombre");
       validadorLetras();
       example=firstName;
       System.out.println("Ingrese su apellido");
       validadorLetras();
       example=lastName;
       System.out.println("ingrese su email");
       email=sc.next();
       System.out.println("ingrese nombre de usuario");
       userName=sc.next();
       System.out.println("ingrese contraseña");
       password=sc.next();

   }









    public void validadorLetras() {
        Scanner sc = new Scanner(System.in);

        try {
            example = sc.next();
        }catch (Exception ex){
         System.out.println("ingrese solo letras");
        }

    }
}
