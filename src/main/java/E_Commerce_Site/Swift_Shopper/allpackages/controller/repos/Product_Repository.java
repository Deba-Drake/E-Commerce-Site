package E_Commerce_Site.Swift_Shopper.allpackages.controller.repos;

import E_Commerce_Site.Swift_Shopper.allpackages.controller.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Product_Repository extends JpaRepository<Product,Integer>
{}