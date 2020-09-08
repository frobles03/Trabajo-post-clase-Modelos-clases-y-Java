import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String password;
    private Address address;



    public Person(String firstName,String lastName, String email, String userName,String password,Address address){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.userName=userName;
        this.password=password;
        this.address=address;
        }
        //imprimir array
    static  void mostrarPerson(Person[] array){
        for (int i = 0; i < array.length; i++)
        System.out.println((i+1) + ". " + array[i].firstName + array[i].lastName +"email: "+ array[i].email + "user name: "+array[i].userName + "contraseña: "+array[i].password + array[i].address);
    }

    public void hacerPerson(){
        Person[]arrayPerson=new Person[5];
        arrayPerson[0]=new Person("Elena  ", "Nito","esapajab-1588@yopmail.com","Enana", "soygrande",address);
        arrayPerson[1]=new Person("Aranzazu", "Aranda","fusilsemitraill@runnersreference.com","Ara","12345qwert",address);
        arrayPerson[2]=new Person("Elsa  ", "Capunta","fudriburti@enayu.com","frozen","frost",address);
        arrayPerson[3]=new Person("Cecilio ","Plasencia","amantedelacomida53aol@gmail.com","CENA","hisnameisjohn",address);
        arrayPerson[4]=new Person("Soila ", "Cerda","appebepa-9419@yopmail.com","Porcina", "puerco",address);
        arrayPerson[5]=new Person("Ana", "Tomía","xisekoh999@kespear.com","Tomatia", "B0n3$", address);

    }



}
