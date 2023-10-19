package com.xworkz.dmartapp.product;

import com.xworkz.dmartapp.dmart.Dmart;

import java.util.Scanner;

public class ProductExecutor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the product information");
        sc.next();
        int size = sc.nextInt();
        Dmart dmart = new Dmart(size);
        for (int index = 0; index < size; index++) {
            Product product = new Product();
            System.out.println("enter the product id:");
            product.setProductId(sc.nextInt());
            System.out.println("enter the name of the product");
            product.setProductName(sc.next());
            System.out.println("enter the categary of product");
            product.setCategory(sc.next());
            System.out.println("enter the product manufactured by");
            product.setManufacturedBy(sc.next());
            System.out.println("enter the price of the product");
            product.setPrice(sc.nextInt());
            System.out.println("enter the expirary date of the product");
            product.setExpairyDate(sc.next());
            System.out.println("enter the quantity of the product");
            product.setQuantity(sc.nextInt());
            dmart.addProducts(product);
        }
        dmart.getAllProducts();

        String input = null;
        do{
            System.out.println("press 1: to get all the products");
            System.out.println("press 2: to get products by id");
            System.out.println("press 3: to get category By Name");
            System.out.println("press 4: to get product By Name");
            System.out.println("press 5: to get product name by category");

            int options = sc.nextInt();
            switch (options) {
                case 1:
                   dmart.getAllProducts();
                    break;
                case 2:
                    Product productById = dmart.getProductById(sc.nextInt());
                    System.out.println(productById.getProductId() +" "+ productById.getProductName() +" "+ productById.getManufacturedBy() +" "+ productById.getCategory() +" "+ productById.getQuantity() + " "+ productById.getExpairyDate() + " "+ productById.getPrice());

                    break;
                case 3:
                    String category = dmart.getCategoryByProductName(sc.next());
                    System.out.println(category);
                    break;

                case 4:
                    Product productByName = dmart.getProductByName(sc.next());
                    System.out.println(productByName.getProductId() +" "+productByName.getProductName() +" "+ productByName.getManufacturedBy() +" "+ productByName.getQuantity() +" "+ productByName.getCategory() + " "+ productByName.getExpairyDate() + " "+ productByName.getPrice());
                    break;

                case 5:
                    String productName = dmart.getProductNameByCategory(sc.next());
                    System.out.println("app name is fetched by the type:" +productName);
                    break;

                /*case 5:
                    String postName = policeStation.getPostNameByName(sc.next());
                    System.out.println(postName);
                    break;

                case 6:
                    String postName1 = policeStation.getPostNameById(sc.nextInt());
                    System.out.println(postName1);
                    break;*/

                default:
                    System.out.println("please check the cases");
                    break;
            }
            System.out.println("do you want to continue yes/no");
            input = sc.next();
        }
        while(input.equals("yes"));
        System.out.println("thank you for using our app");
    }

}

