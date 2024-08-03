package E_Commerce_Site.Swift_Shopper.allpackages.controller.service;

import E_Commerce_Site.Swift_Shopper.allpackages.controller.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import E_Commerce_Site.Swift_Shopper.allpackages.controller.repos.Product_Repository;

@Service
public class Product_Middleware {

    @Autowired
    private Product_Repository productRepository;

    public Product getproduct()
    {
        System.out.println("product middleware called");
        return new Product(1,"PEN",10,"INR",500, false,true);
    }
}