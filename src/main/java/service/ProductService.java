package service;

import dao.AbstractDao;
import domain.Product;

public class ProductService {
    private AbstractDao productDao;

    public ProductService(AbstractDao productDao) {
        this.productDao = productDao;
    }

    public void retrieveProduct(Product product){
        productDao.retrieve(product);
    }


}
