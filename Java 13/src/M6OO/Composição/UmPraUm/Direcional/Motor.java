package M6OO.Composição.UmPraUm.Direcional;

public class Motor {
    boolean ligado = false;
    double injecao = 1;

    //those are methods of motor needed for app
    int spins(){
        if(!ligado)
            return 0;
        else
        //rounded to resulted be more exact
        return (int) Math.round(injecao * 3000);
    }
}
