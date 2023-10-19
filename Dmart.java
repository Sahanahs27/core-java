package com.xworkz.dmartapp.dmart;

import com.xworkz.dmartapp.product.Product;

import java.util.Arrays;

public class Dmart {
      Product products[];
      int position;

      public Dmart(int size){

            products = new Product[size];
      }

      public boolean addProducts(Product products) {
            boolean isAdded = false;
            if (products != null) {
                  this.products[position] = products;
                  position++;
                  isAdded = true;
            }
            return isAdded;
      }

      public void getAllProducts() {
            System.out.println("The list of products details are:");

            for (int i = 0; i < position; i++) {
                  System.out.println(
                          products[i].getProductId() + " " +
                          products[i].getProductName() + " " +
                          products[i].getManufacturedBy() + " " +
                          products[i].getPrice() + " " +
                          products[i].getQuantity() + " " +
                          products[i].getCategory() + " " +
                          products[i].getExpairyDate());
            }

      }
      public Product getProductById(int productId){
            Product product = null;
            for(int appIndex = 0; appIndex <this.products.length; appIndex++){
                  if(products[appIndex].getProductId()== productId){
                        product = products[appIndex];
                        System.out.println("application found..");
                  }
            }
            return product;
      }
      public String getCategoryByProductName(String productName){
            String category = null;
            System.out.println("invoking the method getCategoryByProductName");
            for (int productIndex = 0; productIndex < this.products.length; productIndex++) {
                  if ( products[productIndex].getProductName() == productName){
                        category = products[productIndex].getCategory();
                        System.out.println("Application found.... please collect it in executor");
                  }
            }
            return category;
      }

      public Product getProductByName(String productName) {
            Product product = null;
            System.out.println("invoking the method getProductByName");
            for (int appIndex = 0; appIndex < this.products.length; appIndex++) {
                  if (products[appIndex].getProductName()== productName) {
                        product = products[appIndex];
                        System.out.println("Application found.. please collect it executor");
                  }
            }
            return product;
      }

      public String getProductNameByCategory(String category){

            String productName = null;
            System.out.println("invoking the method getProductNameByCategory");
            for(int i = 0; i <this.products.length; i++){
                  if(products[i].getCategory()== category){
                        productName = products[i].getProductName();
                  }
            }
            return productName;
      }


      public boolean updateProductPriceByProductName(int updatePrice, String existingProductName){

            boolean isPriceUpdated = false;
            System.out.println("invoking the method get updateProductPriceByProductName");
            for(int i = 0; i <this.products.length; i++){
                  if(products[i].getProductName()== existingProductName){
                        products[i].setPrice(updatePrice);
                        isPriceUpdated = true;
                        System.out.println("application found..");
                  }
            }
            return isPriceUpdated;
      }
      public void deleteProductByProductName(String productName){
            System.out.println("invoking");
            int index, newIndex;
            for (index=0, newIndex = 0; index<this.products.length; index++){
                  if(products[index].getProductName() != productName){
                        products[index++] = products[index];
                        System.out.println("given data");
                  }
                  else{
                        System.out.println("Data has been delete is "+products[index].getProductName());
                  }

            }
            products = Arrays.copyOf(products, newIndex);
            getAllNewProduct(products);
      }

      public void getAllNewProduct(Product[] products){
            for(int i = 0; i < products.length; i++ ) {
                  System.out.println(products[i].getProductId() +" "+ products[i].getProductName() +" "+ products[i].getQuantity() +" "+ products[i].getManufacturedBy() +" "+ products[i].getCategory() +" "+ products[i].getExpairyDate() +" "+ products[i].getPrice());
            }
      }
}
