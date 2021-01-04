public class dilu{
  public static void main(String[] args) {
    dilsad s1=new dilsad(1,"Dilsad mohammed");
    System.out.println(s1);
  }
}
class dilsad extends Object{


  int num;
  String sname;
  dilsad(int num,String sname){
    this.num=num;
    this.sname=sname;
  }
  public String toString(){
    return num+" : "+sname;
  }

}