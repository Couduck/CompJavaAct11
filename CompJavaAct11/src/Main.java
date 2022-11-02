import javax.swing.*;

public class Main {
    public static void main(String[] args)  //Metodo Main
    {
        showMenu();
    }

    public static void showMenu()     //Permite poder implementar el JOptionPane al método main
    {
        //Menu de opciones de que calcular: Perimetro o area
        String[] Area_O_Perimetro = {
                "A) Area",
                "B) Perimetro",};

        //Menu de opciones de que formas se pueden calcular
        String[] FormasOpciones =
                {
                        "A) Circulo",
                        "B) Cuadrado",
                        "C) Triangulo"
                };

        String eleccionCompleta;        //Captura el valor de la string elegida completa
        int salirProceso;               //La opcion que guarda el int que dicta si salir del programa o no
        boolean accionValida = false;   //Boolean que permite que las opciones puedan repetirse indefinidamente hasta que el usuario desee salir del programa

        do
        {
            accionValida = true;

            //Almacena las opciones elegidas por el usuario, tanto para el atributo que desea calcular como la forma que desea usar
            char[] eleccionSwit = new char[2];

            try
            {
                //Panel que despliega el atributo a calcular
                eleccionCompleta = (String) JOptionPane.showInputDialog(null,"Seleccione lo que desea calcular", "ACTIVIDAD 11 Interfaces figuras", JOptionPane.QUESTION_MESSAGE, null, Area_O_Perimetro, Area_O_Perimetro[0]);
                eleccionSwit[0] = eleccionCompleta.charAt(0);

                //Panel que despliega la figura a utilizar
                eleccionCompleta = (String) JOptionPane.showInputDialog(null,"Seleccione la figura sobre la cual calcular", "ACTIVIDAD 11 Interfaces figuras", JOptionPane.QUESTION_MESSAGE, null, FormasOpciones, FormasOpciones[0]);
                eleccionSwit[1] = eleccionCompleta.charAt(0);

                switch(eleccionSwit[1]) //Dependiendo de la figura elegida, se ejecuta la acción especifica
                {
                    case 'A':
                        Circulo circulo = new Circulo();
                        circulo.ingresarDatos(eleccionSwit[0]);
                        break;

                    case 'B':
                        Cuadrado cuadrado = new Cuadrado();
                        cuadrado.ingresarDatos(eleccionSwit[0]);
                        break;

                    case 'C':
                        Triangulo triangulo = new Triangulo();
                        triangulo.ingresarDatos(eleccionSwit[0]);
                        break;
                }

                //Se pregunta si desea realizar el calculo/area de otra figura o de la misma
                int  repetir = JOptionPane.showConfirmDialog(null,"Quiere repetir con otra figura y/o datos?", "ACTIVIDAD 11 Interfaces figuras", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                //Si presiona Si
                if(repetir == JOptionPane.YES_OPTION)
                {
                    accionValida = false;
                }

                //Si presiona no, se sale del progrma
                else
                {
                    JOptionPane.showMessageDialog(null,"Programa terminado", "ACTIVIDAD 11 Interfaces figuras", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            catch(NullPointerException a) //El usuario seleccionó la opcion de cerrar el mensaje o de cancelar
            {
                //Se pregunta si el usuario desea salir del programa usando unicamente la opcion de si o no
                salirProceso = JOptionPane.showConfirmDialog(null,"Quieres salir del programa?", "ACTIVIDAD 11 Interfaces figuras", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                //Si presiona Si
                if(salirProceso == JOptionPane.YES_OPTION)
                {
                    JOptionPane.showMessageDialog(null,"Programa terminado", "ACTIVIDAD 11 Interfaces figuras", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }

                //Si presiona No
                else
                {
                    accionValida = false;
                }
            }

            catch(IndexOutOfBoundsException b) //El usuario no ingresó nada y dió aceptar de todas formas
            {
                JOptionPane.showMessageDialog(null,"Comando no reconocido, vuelva a intentarlo", "ACTIVIDAD 11 Interfaces figuras", JOptionPane.ERROR_MESSAGE);
                accionValida = false;
            }
        }
        while(!accionValida);
    }
}