package lt.itmokymai.spring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductList {

    private final List<Product> products;

    public ProductList(){
        products = Collections.synchronizedList(new ArrayList<>());
    }


}
