package BASICS.Static;
public class keyword_static
{

    public static void main(String[] args) {
        Human first= new Human("Adam", 23);
        first.display();
        //creating a new human again, now the population is two
        Human second = new Human("Eve",22);
         second.display();
        Human third = new Human("Eve",22);
        third.display();

    }


}
class Human{

    String name;
    int age;
   static int population;
    Human(String name , int age  )
    {
        this.name = name;
        this.age = age;
        Human.population +=1;
    }
    public void  display(){
        System.out.println("name : "+name);
        // System.out.println("Population till now : "+ ++population);
        System.out.println("population "+population);
    }
}
