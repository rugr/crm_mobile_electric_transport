package com.vntu.pipz.crm_mobile_electric_transport.service.user;

import com.vntu.pipz.crm_mobile_electric_transport.entity.Product;
import com.vntu.pipz.crm_mobile_electric_transport.entity.User;
import com.vntu.pipz.crm_mobile_electric_transport.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> allProduct() {
        return productRepository.findAll();
    }

    public Product findProductById(Long productId) {
        Optional<Product> productFromDb = productRepository.findById(productId);
        return productFromDb.orElse(new Product());
    }

    public boolean saveProduct(Product product) {
        Product productFromDB = productRepository.findOneByTitle(product.getTitle());

        if (productFromDB != null) {
            return false;
        }

        productRepository.save(product);
        return true;
    }

    public boolean updateProduct(Product product) {
        if (product.getId() == null) {
            return false;
        }
        Optional<Product> productFromDB = productRepository.findById(product.getId());
        if (!productFromDB.isPresent()) {
            return false;
        }
        productRepository.saveAndFlush(product);
        return true;
    }
}
