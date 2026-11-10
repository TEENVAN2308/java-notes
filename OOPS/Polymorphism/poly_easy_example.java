package OOPS.Polymorphism;

public class poly_easy_example {
    
    int sum(int a ){
        int res = a*a;
        return res;
    }
    public static void main(String[] args) {
        System.out.println("polymorphism example!");
        System.out.println("first function!");
        poly_easy_example first = new poly_easy_example();
        System.out.println(first.sum(12)); 
    }
}
