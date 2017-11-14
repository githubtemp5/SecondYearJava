package lab6;

/**
 *
 * @author UP826133
 */
public class Triangle {

    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Triangle() {

    }

    public Triangle(double _sideA, double _sideB, double _sideC) {
        sideA = _sideA;
        sideB = _sideB;
        sideC = _sideC;
    }

    public double getArea() {
        double p = (sideA + sideB + sideC) / 2;   //Heron's formula
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));

        return area;
    }

    public double getPerimetre() {
        return sideA + sideB + sideC;
    }
    
    public void printInfo(){
        System.out.println(getArea());
        System.out.println(getPerimetre());
    }
}

class RightAngledTriangle extends Triangle {

    public RightAngledTriangle(double _sideA, double _sideB) {
        super();
        sideA = _sideA;
        sideB = _sideB;
        sideC = getSideC(_sideA, _sideB);
    }

    private double getSideC(double _sideA, double _sideB) {
        double _sideC;
        _sideC = Math.sqrt(Math.pow(_sideA, 2) + Math.pow(_sideB, 2));
        return _sideC;
    }

    @Override
    public double getArea() {
        double area;
        area = (sideA * sideB) / 2;
        return area;
    }
}

class EquiTriangle extends Triangle {

    public EquiTriangle(double _sideA) {
        super(_sideA, _sideA, _sideA);
    }

    @Override
    public double getArea() {
        double area;
        area = (sideA * sideA) * Math.sqrt(3) / 4;
        return area;
    }

}
