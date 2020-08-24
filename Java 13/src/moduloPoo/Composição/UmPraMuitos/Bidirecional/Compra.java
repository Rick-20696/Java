package M6OO.Composição.UmPraMuitos.Bidirecional;

import java.util.ArrayList;

//one purchase can have 'n' items
public class Compra {

    String client;
    ArrayList<Item> items = new ArrayList<>();

    void addItem(Item item){
        //Now, i can add the "item" by method "addItem"
        items.add(item);
        //item of purchase receive this class how instance
        item.purchase = this;
    }

    double getAmount (){
        double amount = 0;
        for (Item aux: items)
            amount += aux.qntd * aux.price;
        return amount;
    }
}
