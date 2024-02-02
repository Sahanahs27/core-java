package com.xworkz.backapp.utils;

public enum DBProperties {
    URL("jdbc:mysql://localhost:3306/playstore"),USER("root"),PASSWORD("saanu@123");
    String value;
    private DBProperties(String value){

      this.value = value;
    }
}
