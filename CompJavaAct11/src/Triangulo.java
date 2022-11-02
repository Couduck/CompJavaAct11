import javax.swing.*;

public class Triangulo implements Forma
{
    //Atributos
    private double base, lado2, lado3, altura;
    private double perimetro;
    private double area;

    //setters
    public void setBase(double base)
    {
        this.base = base;
    }

    public void setLado2(double lado2)
    {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3)
    {
        this.lado3 = lado3;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    //Getters
    public double getAltura() {
        return altura;
    }

    public double getBase()
    {
        return this.base;
    }


    //Getters
    public double getLado2()
    {
        return this.lado2;
    }

    public double getLado3()
    {
        return this.lado3;
    }

    public double getPerimetro()
    {
        return perimetro;
    }

    public double getArea()
    {
        return area;
    }


    //Métodos de la interfaz
    @Override
    public void calcularArea()
    {
        this.area = base*altura/2;
    }

    @Override
    public void calcularPerimetro()
    {
        this.perimetro = base + lado2 + lado3;
    }

    @Override
    public void ingresarDatos(char eleccion)
    {
        boolean repetir, baseCorrecta = false, lado2Correcto = false, lado3Correcto = false, alturaCorrecta = false;

        do
        {
            repetir = true;

            try
            {

                //Se piden los valores de los atributos del triangulo, si ocurre algun error en la captura de alguno de ellos, cada vez que ocurra, se cvolverá a pedir el atributo que no se capturó, no todos los atributos desde el principio
                if (!baseCorrecta)
                {
                    String base = (String) JOptionPane.showInputDialog(null, "Ingrese la base del triangulo", "ACTIVIDAD 11 Interfaces figuras", JOptionPane.QUESTION_MESSAGE);
                    this.setBase(Double.parseDouble(base));
                    baseCorrecta = true;
                }

                if (!lado2Correcto)
                {
                    String lado2 = (String) JOptionPane.showInputDialog(null, "Ingrese el segundo lado del triangulo", "ACTIVIDAD 11 Interfaces figuras", JOptionPane.QUESTION_MESSAGE);
                    this.setLado2(Double.parseDouble(lado2));
                    lado2Correcto = true;
                }

                if (!lado3Correcto)
                {
                    String lado3 = (String) JOptionPane.showInputDialog(null, "Ingrese el tercer lado del triangulo", "ACTIVIDAD 11 Interfaces figuras", JOptionPane.QUESTION_MESSAGE);
                    this.setLado3(Double.parseDouble(lado3));
                    lado3Correcto = true;
                }

                if (!alturaCorrecta)
                {
                    String altura = (String) JOptionPane.showInputDialog(null, "Ingrese la altura del triangulo", "ACTIVIDAD 11 Interfaces figuras", JOptionPane.QUESTION_MESSAGE);
                    this.setAltura(Double.parseDouble(altura));
                    alturaCorrecta = true;
                }

                switch (eleccion)
                {
                    case 'A':
                        this.calcularArea();
                        JOptionPane.showMessageDialog(null, "Resultados de los calculos sobre el triangulo:\n\nArea: " + this.getArea() + "\n\nBase: " + this.getBase() + "\nLado 2: " + this.getLado2() + "\nLado 3: " + this.getLado3() + "\nAltura: " + this.getAltura(), "ACTIVIDAD 11 Interfaces figuras", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 'B':
                        this.calcularPerimetro();
                        JOptionPane.showMessageDialog(null, "Resultados de los calculos sobre el cuadrado:\n\nPerimetro: " + this.getPerimetro() + "\n\nBase: " + this.getBase() + "\nLado 2: " + this.getLado2() + "\nLado 3: " + this.getLado3() + "\nAltura: " + this.getAltura(), "ACTIVIDAD 11 Interfaces figuras", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            }

            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "El valor ingresado no es valido, intente con un valor numerico de nuevo", "ACTIVIDAD 11 Interfaces figuras", JOptionPane.ERROR_MESSAGE);
                repetir = false;
            }
        }
        while(!repetir);
    }
}
