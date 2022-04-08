package taller1;
/**
 * Taller 1 de clases.
 * Se representa la clase persona con sus atributos y metodos correspondientes
 *
 * @autor Miguel Angel Torres Diaz
 */

import java.util.Date;

public class Person {
/**
 * Atributos
 */
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
/**
 * Metodo Constructor obliga a inicializar nuestros atributos en este caso inicializa nuestro atributo name
 */

    public Person(String name) {
        this.name = name;
    }
/**
 * Metodos Getter and Setter
 * Getter: este metodo sirve para obtener el valor de ese atributo
 * Setter: este metodo sirve para acceder y o asignar un valor fuera de la clase
 */

/**
 *
 * @return nos retorna el valor de name
 */
    public String getName() {
        return name;
    }

/**
 *
 * @param name le podemos almacenar la variable que queramos en name siempre y cuando sea un String
 */
    public void setName(String name) {
        this.name = name;
    }
}