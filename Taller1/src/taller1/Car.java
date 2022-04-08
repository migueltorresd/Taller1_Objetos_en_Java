package taller1;
/**
 * Taller 1 de clases.
 * Se representa la clase carro con sus atributos y metodos correspondientes
 *
 * @autor Miguel Angel Torres Diaz
 */

public class Car {

    String color;
    String brand;
    int km;

/**
 * el metodo Main es el punto de entrada o de inicio de programa ejecutable
 * @param args nos sirve para enviar valores a los atributos
 */
    public static void main(String [] args){
        Car car1 = new Car();

        car1.color ="black";
        car1.brand = "Mazda";
        car1.km = 0;

        System.out.println("The color of the car1 is: " + car1.color);
        System.out.println("The car1 brand is: " + car1.brand);
        System.out.println("The car's mileage is:  " + car1.km);

    }
}
