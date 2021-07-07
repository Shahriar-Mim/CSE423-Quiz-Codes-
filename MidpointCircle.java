import java.util.Scanner; 
public class MidpointCircle{
    public static void main (String[] args){
         double x_center = 0; 
        double y_center = 0; 
   
        double radius = 15; 
        double p = 1.0-radius; 

        double x = 0; //0 should inputed by default; 
        double y = 15; // you should calculate if the question is tricky 
        System.out.println("X"+"\t\t"+"Y"+"\t\t"+"P");
        System.out.println(x+"\t\t"+y+"\t\t"+p);
        while (x<y){
            if(p<0){
                // E chosen 
                p = p + 2*x + 3 ; 
                x++; 
            }
            else {
                // SE chosen
                p = p + 2*x - 2*y + 5 ;
                x++; 
                y--; 
            }
          System.out.println(x+"\t\t"+y+"\t\t"+p);
        }
        
    }
}