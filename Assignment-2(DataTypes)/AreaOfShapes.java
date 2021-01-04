public class AreaOfShapes {
    public static int radius;
    public static int R_height,width;
    public static int T_height,base;
    public static double C_area,T_area,R_area;
    public static void setdata()
    {
        radius=45;
        R_height=2;
        width=6;
        T_height=10;
        base=20;
    }
    public static void calculate()
    {
        C_area=3.141*radius*radius;
        R_area=width*R_height;
        T_area=0.5*base*T_height;
    }
    public static void ShowArea() {
        System.out.println("Radius of circle is="+radius);
        System.out.println("Area Of Circle="+C_area);
        System.out.println("Height and width of Rectangle is="+R_height+" "+width);
        System.out.println("Area Of Rectangle="+R_area);
        System.out.println("Height and Base of Triangle is="+T_height+" "+base);
        System.out.println("Area of Triangle="+T_area);
    }
    public static void main(String[] args) {
        setdata();
        calculate();
        ShowArea();
    }
    
}
