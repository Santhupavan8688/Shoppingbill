
package program;

import java.util.HashMap;

import CategoryLists.ListForCategorys;
import enums.Category;

public class CartAdder {
    public static HashMap<String, Double> addSelectionsIntoCart(Category selected, String item,
                                                                Double quanity, HashMap<String, Double> cart) throws Exception {
        switch (selected) {
            case GROCERIES : {
                ListForCategorys.getGroceriesList().forEach(x -> {
                    if (x.getName().toUpperCase().equals(item)) {
                        cart.put(item, x.getPrice() * quanity);
                    }
                });
            }
            break;
            case VEGETABLES :{
                ListForCategorys.getVegetablesList().forEach(x -> {
                    if (x.getName().toUpperCase().equals(item)) {
                        cart.put(item, x.getPrice() * quanity);
                    }
                });
            }
            break;
            case FRUITS: {
                ListForCategorys.getFruitsList().forEach(x -> {
                    if (x.getName().toUpperCase().equals(item)) {
                        cart.put(item, x.getPrice() * quanity);
                    }
                });
            }
            break;
            default:
                throw new Exception("Please check the item entered");
        }
        return cart;
    }

}
