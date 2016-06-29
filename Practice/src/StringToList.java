import java.util.ArrayList;
import java.util.List;



public class StringToList {

    List<String> st = new ArrayList<String>();
    
    public List<String> split(){
        
       
        
        
        return st;
    }
    
    
   public static void main(String args[]){
       List<String> st = new ArrayList<String>();
       
       String s= "123456789";
              
       for(int i = 0 ; i < 9; i++){
           String ch = String.valueOf(s.charAt(i));
           if(i == 0)
               st.add(ch);
           else
           {
               int f=i;
          
               st.add(st.get(--f).concat(ch));
           }
           
       }
       
       for(String st1: st){
           System.out.println(st1);
       }
   }
    
    
    
}
