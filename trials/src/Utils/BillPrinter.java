package Utils;

import java.util.HashMap;
import java.util.Map;

public class BillPrinter {

    public static void printbill(HashMap<String, Double> cart) {
        System.out.println("******************");
        System.out.println("|Items\t| Price |");
        for (Map.Entry<String, Double> set :cart.entrySet()) {
            System.out.println(set.getKey() + "\t" + set.getValue());
        }
        System.out.println("******************");
        System.out.println("Total\t"+cart.values().stream().reduce(0.0, Double::sum));
        System.out.println("******************");
    }
}
