import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int x;
        x = (int) (Math.random()*6)+1;
        return x;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int x;
        int y;
        int z;
        int[] x1 = new int[12];
        for (int i=0; i < n; i++){
            x= rollDie();
            y = rollDie();
            z= x+y;
            x1[z-2]+=1;
            
        }
        return x1;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Rolls: ");
        String roll = scan.next(); 
        int n = Integer.parseInt(roll);
        int[] rb = sumOfTwoDice(n);
        int w;

        for (int i = 0; i<rb.length; i++){
            w=i+2;
            System.out.println(rb[i] + w);
        }
        scan.close();



    }
}
