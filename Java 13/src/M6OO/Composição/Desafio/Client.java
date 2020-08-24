package M6OO.Composição.Desafio;

import java.util.ArrayList;

public class Client {
    String name;

    Client (String name){
        this.name = name;
    }
    //****one client can has many purchases****
    ArrayList<Purchase> purchases = new ArrayList<>();

    double getTotalPurc(){
        double total = 0;

        for (Purchase purchase: purchases){
            total += purchase.getTotalValue();
        }

        return total;
    }

}
