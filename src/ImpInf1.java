public class ImpInf1 implements interface1, interface2 {
    private double r;

    public ImpInf1(){
        this.r= 1.0;
    }
    public ImpInf1(double r){
        this.r = r;
    }
    @Override
    public void name(){
        System.out.println("I'm Sorawit hanumas");
    }
    public double findArea(){
        return interface1.Pi * this.r * this.r;
    }
    public void showArea(){
        System.out.println("Radius :"+this.r);
        System.out.println("Circle area : "+this.findArea());
    }
    public void address(){
        System.out.println("i'm in Newyork");
    }
    
    
}
