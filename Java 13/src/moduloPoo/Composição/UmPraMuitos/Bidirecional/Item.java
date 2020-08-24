package M6OO.Composição.UmPraMuitos.Bidirecional;

public class Item {
    String name;
    int qntd;
    double price;

    //now, one "Item" have one "Compra"
    Compra purchase;

    //creating a constructor to facilitate
    Item (String name, int qntd, double price){
        this.name = name;
        this.qntd = qntd;
        this.price = price;
    }
}
