package M6OO.Composição.UmPraUm.BiDirecional;
    //one car have one motor
public class Carro {
    //The motor need be null to no have problems
    Motor motor;

    Carro(){
        //The class 'Carro' will passed how parameter in "new Motor (this);"
        this.motor = new Motor(this);
    }

    //i can brake/speed to the infinity. This don't exist!
    //so, let's make mechanism of defense to method
    void brake (){
        //I limited the brake to 600RPM
        if (motor.injecao > 0.5)
            motor.injecao -= 0.4;
    }
    void speed (){
        //I limited the velocity to 9300RPM
        if (motor.injecao < 2.8)
            motor.injecao += 0.4;
    }

    void turnOn (){
        motor.ligado = true;
    }

    void turnOff(){
        motor.ligado = false;
    }

    boolean itsOn(){
        return motor.ligado;
    }
}
