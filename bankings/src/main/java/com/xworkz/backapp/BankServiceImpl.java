package com.xworkz.backapp;

import java.util.List;

public class BankServiceImpl implements BankService{
    private BankRepoImpl repo = new BankRepoImpl();
    @Override
    public boolean validateAndSave(BankDto dto) {
        if(dto != null){
            if(dto.getName()!=null && dto.getName().length()>2){
                System.out.println("bank name is valid");
                if(dto.getId()>0){
                    System.out.println("bank id is valid");
                    if(dto.getLocation()!=null && dto.getLocation().length()>4){
                        System.out.println("location is valid");
                        repo.create(dto);
                    }
                    System.out.println("location is not valid");
                }
                System.out.println("bank id is not valid");
            }
            System.out.println("bank name is not valid");
        }
        System.out.println("dto is null");
        return false;
    }

   /* @Override
    public BankDto findByName(String name) {
        if(name.length()>2 && name!= null){
            System.out.println("name is valid");
            return repo.findByName(name);
        }
        else{
            System.out.println("name is not valid");
        }
        return null;
    }*/

    @Override
    public BankDto findById(int id) {
        if (id > 0) {
            System.out.println("id is valid");
            return repo.findById(id);
          }
        System.out.println("id is not vlid");
            return null;
        }

    @Override
    public boolean updateNameById(int id, String name) {
        if(id>0){
            System.out.println("updated name");
            return repo.updateNameById(id, name);
        }
        return false;
    }

    @Override
    public boolean deleteByName(String name) {
        if (name != null){
            System.out.println("deleted name");
            return repo.deleteByName(name);
        }
        return false;
    }

    @Override
    public List<BankDto> readAll() {
        System.out.println("reading all data");
        return repo.readAll();
    }
}
