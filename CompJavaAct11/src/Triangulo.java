public class Triangulo implements Shape
{
    private double base, lado2, lado3, altura;
    private double perimetro;
    private double area;

    public Triangulo(double base, double lado2, double lado3, double altura)
    {
        this.base = base;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public double getLado2() {
        return this.lado2;
    }

    public double getLado3() {
        return this.lado3;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    @Override
    public double calcularArea() {
        return base*altura/2;
    }

    @Override
    public double calcularPerimetro() {
        return base + lado2 + lado3;
    }
}
