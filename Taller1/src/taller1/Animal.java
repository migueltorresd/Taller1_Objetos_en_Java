package taller1;
/**
 * Taller 1 de clases.
 * Se representa la clase Animal con sus atributos y metodos correspondientes
 *
 * @autor Miguel Angel Torres Diaz
 */
public class Animal {
/**
 * Atributos
 */
    private String race;
    private String name;
    private int age;
/**
 * Metodo Constructor obliga a inicializar nuestros atributos
 */
    public Animal(String NewName)
    {
        name= NewName;
    }
/**
 * Metodos Getter and Setter
 * Getter: este metodo sirve para obtener el valor de ese atributo
 * Setter: este metodo sirve para acceder y o asignar un valor fuera de la clase
 */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
