package testparalilogramo;

public class TestParalilogramo {

    public static void main(String[] args) {
        OrthParal paral1 = new OrthParal(10,20);
        OrthParal paral2 = new OrthParal(40,70);
        
        System.out.printf("Paral1: Platos= %.1f Ipsos=%.1f Embado= %.1f\n", paral1.getPlatos(), paral1.getIpsos(), paral1.area());
        System.out.printf("Paral2: Platos= %.1f Ipsos=%.1f Embado= %.1f\n", paral2.getPlatos(), paral2.getIpsos(), paral2.area());
    }
    
}
