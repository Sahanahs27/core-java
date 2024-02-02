package com.xworkz.backapp;

import java.util.List;

public class BankRunner {
    public static void main(String args[]){
        BankService service = new BankServiceImpl();
        //BankDto dto = new BankDto(3,"canara","banglore",7896572,"private","canara12@gnil.com");
       //boolean result = service.validateAndSave(dto);
        //System.out.println(result);
      //  BankDto id = service.findById(2);
       // System.out.println(id);
       // boolean updatedName = service.updateNameById( 3,"unionBank");
       // System.out.println(updatedName);
       // boolean deletedName = service.deleteByName("axis");
       // System.out.println(deletedName);
        service.readAll();
    }
}
