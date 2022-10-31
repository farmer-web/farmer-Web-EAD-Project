package com.example.farmer_web.service;

import com.example.farmer_web.model.Product;
import com.example.farmer_web.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.Date;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepo;

    public void saveProduct(MultipartFile file,String name,double price,String description){
        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        product.setDate(new Date());

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        if(fileName.contains(".."))
        {
            System.out.println("not a a valid file");
        }
        try {
            product.setPImage(Base64.getEncoder().encodeToString(file.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        productRepo.save(product);

    }

    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    public Product getProductById(int id){
        return productRepo.findById(id).orElse(null);
    }

    public String deleteProduct(int id) {
         productRepo.deleteById(id);
         return "redirect:/listProducts.html";
    }

    public Product updateProduct(Product product) {
        Product exsistingProduct = productRepo.findById(product.getId()).orElse(null);
        exsistingProduct.setName(product.getName());
        exsistingProduct.setDescription(product.getDescription());
        exsistingProduct.setPrice(product.getPrice());
        exsistingProduct.setDate(product.getDate());
         return productRepo.save(exsistingProduct);
    }

}
