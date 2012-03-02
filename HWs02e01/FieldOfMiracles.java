package fieldofmiracles;
 import java.util.Scanner;
public class FieldOfMiracles {
    public static void main(String[] args) {
      
        Scanner in=new Scanner(System.in);
        String s = "", s1 = "itis", s2 = "XXXX";
        
        int k = s1.length();
        while (k != 0){
              System.out.println(s2);
              s=in.nextLine();
        
       for( int i=0;i<s1.length();i++){
            
            if(s.equals(s1.substring(i,i+1).toLowerCase())){
               k--;
               s2 = s2.substring(0,i)+s1.substring(i,i+1)+s2.substring(i+1);
            }
            }
        }
         System.out.println(s1);
                
    }
}
     
