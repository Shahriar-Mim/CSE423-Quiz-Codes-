public class MidpointLineASS{
    public static void main (String[] args){
        int x0  = 11 , y0 = 9 , x1=34, y1=-9; 
        int dx, dy, incrE, incrNE, d, x, y;  
        dx = x1-x0; 
        dy = y1-y0; 
        d = 2 * dy + dx; 
        incrE = 2 * dy;  
        incrNE = 2 * (dy + dx); 
        x = x0; 
        y = y0; 
       System.out.println(x+"\t\t"+y); 
        while (x < x1) {
            if (d <= 0) { 
                //choose E
                d = d + incrE; 
                x = x + 1;
            }
            else {
                //choose SE
                System.err.println("ashlam");
                d = d + incrNE; 
                x = x + 1; 
                y = y - 1;
            }
             System.out.println(x+"\t\t"+y); 
        }
    }
}
