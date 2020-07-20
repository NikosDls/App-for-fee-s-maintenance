package testcircle;

public class TestCircle {

    public static void main(String[] args) {
    //χρήση της static μεταβλητής που απαριθμεί τους κύκλους που έχουν δημιουργηθεί 
        System.out.println("Number of Objects= " + Circle.count); 
 
    // Δημιουργία 1ου αντικειμένου 
        Circle troxos1 = new Circle(10,5,5); 
 
    //εκτύπωση της τιμής του χ, να δημιουργηθούν μέθοδοι και για το y και για το εμβαδόν 
        System.out.println("\ntroxos1: x= " + troxos1.getX() + "\t y= " + troxos1.getY() + "\t embadon= " + troxos1.area()); 
        System.out.println("Number of Objects= " + Circle.count); 

        Circle kyklos1, kyklos2; 
        kyklos1 = new Circle(10,8,8); 
        kyklos2 = kyklos1;
        
        System.out.println("\nkyklos1: x= " + kyklos1.getX() + "\t y= " + kyklos1.getY() + "\t aktina= " + kyklos1.getRadius());
        System.out.println("\nkyklos2: x= " + kyklos2.getX() + "\t y= " + kyklos2.getY() + "\t aktina= " + kyklos2.getRadius());
        
        kyklos2.setRadius(50);
        
        System.out.println("\nkyklos2: x= " + kyklos2.getX() + "\t y= " + kyklos2.getY() + "\t aktina= " + kyklos2.getRadius());

        System.out.println("Number of Objects= " + Circle.count); 
    }   
}