package M6OO.Composição.UmPraMuitos.Bidirecional;

public class CompraTeste {

    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.client = "Aline";
        /* how i have access direct to the list,
         * i can add a new item by here
         */
        c1.items.add(new Item("nootbook", 1, 1800.25));
        //now, i can make this
        c1.addItem(new Item("cell", 1, 1099.99));

        System.out.println("How many items i have in the purchase? " + c1.items.size());
        System.out.println("What total value? " + c1.getAmount());
    }
}
