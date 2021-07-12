public class CyrusBeckBeta {
    public static void main (String[] args){
    double x0 = -100; 
    
        double y0= 220; 
        
             double x1 = 450; 
            
                       double y1 = -10; 
                
                 
         double x_min = 0;       
         
                  double y_min =0; 
         
                           double x_max =300 ; 
                  
                                   double y_max =200 ; 
         
    String d = "("+(x1 - x0)+", "+(y1 - y0)+")"; 
    System.out.println("D : "+d); 
    double t_left = (-1)*(x0-x_min) / (x1-x0) ; 
    double t_right = (-1)*(x0-x_max) / (x1-x0) ; 
    double t_top = (-1)*(y0-y_max) / (y1-y0) ; 
    double t_bottom = (-1)*(y0-y_min) / (y1-y0) ; 
    System.err.println("x0"+"\t\t\t"+"y0"+"\t\t\t"+"x1"+"\t\t"+"y1"); 
    System.out.println(x0+"\t\t"+y0+"\t\t"+x1+"\t\t"+y1);
    System.err.println("x_min"+"\t\t\t"+"y_min"+"\t\t\t"+"x_max"+"\t\t"+"y_max"); 
    System.out.println(x_min+"\t\t"+y_min+"\t\t"+x_max+"\t\t"+y_max);
    System.err.println("t_left"+"\t\t\t"+"t_right"+"\t\t\t"+"t_bottom"+"\t\t"+"t_top"); 
    System.out.println(t_left+"\t\t"+t_right+"\t\t"+t_bottom+"\t\t"+t_top); 
}
}