package com.example.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    //Call model step 2
    @Autowired
    private ProductRepository productRepository;

    //Step 1
    @GetMapping("/")
    public String productList(Model model) {
        List<Product> products = productRepository.findAll();
        //Step 3 controller tra cho view
        model.addAttribute("products", products);
        return "product-list";
    }
}
