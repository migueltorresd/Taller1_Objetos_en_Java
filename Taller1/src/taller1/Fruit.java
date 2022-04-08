package taller1;
/**
 * Taller 1 de clases.
 * Se representa la clase fruta con sus atributos y metodos correspondientes
 *
 * @autor Miguel Angel Torres Diaz
 */
import java.util.ArrayList;

public class Fruit {

    public String name;
    private float averageWeight;
    public ArrayList<String> colors;


/**
 * Metodos Getter and Setter
 * Getter: este metodo sirve para obtener el valor de ese atributo
 * Setter: este metodo sirve para acceder y o asignar un valor fuera de la clase
 */

/**
 *
 * @param name le podemos almacenar la variable que queramos en name siempre y cuando sea un String
 */
    public void setName(java.lang.String name) {
        this.name = name;
    }

/**
 *
 * @return nos retorna lo que hay dentro de color
 */
    public ArrayList<String> getColors() {
        return colors;
    }
}
