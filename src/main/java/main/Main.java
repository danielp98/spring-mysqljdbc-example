package main;

import config.Config;
import models.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.ProductRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
            ProductRepository productRepository = context.getBean(ProductRepository.class);

//            Product p = new Product();
//            p.setName("newProduct");
//            p.setPrice(2.10);
//
//            productRepository.addProduct(p);

            List<Product> products;
            products = productRepository.getProducts();

            products.forEach(product -> System.out.println(product)); 

        }
    }
}
