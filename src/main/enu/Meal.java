package main.enu;

/**
 * @author ：liugeng
 * @date ：Created in 2021/4/6 14:25
 */
public enum Meal {
    DESSERT(Food.Dessert.class),
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    COFFEE(Food.Coffee.class);
    private Food [] values;
    private Meal(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }
}
