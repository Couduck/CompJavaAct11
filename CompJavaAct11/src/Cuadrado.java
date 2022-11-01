public class Cuadrado implements Shape
{
    private double lado;
    private double perimetro;
    private double area;

    public Cuadrado(double lado)
    {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    @Override
    public double calcularArea() {
        return Math.pow(getLado(),2);
    }

    @Override
    public double calcularPerimetro() {
        return 4 * getLado();
    }

}
