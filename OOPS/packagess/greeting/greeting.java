package OOPS.packagess.greeting;

//importing arraylist just to check its package.
import java.util.ArrayList;

public class greeting {
    
public static void main(String[] args) {
    ArrayList<String> what = new ArrayList<>();
    what.add("what");
   System.out.println(what.get(0)); 
}
public void hello(){
    System.out.println("Hello from package packagess.greeting");
}
    
}
