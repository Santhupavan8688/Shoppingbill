package program;

import CategoryLists.ListForCategorys;
import Utils.BillPrinter;
import Utils.Messages;
import enums.Category;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Run {
    public static HashMap<String, Double> cart = new HashMap<>();
    public static Category selected;

    public static void main(String[] args) throws Exception {
        List<String> CategoryList = Arrays.asList("GROCERIES", "FRUITS", "VEGETABLES");
        System.out.println("Please Select the Category :");
        CategoryList.forEach(System.out::println);
        Scanner sc = new Scanner(System.in);
        selected = Category.valueOf(sc.next().toUpperCase());
        switch (selected) {
            case GROCERIES : {
                Messages.welcomeMessage();
                ListForCategorys.getGroceriesList().forEach(x -> System.out.println(x.getName() + "\t" + x.getPrice()));
                System.out.println("Please Select the item or type exit");
                String item = sc.next().toUpperCase();
                System.out.println("Please enter the Quantity(kgs) for "+item);
                Double quantity = sc.nextDouble();
                while (!item.equals("EXIT")) {
                    CartAdder.addSelectionsIntoCart(selected,item, quantity,cart);
                    List<? extends Serializable> result = checkForNextItem(item, quantity);
                    item= (String) result.get(0);
                    quantity= (Double) result.get(1);
                }
            }
            break;
            case FRUITS : {
                Messages.welcomeMessage();
                ListForCategorys.getFruitsList().forEach(x -> System.out.println(x.getName() + "\t" + x.getPrice()));
                System.out.println("Please Select the item or type exit");
                String item = sc.next().toUpperCase();
                System.out.println("Please enter the Quantity(kgs) for "+item);
                Double quantity = sc.nextDouble();
                while (!item.equals("EXIT")) {
                    CartAdder.addSelectionsIntoCart(selected,item, quantity,cart);
                    List<? extends Serializable> result = checkForNextItem(item, quantity);
                    item= (String) result.get(0);
                    quantity= (Double) result.get(1);
                }
            }
            break;
            case VEGETABLES : {
                Messages.welcomeMessage();
                ListForCategorys.getVegetablesList().forEach(x -> System.out.println(x.getName() + "\t" + x.getPrice()));
                System.out.println("Please Select the item or type exit");
                String item = sc.next().toUpperCase();
                System.out.println("Please enter the Quantity(kgs) for "+item);
                Double quantity = sc.nextDouble();
                while (!item.equals("EXIT")) {
                    CartAdder.addSelectionsIntoCart(selected,item, quantity,cart);
                    List<? extends Serializable> result = checkForNextItem(item, quantity);
                    item= (String) result.get(0);
                    quantity= (Double) result.get(1);
                }
            }
            break;
            default: {
                throw new Exception("Invalid Category Type");
            }
        }
    BillPrinter.printbill(cart);
    }

    public static List<? extends Serializable> checkForNextItem(String item, Double quantity){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Select the next item or type exit");
        item = sc.next().toUpperCase();
        if(!item.equals("EXIT")) {
            System.out.println("Please enter the Quantity(kgs) for " + item);
            quantity = sc.nextDouble();
        }
        return Arrays.asList(item,quantity);
    }
}

