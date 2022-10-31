package com.example.farmer_web.controller;

import com.example.farmer_web.model.Product;
import com.example.farmer_web.repository.ProductRepository;
import com.example.farmer_web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin
public class ProductController {
    private ProductRepository productRepo;

    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public String addProduct(@RequestParam("file") MultipartFile file,
                              @RequestParam("pname") String name,
                              @RequestParam("price") double price,
                              @RequestParam("desc") String desc) {
        productService.saveProduct(file,name,price,desc);
        return "redirect:/listProducts.html";
    }

//    @PostMapping("/addUsers")
//    public List<Product> addUsers(@RequestBody List<Product> users) {
//        return productService.saveUsers(users);
//    }

    @GetMapping("/product/{id}")
     public Product findProduct(@PathVariable int id){
        return productService.getProductById(id);
    }
    @GetMapping("/productList")
    public List<Product> findAllProducts() {

        return productService.getAllProduct();
    }

   @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
       return productService.updateProduct(product);
   }

    @DeleteMapping("/delete/{id}")
   public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);

    }


}
