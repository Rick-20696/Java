package M6OO.Composição.UmPraMuitos.Direcional;
import java.util.ArrayList;

//one purchase can have 'n' items
public class Compra {
    String client;

    //one "compra" has many "items"
    ArrayList<Item> items = new ArrayList<>();

    double getAmount (){
        double amount = 0;
        for (Item aux: items)
            amount += aux.qntd * aux.price;
        return amount;
    }
}
