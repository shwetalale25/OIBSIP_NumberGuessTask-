import java.util.Scanner;
import java.util.Random;

class Guessnumb_Task {
    void guessnor() {
        Random rd = new Random();
        int rnum = rd.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int count = 1, score = 0;

        System.out.print("Guess the number between 1 to 100 : ");
        int ans = sc.nextInt();
        if (ans == rnum) {
            System.out.println("Number Guessed correctly");
        } else if (ans != rnum) {
            while (ans != rnum) {
                if (rnum > ans) {
                    System.out.println("Entered number is less than random number:  " + ans);
                    System.out.print("Try once again : ");
                    ans = sc.nextInt();
                    count++;
                } else if (rnum < ans) {
                    System.out.println("Entered number is greater than random number:  " + ans);
                    System.out.print("Try once again : ");
                    ans = sc.nextInt();
                    count++;
                }
            }
            if (ans == rnum) {
                System.out.println("Number Guessed correctly in " + count + " attempts");
            }
        }
        switch (count) {
            case 1:
                score = 50;
                System.out.println("Score :" + score);
                break;
            case 2:
                score = 40;
                System.out.println("Score :" + score);
                break;
            case 3:
                score = 30;
                System.out.println("Score :" + score);
                break;
            case 4:
                score = 20;
                System.out.println("Score :" + score);
                break;
            case 5:
                score = 10;
                System.out.println("Score :" + score);
                break;
            default:
                score = 0;
                System.out.println("Score : " + 0 + " because number is not guessed within 5 attempts....\n");
                break;

        }
    }

    public static void main(String[] args) {
        Guessnumb_Task gn = new Guessnumb_Task();
        gn.guessnor();
    }
}