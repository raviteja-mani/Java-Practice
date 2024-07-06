package Interface;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    int price;
    int speed;
    int compare(Car c){
        return this.price-c.price;
    }


    @Override
    public int compareTo(Car o) {
        return 0;
    }
}
