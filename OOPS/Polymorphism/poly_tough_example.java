package OOPS.Polymorphism;

/**
 * Example of polymorphism -- using a person
 */

class Person{
    void role(){ System.out.println("I am a person");}
}
class father extends Person{
    void role(){
        System.out.println("My name is nav and i will be a father in 10 years.");
    }
}
class son extends father{
     
    void role() 
    {
        System.out.println("My name is nav and i am a good son :)");
    }

}


public class poly_tough_example {

    public static void main(String[] args) {
        Person nav = new son();
        nav.role();
        
    }
}