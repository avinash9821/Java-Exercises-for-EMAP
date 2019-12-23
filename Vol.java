public class Vol{
    double h,w,d;

     Vol(double width,double height,double depth)
    {
        h=height;
        w=width;
        d=depth;
    }
    double volume()
    { double v;
    v=h*w*d;
    return v;
    }
   
    public static void main(String[] args) {
       
    Vol ob = new Vol(8.5,80.3,9.6);
    System.out.println(ob.volume());

    }

}
