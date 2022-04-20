package CategoryLists;

import dto.Fruits;
import dto.Groceries;
import dto.Vegetables;

import java.util.Arrays;
import java.util.List;

public class ListForCategorys {
    public static List<Fruits> getFruitsList(){
        return Arrays.asList(
                new Fruits("Apple","F_01", 180.0),
                new Fruits("Orange","F_02", 80.0),
                new Fruits("Grapes","F_03", 80.0),
                new Fruits("Mango","F_04", 100.0),
                new Fruits("Watermelon","F_05", 50.0),
                new Fruits("Strawberry","F_06", 60.0));
    }

    public static List<Groceries> getGroceriesList(){
        return Arrays.asList(new Groceries("Wheat","G_01",35.50),
                new Groceries("Rice","G_02",45.50),
                new Groceries("Oil","G_03",40.0),
                new Groceries("Biscuits","G_04",50.0),
                new Groceries("Sugar","G_05",40.0),
                new Groceries("Salt","G_06",20.0)
        );
    }

    public static List<Vegetables> getVegetablesList(){
        return Arrays.asList(new Vegetables("Tomato","V_01",50.0),
                new Vegetables("Potato","V_02",40.0),
                new Vegetables("Onion","V_03",60.0),
                new Vegetables("Beans","V_04",30.0),
                new Vegetables("Carrot","V_05",40.0),
                new Vegetables("Radish","V_06",30.0)
        );
    }
}
