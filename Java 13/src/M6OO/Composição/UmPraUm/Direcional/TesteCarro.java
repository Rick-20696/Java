package M6OO.Composição.UmPraUm.Direcional;

//The relation don't is bidirectional!!! Only use if need
public class TesteCarro {

    //my point of input the app
    public static void main(String[] args) {
        //instancing the car
        Carro c1 = new Carro();

        //checking if is connected
        System.out.println("The motor is on? " + c1.itsOn());
        //liga
        c1.turnOn();
        System.out.println("now is on? " + c1.itsOn());

        /*i have a class that too have a class,
         *so, i can access the attributes.
         *
         * one car have a motor, one motor have one car.
         * by instance "c1" i can access "spins" of "motor"
         */
        System.out.println("The spins initial is " + c1.motor.spins());

        c1.speed();
        c1.speed();
        c1.speed();
        c1.speed();
        System.out.println("Spins after of speed " + c1.motor.spins());

        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        System.out.println("Spins after of brake " + c1.motor.spins());
        /*
         * With mechanism, the minimum is 600RPM
         * but the user can do that "c1.motor.injecao = - 30;"
         * We need of ENCAPSULATION.
         * The CLASS was protected the attributes against that
         */


    }
}
