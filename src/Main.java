public class Main {
    public static void main(String[] args) {
        sumanum(1, 2, 3);
    }
    // Primera parte:
    // Crear una función con tres parámetros que sean números que se suman entre sí.
    // Llamar a la función en el main y darle valores.

    public static void sumanum(int a, int b, int c) {
        int res;
        res = a + b + c;
        System.out.println("-----------");
        System.out.println("EL RESULTADO DEL 1ER APARTADO ES: ");
        System.out.println(res);
        System.out.println("-----------");


        Coche car = new Coche();
        car.MoreDoors();
        car.MoreDoors();
        car.MoreDoors();
        car.MoreDoors();
        System.out.println("EL CARRO TIENE ESTE NÚMERO DE PUERTAS: ");
        System.out.println(car.num_puertas);

    }

    //Segunda parte:
    //Crear una clase coche.
    //Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    //Una función que incremente el número de puertas que tiene el coche.
    //Crear un objeto miCoche en el main y añadirle una puerta.
    //Mostrar el número de puertas que tiene el objeto.

    static class Coche{
        public int num_puertas = 0;

        public void MoreDoors (){
            this.num_puertas++;
        }
    }





}
