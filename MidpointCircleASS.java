import java.util.Scanner; 
public class MidpointCircleASS{
    public static void main (String[] args){
       // Scanner sc = new Scanner(System.in); 
   
        double x_center = 0; 
        double y_center = 0; 
   
        double radius = 15; 
        double p = 1.0-radius; 

        double x = 15; 
        double y = 0; 
        System.out.println("X"+"\t\t"+"Y"+"\t\t"+"P");
        System.out.println(x+"\t\t"+y+"\t\t"+p);
        while (x>Math.abs(y)){
            if(p<0){
                // South chosen 
                
                 p = p - 2*y +3 ; 
                y--; 
            }
            else {
                // South West chosen
             
                 p = p - 2*x - 2*y +5 ;
                y--; 
                x--; 
            }
          System.out.println(x+"\t\t"+y+"\t\t"+p);
        }
        
    }
}