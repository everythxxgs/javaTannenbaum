import java.util.Scanner;

public class Tannenbaum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Höhe: ");
        int height = scan.nextInt();
        System.out.print("Modus: Up(1), Down(2), Tannenbaum(3): ");
        byte mode = scan.nextByte();
        if (mode==1)up(height);
        else if (mode==2)down(height);
        else if (mode==3)tannenbaum(height);
        else System.out.println("Falscher Modus");

    }
    public static void tannenbaum(int height) {
        int width=0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            width = i * 2 + 1;
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        if(width==3) {System.out.println("  *");return;}
        for (int i = 0; i < Math.ceil((double) width/10); i++) {
            for (int j = 0; j < width/2-width/10+1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width/5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void up(int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void down(int height){
        StringBuilder star = new StringBuilder() ;
        for (int i = 0; i < height; i++) {
            star.append("*");
            System.out.println(star);
        }
    }
}
