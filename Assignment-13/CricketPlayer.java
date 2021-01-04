
import java.util.Scanner;

class Cricket {
    String name;
    int inning, notout, totalruns, i;
    float batavg;
    Scanner input = new Scanner(System.in);

    public void getData(int i) {
        System.out.print("Enter The " + i + " Player Name:");
        name = input.nextLine();
        System.out.print("Enter The Number Of Innings:");
        inning = input.nextInt();
        System.out.print("Enter The Times Of Not Out:");
        notout = input.nextInt();
        System.out.print("Enter The Total Runs Of Player:");
        totalruns = input.nextInt();
        System.out.println("============");
    }

    static void Average(int n, Cricket c[]) {
        int i;
        for (i = 0; i < n; i++) {
            c[i].batavg = c[i].totalruns / (c[i].inning - c[i].notout);
        }
    }

    public void showData(int i) {
        System.out.println(i + " Player Details:");
        System.out.println("Name: " + name);
        System.out.println("No Of Innings: " + inning);
        System.out.println("No Times Notout: " + notout);
        System.out.println("Total Runs: " + totalruns);
        System.out.println("Batting Avg: " + batavg);

    }
}

public class CricketPlayer {
    public static void main(String[] args) {
        int i, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of player:");
        n = input.nextInt();
        Cricket c[] = new Cricket[n];
        for (i = 0; i < n; i++) {
            c[i] = new Cricket();
            c[i].getData(i);
        }
        Cricket.Average(n, c);

        for (i = 0; i < n; i++) {
            System.out.println("============");
            c[i].showData(i);
        }

    }
}
