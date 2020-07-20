package testcircle;

public class Circle { 
    private double radius; //������ 
    private double x; //��������� ������� 
    private double y; //��������� ������� 
    static final double pi = 3.14; 
    static int count = 0; 
 
Circle(double r1, double x1, double y1) { 
    radius = r1; 
    x = x1; 
    y = y1; 
    ++count; 
}

Circle() { 
    radius = 0.0; 
    x = 0.0; 
    y = 0.0; 
    ++count; 
} 
 
public void setX(int x1) { 
    x = x1; 
}

public void setY(int y1) { 
    y = y1; 
}

public void setRadius(int r1) { 
    radius = r1; 
}

public double getX() { 
    return x; 
} 

public double getY() { 
    return y; 
}

public double getRadius() { 
    return radius; 
}

public double area() { 
    return pi*radius*radius; 
}

} 
