package dao;

import db.*;
import domain.*;

public abstract class AbstractDao {
    protected DBConnection db;

    public AbstractDao() {
        ConnectionFactory factory = new ConnectionFactory();
        db = factory.getConnection();
    }

    public abstract void save(Entity e);

    public abstract void update(Entity e);

    public abstract void retrieve(Product product);
}
