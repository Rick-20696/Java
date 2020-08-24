package M6OO.Composição.UmPraUm.BiDirecional;

public class Motor {

    Carro carro; //instance is null
    boolean ligado = false;
    double injecao = 1;

    Motor(Carro carro){
        //The instance null receive the parameter passed in constructor
        //I have a problem, i need pass
        this.carro = carro;
    }

    //those are methods of motor needed for app
    int spins(){
        if(!ligado)
            return 0;
        else
        //rounded to resulted be more exact
        return (int) Math.round(injecao * 3000);
    }
}
