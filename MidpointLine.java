import java.util.Scanner; 
public class MidpointLine{
    static double x1,y1,x2,y2,dx,dy;
       static int zone; 
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in); 
        //System.out.println("input X0"); 
        //x1 = sc.nextInt(); 
        x1 =69;
       // System.out.println("input Y0"); 
       // y1 = sc.nextInt();
        y1 = 30;
       // System.out.println("input X1"); 
       // x2 = sc.nextInt();
        x2 = 100;
       // System.out.println("input Y1"); 
        //y2 = sc.nextInt(); 
        y2=120;
        dx = x2-x1; 
        dy = y2-y1;
        findZone(); 
        convertToZone0(); // value manipulated
        midPointAlgo(); // value manipulated
        
    }
    
    public static void findZone(){
        if ( Math.abs(dx)>=Math.abs(dy) ){
            
            if (dx>=0 && dy>=0){
                zone = 0 ; 
            }
            else if (dx<0 && dy>=0){
                zone = 3 ; 
            }
            else if (dx<0 && dy<0){
                zone = 4 ; 
            }
            else if (dx>0 && dy<0){
                zone = 7 ; 
            }
        }

        else {
            if(dx>=0 && dy>=0 ){
                zone = 1 ; 
            }
            else if(dx<0 && dy>=0 ){
                zone = 2 ; 
                
            }
            else if(dx<0 && dy<0 ){
                zone = 5 ; 
            }
            else if(dx>0 && dy<0 ){
                zone = 6 ; 
            }
        }
        System.err.println("I am at zone "+zone);
    } // end method
    
    public static void convertToZone0(){
        
        double  t0  = x1 ; 
        double  t1  = x2 ;
        if (zone==1){
            
            x1 = y1 ; 
            x2 = y2; 
            y1 = t0;
            y2 = t1;    
        }
        else if (zone==2){
//            x1 = (-1)*y1 ; 
//            x2 = (-1)*y2; 
//            y1 = x1;
//            y2 = x2;  
            
            x1 = y1 ; 
            x2 = y2; 
            y1 = (-1)*t0;
            y2 = (-1)*t1;    
          //  System.err.println(x1+" "+y1+" "+x2+" "+y2); 
        }
        else if (zone==3){
            x1 = (-1)*x1 ; 
            x2 = (-1)*x2; 
//                y1 = y1;
//                y2 = y2;    
        }
        else if (zone==4){
            x1 = (-1)*x1 ; 
            x2 = (-1)*x2; 
            y1 = (-1)*y1;
            y2 = (-1)*y2;    
        }
        else if (zone==5){
            x1 = (-1)*y1 ; 
            x2 = (-1)*y2; 
            y1 = (-1)*t0;
            y2 = (-1)*t1;    
        }
        else if (zone==6){
            x1 = (-1)*y1 ; 
            x2 = (-1)*y2; 
            y1 = t0;
            y2 = t1;    
        }
        else if (zone==7){
            y1 = (-1)*y1;
            y2 = (-1)*y2;    
        }
        
        
    }
    
    
    public static void midPointAlgo(){
        dx = x2-x1; 
        dy = y2-y1;
        double d= 2.0*dy - dx ; 
        System.err.println("initial D  "+d);
        double incrE = 2.0*dy ; 
        System.err.println("initial E  "+incrE);
        double incrNE = 2.0 * (dy - dx); 
             System.err.println("initial NE  "+incrNE);
        double x= x1 ; // x1 is working as x
        double y= y1; 
        System.err.println("d \t\t x' \t\t y' \t\t x \t\t y "); 
        originalZone(x,y);
        System.out.println(d+"\t\t"+x+"\t\t"+y+"\t\t"+x1+"\t\t"+y1); 
        while (x < x2) { //manipulate it for the n number of iteration 
            if (d <= 0) { 
                //choose E
                d = d + incrE;
                x = x + 1;
                
            }
            else {
                //choose NE
                d = d + incrNE;
                x = x + 1; 
                y = y + 1;
            }
            originalZone(x,y);
            System.out.println(d+"\t\t"+x+"\t\t"+y+"\t\t"+x1+"\t\t"+y1); 
        }
    }
    
    public static void originalZone(double x, double y){
        if (zone==1){
            x1 = y ; 
//            x2 = y2; 
            y1 = x;
//            y2 = x2;    
        }
        else if (zone==2){
            x1 = (-1)*y ; 
//            x2 = (-1)*y2; 
            y1 = x;
//            y2 = x2;    
        }
        else if (zone==3){
            x1 = (-1)*x ; 
//                x2 = (-1)*x2; 
            y1 = y;
//                y2 = y2;    
        }
        else if (zone==4){
            x1 = (-1)*x ; 
//                x2 = (-1)*x2; 
            y1 = (-1)*y;
//                y2 = (-1)*y2;    
        }
        else if (zone==5){
            x1 = (-1)*y ; 
//                x2 = (-1)*y2; 
            y1 = (-1)*x;
//                y2 = (-1)*x2;    
        }
        else if (zone==6){
            x1 = y ; 
//                x2 = y2; 
            y1 = (-1)*x;
//                y2 = (-1)*x2;    
        }
        else if (zone==7){
            x1=x ; 
            y1 = (-1)*y ; 
        }
        else{
            x1 = x ; 
            y1 = y ; 
        }
        
        
    }
}