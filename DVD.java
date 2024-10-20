public class DVD extends Product {
    int length;
    String rating;
    String studio;
    
     
    public DVD() {
        super(); 
        length = 0;
         rating = "";
         studio = "";
    }
    
      public DVD(int number, String name, int quantity, double price, int length, String rating, String studio) {
        super(number, name, quantity, price);
        this.length = length;
        this.rating = rating;
        this.studio = studio;
      }
    
}