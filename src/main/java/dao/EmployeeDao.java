package dao;

import domain.*;

public class EmployeeDao extends AbstractDao {

    @Override
    public void save(Entity e) {
        db.save(e);
    }

    @Override
    public void update(Entity e) {
        db.update(e);
    }

    @Override
    public void retrieve(Product product) {

    }
}
