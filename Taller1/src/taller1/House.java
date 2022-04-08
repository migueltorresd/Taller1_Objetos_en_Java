package taller1;
/**
 * Taller 1 de clases.
 * Se representa la clase Casa con sus atributos y metodos correspondientes
 *
 * @autor Miguel Angel Torres Diaz
 */

public class House {
/**
 * Atributos
 */
    public String door;
    public int window;
    private int bathroom;
    protected String room;

/**
 * Metodo Constructor obliga a inicializar nuestros atributos
 */
    House(String color_door, int number_of_window, int number_of_bathroom, String color_room ){
        
        door = color_door;
        window = number_of_window;
        bathroom = number_of_bathroom;
        room = color_room;
    }

/**
 * el metodo Main es el punto de entrada o de inicio de programa ejecutable
 * @param args nos sirve para enviar valores a los atributos
 */
    public static void main (String[] args) {
        House house1;

        house1 = new House ("black", 4, 2,"white");
    }
}
