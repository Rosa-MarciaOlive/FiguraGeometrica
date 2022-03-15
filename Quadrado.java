public class Quadrado implements FiguraGeometrica{//interface com  implements

    private double lado;

    public void setLado(double lado){
        this.lado=lado;
    }public double getLado(){
        return this.lado;
        }

    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return "Quadrado";
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return this.lado * this.lado;
        //return lado*lado;
    }

    @Override
    public double getPerimetro() {
        // TODO Auto-generated method stub
        return this.lado*4;
        //return lado+lado+lado+lado;
    }
    
    
    
}
