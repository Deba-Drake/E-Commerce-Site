package E_Commerce_Site.Swift_Shopper.allpackages.controller;

import E_Commerce_Site.Swift_Shopper.allpackages.controller.service.Product_Middleware;
import E_Commerce_Site.Swift_Shopper.allpackages.controller.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Product_Controller
{
    @Autowired
    Product_Middleware productMiddleware;

    @RequestMapping("/product")
    public Product returnproduct()
    {
        System.out.println("product controller called");
        return productMiddleware.getproduct();
    }
}