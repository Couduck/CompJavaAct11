import javax.swing.*;

public class Circulo implements Forma
{
    //Atributos
    private double radio;
    private double perimetro;
    private double area;

    //Único setter, lo demás se calcula con otros métodos
    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Getters
    public double getRadio() {
        return radio;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    //Métodos de la interfaz Forma, varía de forma en forma
    @Override
    public void calcularArea() {
        this.area = Math.PI*Math.pow(getRadio(),2);
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro =  2*Math.PI*getRadio();
    }

    @Override
    public void ingresarDatos(char eleccion)
    {
        boolean repetir;

        do
        {
            repetir = true;

            //Se pregunta el valor del radio, si los valores proporcionados no son válidos se vuelven a pedir
            try
            {
                String radio = (String) JOptionPane.showInputDialog(null, "Ingrese el radio del circulo", "ACTIVIDAD 11 Interfaces figuras", JOptionPane.QUESTION_MESSAGE);
                this.setRadio(Double.parseDouble(radio));

                switch (eleccion)
                {
                    case 'A':
                        this.calcularArea();
                        JOptionPane.showMessageDialog(null, "Resultados de los calculos sobre el circulo:\n\nArea: " + this.getArea() + "\n\nRadio: " + this.getRadio(), "ACTIVIDAD 11 Interfaces figuras", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 'B':
                        this.calcularPerimetro();
                        JOptionPane.showMessageDialog(null, "Resultados de los calculos sobre el circulo:\n\nPerimetro: " + this.getPerimetro() + "\n\nRadio: " + this.getRadio(), "ACTIVIDAD 11 Interfaces figuras", JOptionPane.INFORMATION_MESSAGE);
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
