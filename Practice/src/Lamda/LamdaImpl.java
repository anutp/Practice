package Lamda;


public class LamdaImpl {

    public static void main(String[] args) {
        
        FunctionalInt funct = n -> (n % 2) == 0;
        
        if(funct.getValue(10))
            System.out.println("Even");

    }

}
