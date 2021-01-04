public class Calcint {

    public static void SetData()
    {
        int p,r,t;
        float interest;
        p=200000;
        r=4;
        t=3;
        interest=(p*r*t)/100;
        System.out.println("Interest IS:"+interest);
        System.out.println("Amount Is="+p+" rupees.");
        System.out.println("Rate OF interest is= "+r);
        System.out.println("Time:"+t+"(in Year)");
        
    }
    public static void main(String[] args) {
       
        SetData();
    }
    
}
