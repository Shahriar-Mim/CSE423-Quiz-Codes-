import java.util.Scanner;
class TestDDA{
  
  
  public static void dda(double x1, double y1,double x2, double y2) {
    double dx=(x2-x1),dy=(y2-y1),step=0;
    if(Math.abs(dx)>Math.abs(dy)) {
      step=Math.abs(dx);
    }
    else{
        step=Math.abs(dy);
    }
     
    double xinc=dx/step;
    double yinc=dy/step;
    double y=y1;
    double x=x1;
    

    for(int i=0;i<step;i++) {
      System.out.println(x+"\t"+"\t"+y);
      x+=xinc;
      y+=yinc;
    }
  }
  public static void main(String args[])
  {
    System.out.println("you need to give value of x1, y1, x2, y2");
    Scanner sc = new Scanner(System.in);
    System.out.println("x1");
    double x1=sc.nextInt();
    System.out.println("y1");
    double y1=sc.nextInt();
    System.out.println("x2");
    double x2=sc.nextInt();
    System.out.println("y2");
    double y2=sc.nextInt();
    
    dda(x1,y1,x2,y2);

  }
}
