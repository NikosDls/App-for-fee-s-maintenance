package testparalilogramo;

public class OrthParal {
    private double platos; 
    private double ipsos;
    
    OrthParal(double platos, double ipsos) {
        this.platos = platos;
        this.ipsos = ipsos;
    }
    
    public void setPlatos(double platos) {
        this.platos = platos;
    }
    
    public void setIpsos(double ipsos) {
        this.ipsos = ipsos;
    }
    
    public double getPlatos() {
        return platos;
    }
    
    public double getIpsos() {
        return ipsos;
    }
    
    public double area() {
        return platos * ipsos;
    }
}
