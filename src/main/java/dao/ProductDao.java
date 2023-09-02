package dao;

import domain.*;

public class ProductDao extends AbstractDao {

    @Override
    public void save(Entity e) {
        System.out.println("Saving Product entity: " + e);
        db.save(e);
    }

    @Override
    public void update(Entity e) {
        System.out.println("Updating Product entity: " + e);
        db.update(e);
    }

    @Override
    public void retrieve(Product p) {
        System.out.println("Retrieving Product entity: " + p);
    }
}
