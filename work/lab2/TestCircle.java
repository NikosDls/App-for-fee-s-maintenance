package testcircle;

public class TestCircle {

    public static void main(String[] args) {
    //����� ��� static ���������� ��� ��������� ���� ������� ��� ����� ������������ 
        System.out.println("Number of Objects= " + Circle.count); 
 
    // ���������� 1�� ������������ 
        Circle troxos1 = new Circle(10,5,5); 
 
    //�������� ��� ����� ��� �, �� ������������� ������� ��� ��� �� y ��� ��� �� ������� 
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