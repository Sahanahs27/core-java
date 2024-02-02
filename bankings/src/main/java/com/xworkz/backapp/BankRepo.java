package com.xworkz.backapp;

import java.util.List;

public interface BankRepo {
    public boolean create(BankDto dto);
    public List<BankDto> readAll();
    public BankDto findById(int id);
    //public BankDto findByName(String name);
    public boolean updateNameById(int id , String name);
    public boolean deleteByName(String name);
}
