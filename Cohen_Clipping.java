import java.util.Scanner ; 
public class Cohen_Clipping {
    static double x1,y1,x2,y2,x_min,y_min,x_max,y_max,tx,ty  ;  
    static int bit0,bit1,bit2,bit3 ;  
    static double m ; 
    static int oc1, oc2;  
    static String str1, str2 ; 
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Please input x_min");
        x_min = sc.nextDouble(); 
         System.out.println("Please input x_max");
         x_max = sc.nextDouble();
         System.out.println("Please input y_min");
         y_min = sc.nextDouble(); 
        
        System.out.println("Please input y_max");
        y_max = sc.nextDouble(); 
        System.out.println("Please input x1");
         x1 = sc.nextDouble(); 
        System.out.println("Please input y1");
         y1 = sc.nextDouble(); 
        System.out.println("Please input x2");
         x2 = sc.nextDouble(); 
        System.out.println("Please input y2");
         y2 = sc.nextDouble();
        str1  = outcode(x1,y1);
        System.out.println("initial outcode01 (x1,y1) "+str1);
        str2  = outcode(x2,y2);    
        System.out.println("initial outcode02 (x2,y2) "+str2);
            
       oc1 = Integer.parseInt( outcode(x1,y1) ); 
       oc2 = Integer.parseInt( outcode(x2,y2) ); 

        calculate(); 
    }
    public static String outcode(double x, double y){
        if (x<x_min) { // TBRL
            bit3 =1;
        }
        else{ 
            bit3=0;
        }
        if (x>x_max) 
        {
            bit2=1;
        }
        else{ 
            bit2=0;
        }
        if(y<y_min){
            bit1=1;
        }
        else{ 
            bit1=0;
        }
        if (y>y_max) {
            bit0=1;
        }
        else {
            bit0=0;
        }
        return bit0+""+bit1+""+bit2+""+bit3 ; 
    }
    public static boolean andOp(){
        
        for (int i=0; i<str1.length(); i++){
            if (str1.charAt(i) =='1' && str2.charAt(i) == '1' ){
               return true; 
       
        }
    }
        return false ; 
    }
    public static void calculate(){
            
    while(true) {
//        System.out.println("nemo "+(y2-y1));
//        System.out.println("denom "+(x2-x1));
              m = ( 1.0*(y2-y1) ) / ( 1.0*(x2-x1) ); 
              System.err.println("SLOPE   "+m) ; 
        if (oc1 == 0 && oc2 == 0) {
            //declare completely inside
             System.out.println("INSIDE");
            System.out.println("x1 "+x1+"\t"+"y1 "+y1+"\t\t"+"x2 "+x2+"\t"+"y2 "+y2);
                break;
        }
        else if (andOp()) { // condition to check matching bit // need to refractor
            System.out.println("OUTSIDE");
            break;
        }
        else{ //partial
       
            if(oc1 != 0){
                    selectIntersection(str1,1);
                    x1 = tx; 
                    y1 = ty; 
                    System.out.println("clipped x1 and y1 "+x1+"  "+y1);
                    str1 = outcode(x1, y1); 
                    System.err.println("OUTCODE of x1 and y1 "+str1);
                    oc1 = Integer.parseInt(str1); 
            }
            else{
                selectIntersection(str2,2);
                    x2 = tx; 
                    y2 = ty; 
                    System.out.println("clipped x2 and y2 "+x2+"  "+y2);
                    str2 = outcode(x2, y2); 
                     System.err.println("OUTCODE of x2 and y2 "+str2);
                    oc2 = Integer.parseInt(str2); 
            }
            continue;
        }
    }
}
    
    public static void selectIntersection(String s, int n){
        int i=0 ; 
          for ( ; i<s.length(); i++){
              if (s.charAt(i)=='1'){
              break ; 
              }
        }
          //selecting left
          if (i==3){
              tx = x_min ; 
              ty=  y1+ m * (x_min - x1); 
              System.err.println("Selecting Left for Outcode "+n);
          }
          else if (i==2){ // right
              tx = x_max ; 
              ty= y1+ m * (x_max - x1); 
              System.err.println("Selecting Right for Outcode "+n);
          }
          else if (i==1){ //bottom 
              ty = y_min; 
              tx = x1+(1/m)*(y_min - y1) ; 
              System.err.println("Selecting Bottom for Outcode "+n);
          }
          else if (i==0){ //top
              ty = y_max; 
              tx = x1+(1/m)*(y_max - y1); 
              System.err.println("Selecting Top for Outcode "+n);
          }
          
          
    
    
    }
}