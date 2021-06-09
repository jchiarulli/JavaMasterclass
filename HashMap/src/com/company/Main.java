package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Product> productsByName = new HashMap<>();
    }
}

class Product {

    private String name;
    private String description;
    private List<String> tags;

    // standard getters/setters/constructors

    public Product addTagsOfOtherProdcut(Product product) {
        this.tags.addAll(product.getTags());
        return this;
    }
}
