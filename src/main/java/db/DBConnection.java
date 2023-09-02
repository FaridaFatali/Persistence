package db;

import domain.*;

public class DBConnection {
    public void save(Object o) {
        System.out.println("Saving object: " + o);
    }

    public void update(Object o) {
        System.out.println("Updating object: " + o);
    }

    public void retrieve(Object o){
        System.out.println("The product is: " + o);
    }

    public Entity load(Class c, int id) {
        System.out.println("Retrieving object by id: " + id);

        Entity e;
        if (c.getName().equalsIgnoreCase("main.java.org.example.domain.Product")) {
            e = new Product(id, "11111", "A pen.", 2.19, 0.01);
        } else {
            e = new Employee(id, "Ali", 4, "Product", "xxx");
        }
        return e;
    }
}
