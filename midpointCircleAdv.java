public class midpointCircleAdv{
    public static void main(String[]args){


        java.util.Scanner sc= new java.util.Scanner(System.in);
        System.out.println("x of center :");
        int x1= sc.nextInt();
        System.out.println("y of center:");
        int y1= sc.nextInt();
        System.out.println("Insert the value of the radius :");
        int r= sc.nextInt();
        System.out.println("Insert the zone :");
        int z= sc.nextInt();


        int x=0;
        int y=r;
        int d =1-r;

        String s ="E";
        if(z==1){
            System.out.println("zone1 center(0,0) coordinates:"+"("+x+","+y+") ,"+s+" and d ="+d+", zone "+z+"'s"+" coordinates: "+"("+(x+x1)+","+(y+y1)+")");
        }
        else if(z==0){
            System.out.println("zone1 center(0,0) coordinates:"+"("+x+","+y+") ,"+s+" and d ="+d+", zone "+z+"'s"+" coordinates: "+"("+(y+x1)+","+(x+y1)+")");
        }
        else if(z==2){
            System.out.println("zone1 center(0,0) coordinates:"+"("+x+","+y+") ,"+s+" and d ="+d+", zone "+z+"'s"+" coordinates: "+"("+(-x+x1)+","+(y+y1)+")");
        }
        else if(z==3){
            System.out.println("zone1 center(0,0) coordinates:"+"("+x+","+y+") ,"+s+" and d ="+d+", zone "+z+"'s"+" coordinates: "+"("+(-y+x1)+","+(x+y1)+")");
        }
        else if(z==4){
            System.out.println("zone1 center(0,0) coordinates:"+"("+x+","+y+") ,"+s+" and d ="+d+", zone "+z+"'s"+" coordinates: "+"("+(-y+x1)+","+(-x+y1)+")");
        }
        else if(z==5){
            System.out.println("zone1 center(0,0) coordinates:"+"("+x+","+y+") ,"+s+" and d ="+d+", zone "+z+"'s"+" coordinates: "+"("+(-x+x1)+","+(-y+y1)+")");
        }
        else if(z==6){
            System.out.println("zone1 center(0,0) coordinates:"+"("+x+","+y+") ,"+s+" and d ="+d+", zone "+z+"'s"+" coordinates: "+"("+(x+x1)+","+(-y+y1)+")");
        }
        else if(z==7) {
            System.out.println("zone1 center(0,0) coordinates:"+"("+x+","+y+") ,"+s+" and d ="+d+", zone " +z+"'s"+" coordinates: " + "("+(y+x1)+","+(-x + y1)+")");
        }
        // System.out.println("zone 1's coordinates:("+x+","+y+") and d ="+d+" ,original zone's transformed coordinates: "+"("+(x+x1)+","+(y+y1)+")");
        while(x<y){
            if(d>=0){
                d=d+2*x-2*y+5;
                x++;
                y--;
            }
            else{
                d=d+2*x+3;
                x++;

            }
           if(d>0)
               s="SE";
           else
               s="E";
           if(x<y)
            if(z==1){
                System.out.println("zone1 center(0,0) coordinates:"+"("+x+","+y+") ,"+s+" and d ="+d+", zone "+z+"'s"+" coordinates: "+"("+(x+x1)+","+(y+y1)+")");
            }
            else if(z==0){
                System.out.println("zone1 center(0,0) coordinates:"+"("+x+","+y+") ,"+s+" and d ="+d+", zone "+z+"'s"+" coordinates: "+"("+(y+x1)+","+(x+y1)+")");
            }
            else if(z==2){
                System.out.println("zone1 center(0,0) coordinates:"+"("+x+","+y+") ,"+s+" and d ="+d+", zone "+z+"'s"+" coordinates: "+"("+(-x+x1)+","+(y+y1)+")");
            }
            else if(z==3){
                System.out.println("zone1 center(0,0) coordinates:"+"("+x+","+y+") ,"+s+" and d ="+d+", zone "+z+"'s"+" coordinates: "+"("+(-y+x1)+","+(x+y1)+")");
            }
            else if(z==4){
                System.out.println("zone1 center(0,0) coordinates:"+"("+x+","+y+") ,"+s+" and d ="+d+", zone "+z+"'s"+" coordinates: "+"("+(-y+x1)+","+(-x+y1)+")");
            }
            else if(z==5){
                System.out.println("zone1 center(0,0) coordinates:"+"("+x+","+y+") ,"+s+" and d ="+d+", zone "+z+"'s"+" coordinates: "+"("+(-x+x1)+","+(-y+y1)+")");
            }
            else if(z==6){
                System.out.println("zone1 center(0,0) coordinates:"+"("+x+","+y+") ,"+s+" and d ="+d+", zone "+z+"'s"+" coordinates: "+"("+(x+x1)+","+(-y+y1)+")");
            }
            else if(z==7) {
                System.out.println("zone1 center(0,0) coordinates:"+"("+x+","+y+") ,"+s+" and d ="+d+" zone " +z+"'s"+" coordinates: " + "("+(y+x1)+","+(-x + y1)+")");
            }
            //System.out.println("zone 1's coordinates:("+x+","+y+") and d ="+d+" ,original zone's transformed coordinates: "+"("+(x+x1)+","+(y+y1)+")");
        }
    }
}
