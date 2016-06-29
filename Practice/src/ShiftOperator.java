import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public final class ShiftOperator {
   
        public static void main(String args[]) throws IOException {
//        int i;
//        int num = 0xFFFFFFE;
//        for(i=0; i<4; i++) {
//        num = num << 1;
//        System.out.println(num);
//        }
            
            String[] str = new String[100];
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            for(int i=0; i<100; i++){
                str[i] = br.readLine();
               if(str[i].equals("stop"))
                    break;                
            }
            System.out.write('A');
            for(String str1 : str){
                System.out.println(str1);
                if(str1.equals("stop"))
                    break;
            }
                       
        }
      
}
