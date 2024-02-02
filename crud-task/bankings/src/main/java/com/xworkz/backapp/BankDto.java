package com.xworkz.backapp;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BankDto {
       int id;
       String name;
       String location;
       int contactNumber;
       String BankType;
       String email;
}
