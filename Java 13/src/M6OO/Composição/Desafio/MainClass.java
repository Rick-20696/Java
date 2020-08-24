package M6OO.Composição.Desafio;

public class MainClass {
    public static void main(String[] args) {
//
//        Product p1 = new Product("Cell", 799.99);
//        Item i1 = new Item(2);
//        Purchase pu1 = new Purchase();
//        Client c1 = new Client("Teixeira");
//
//        c1.addPurchase(pu1, i1, p1);

        Product p1 = new Product("cell", 799.99);
        Product p2 = new Product("TV", 999.90);
        Product p3 = new Product("PC", 589.97);

        Client c1 = new Client("Aline");

        Purchase pu1 = new Purchase();

        Purchase pu2 = new Purchase();
        Purchase pu3 = new Purchase();

        c1.purchases.add(pu1);
        c1.purchases.add(pu3);
        c1.purchases.add(pu2);

        pu1.addItem(p1, 1);
        pu2.addItem(p2, 2);
        pu3.addItem(p3, 3);

        System.out.println("Purchase 1 " + pu1.getTotalValue());
        System.out.println("Purchase 2 " + pu2.getTotalValue());
        System.out.println("Purchase 3 " + pu3.getTotalValue());

        System.out.println();

        System.out.println("total purchase " + c1.getTotalPurc());
    }
}
