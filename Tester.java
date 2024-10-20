import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("pilih 1. CD atau 2. DVD");
        int pilihan = in.nextInt();

        if (pilihan ==1) {
            System.out.println("Number : ");
            int number = in.nextInt();

            System.out.println("name : ");
            String name = in.nextLine();

            System.out.println("quantity : ");
            int quantity = in.nextInt();

            System.out.println("price : ");
            double price = in.nextDouble();

            System.out.println("artist : ");
            String artist = in.nextLine();

            System.out.println("numSong : ");
            int numSong = in.nextInt();
            
            System.out.println("label : ");
            String label = in.nextLine();
            CD cd1 = new CD(number, name, quantity, price, artist, numSong, label);
            cd1.print();
        }else if (pilihan ==2) {
             System.out.println("Number : "); 
             int number = in.nextInt();

             System.out.println("name : ");
            String name = in.nextLine();

            System.out.println("quantity : ");
            int quantity = in.nextInt();

            System.out.println("price : ");
            double price = in.nextDouble();

            System.out.println("artist : ");
            String artist = in.nextLine();

            System.out.println("numSong : ");
            int numSong = in.nextInt();

            System.out.println("label : ");
            String label = in.nextLine();

            System.out.println("length : ");
            int length = in.nextInt();

            System.out.println("rating : ");
            String rating = in.nextLine();

            System.out.println("studio : ");
            String studio = in.nextLine();
            
              DVD dvd1 = new DVD(number, name, quantity, price, length, rating, studio);
              dvd1.print();
        }else {
            System.out.println("Input salah");
        }
             

        
    }
    
}
