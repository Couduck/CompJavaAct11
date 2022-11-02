import javax.swing.*;

public class Cuadrado implements Forma
{
    //Atributos
    private double lado;
    private double perimetro;
    private double area;

    //Único setter
    public void setLado(double lado) {
        this.lado = lado;
    }

    //Getters
    public double getLado()
    {
        return lado;
    }

    public double getPerimetro()
    {
        return perimetro;
    }

    public double getArea()
    {
        return area;
    }

    //Metodos de la interfaz implementada
    @Override
    public void calcularArea()
    {
        this.area = Math.pow(getLado(),2);
    }

    @Override
    public void calcularPerimetro()
    {
        this.perimetro = 4 * getLado();
    }

    @Override
    public void ingresarDatos(char eleccion)
    {
        boolean repetir;

        do
        {
            repetir = true;

            try
            {
                //Se ingresa el valor del lado para poder realizar los cálculos del cuadrado

                String lado = (String) JOptionPane.showInputDialog(null, "Ingrese el lado del cuadrado", "ACTIVIDAD 11 Interfaces figuras", JOptionPane.QUESTION_MESSAGE);
                this.setLado(Double.parseDouble(lado));

                switch (eleccion)
                {
                    case 'A':
                        this.calcularArea();
                        JOptionPane.showMessageDialog(null, "Resultados de los calculos sobre el cuadrado:\n\nArea: " + this.getArea() + "\n\nLado: " + this.getLado(), "ACTIVIDAD 11 Interfaces figuras", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 'B':
                        this.calcularPerimetro();
                        JOptionPane.showMessageDialog(null, "Resultados de los calculos sobre el cuadrado:\n\nPerimetro: " + this.getPerimetro() + "\n\nLado: " + this.getLado(), "ACTIVIDAD 11 Interfaces figuras", JOptionPane.INFORMATION_MESSAGE);
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
