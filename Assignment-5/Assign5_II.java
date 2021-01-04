import java.util.Scanner;
public class Assign5_II {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int amount;
        int p500=0,p200=0,p100=0,p50=0,p20=0,p10=0,p5=0,p2=0,p1=0;
        System.out.print("Enter the amount:");
        amount=input.nextInt();
        if(amount>=500){
            p500=amount/500;
            amount=amount-p500*500;
        }
        if(amount>=200){
            p200=amount/200;
            amount=amount-p200*200;
        }
        if(amount>=100){
            p100=amount/100;
            amount=amount-p100*100;
        }
        if(amount>=50){
            p50=amount/50;
            amount=amount-p50*50;
        }
        if(amount>=20){
            p20=amount/20;
            amount=amount-p20*20;
        }
        if(amount>=10){
            p10=amount/10;
            amount=amount-p10*10;
        }
        if(amount>=5){
            p5=amount/5;
            amount=amount-p5*5;
        }
        if(amount>=2){
            p2=amount/2;
            amount=amount-p2*2;
        }
        if(amount>=1){
            p1=amount;
        }
        System.out.println("Notes Will Be:");
        System.out.println("500="+p500);
        System.out.println("200="+p200);
        System.out.println("100="+p100);
        System.out.println("50="+p50);
        System.out.println("20="+p20);
        System.out.println("10="+p10);
        System.out.println("5="+p5);
        System.out.println("2="+p2);
        System.out.println("1="+p1);
    }
}