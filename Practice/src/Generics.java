

public class Generics<T extends Number> {

    T[] num;
    
    Generics(T[] o){
        num = o;        
    }
    
    public double average(){
        int sum = 0;
        for(int i = 0; i < num.length; i++){
            sum += num[i].intValue();
        }
        return sum/num.length;   
    }
    
    public boolean sameAvg(Generics<?> ob){
        if(average() == ob.average())
            return true;
        return false;
    }
    public static void main(String[] args) {
        
        Integer[] inum = {1, 2, 3, 4, 5};
        Double[] dnum = {1.1, 2.2, 3.3, 4.4};
        
        Generics<Integer> ob1 = new Generics<Integer>(inum);
        Generics<Double> ob2 = new Generics<Double>(dnum);
        
        if(ob1.sameAvg(ob2))
            System.out.println("Averages are same");   
        else
            System.out.println("not same");

    }

}
