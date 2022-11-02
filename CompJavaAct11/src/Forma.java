public interface Forma  //Interfaz solicitada por la tarea
{
    void calcularPerimetro();   //Calcula el perímetro de la figura en cuestión

    void calcularArea();    //Calcula el área de la figura en cuestión

    void ingresarDatos(char eleccion);  //Es el proceso desde el cual se pueden ingresar los datos necesarios para realizar los cálculos por figura
}
