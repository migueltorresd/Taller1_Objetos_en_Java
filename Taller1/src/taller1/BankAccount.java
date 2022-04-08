package taller1;
/**
 * Taller 1 de clases.
 * Se representa la clase Cuenta bancaria con sus atributos y metodos correspondientes
 *
 * @autor Miguel Angel Torres Diaz
 */

public class BankAccount {
/**
 * Atributos
 */
    private int accountNumber;
    protected boolean activated;

/**
 * Metodos Getter and Setter
 * Getter: este metodo sirve para obtener el valor de ese atributo
 * Setter: este metodo sirve para acceder y o asignar un valor fuera de la clase
 */

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public boolean isActivated() {
        return activated;
    }
}
