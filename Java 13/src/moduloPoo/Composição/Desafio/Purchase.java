package M6OO.Composição.Desafio;

import java.util.ArrayList;

public class Purchase {

    //****one purchase can has many items****
    ArrayList<Item> items = new ArrayList<>();

    void addItem(Product product, int qnt){
        this.items.add(new Item(product, qnt));
    }

    double getTotalValue (){
        double total = 0;
        for (Item items: items){
            total += items.qntd * items.product.price;
        }
        return total;
    }

}
