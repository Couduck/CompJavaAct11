public class Circulo implements Shape
{
    private double radio;
    private double perimetro;
    private double area;

    public Circulo(double radio)
    {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    @Override
    public double calcularArea() {
        return 2*Math.PI*getRadio();
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI*Math.pow(getRadio(),2);
    }
}
