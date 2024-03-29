package pipes;

/**
 *
 * @author up826133
 */
public class Pipe {
    protected double length;
    protected double diameter;
    protected int grade;
    protected String innerInsulation;
    protected String outerReinforcement;   //Outer Metallic Reinforcement
    protected String chemicalRes;   //Chemical Resistance
    protected int colourCount;
    protected final double[] costByGrade;       //Cost of 1 cubic inch of plastic by grade
    protected int quantity;

    public Pipe() {
        costByGrade = new double[5];

        costByGrade[0] = 0.4;
        costByGrade[1] = 0.6;
        costByGrade[2] = 0.75;
        costByGrade[3] = 0.8;
        costByGrade[4] = 0.95;
    }

    public Pipe(double _length, double _diameter, int _grade, int _colourCount, String _innerInsulation, String _outerReinforcement, String _chemicalRes, int _quantity) {
        costByGrade = new double[5];
        
        length = _length;
        grade = _grade;
        innerInsulation = _innerInsulation;
        outerReinforcement = _outerReinforcement;
        chemicalRes = _chemicalRes;
        colourCount = _colourCount;
        quantity = _quantity;

        costByGrade[0] = 0.4;
        costByGrade[1] = 0.6;
        costByGrade[2] = 0.75;
        costByGrade[3] = 0.8;
        costByGrade[4] = 0.95;
    }
    
    protected int getGrade(){
        return grade;
    }
    
    protected void changeGrade(int _grade){
        grade = _grade;
    }
    

    public double getCostByGrade() {
        return costByGrade[this.grade - 1];

    }


    
    protected int getColourCount(){
        return colourCount;
    }
    
    public void getPrice(double d){
        double finalPrice;
        //costByGrade[grade - 1] * inches;
         
       
    }
    
}   