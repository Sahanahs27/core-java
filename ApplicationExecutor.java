package com.xworkz.playstoreapp.hub;

import com.xworkz.playstoreapp.application.Application;
import com.xworkz.playstoreapp.hub.SoftwareHub;

import java.util.Scanner;

public class ApplicationExecutor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the application information");
        sc.next();
        int size = sc.nextInt();
        SoftwareHub softwareHub = new SoftwareHub(5);
        for(int index=0; index<size; index++) {
            Application app = new Application();
            System.out.println("enter the app id");
            app.setAppId(sc.nextInt());
            System.out.println("enter the app name");
            app.setAppName(sc.next());
            System.out.println("enter the app version");
            app.setAppVersion(sc.next());
            System.out.println("enter the release date");
            app.setReleaseDate(sc.next());
            System.out.println("enter the company name");
            app.setCompanyName(sc.next());
            System.out.println("enter the app type");
            app.setAppType(sc.next());

            softwareHub.addApplications(app);
        }
        String input = null;

        do{
            System.out.println("press 1 : to get all applications");
            System.out.println("press 2 : to get  get ApplicationByName");
            System.out.println("press 3 : to  get ApplicationByType");
            System.out.println("press 4 : to  get ApplicationById");
            System.out.println("press 5 : to get getApplication NameByType");
            System.out.println("press 6 : to get Application CompanyNameByName");

            int options = sc.nextInt();

            switch(options){

                case 1:
                    System.out.println("enter getApplicationByName");
                    Application appByName = softwareHub.getApplicationByName(sc.next());
                    System.out.println(appByName);
                    break;

                case 2:
                    System.out.println("enter getApplicationByType");
                    Application appByType = softwareHub.getApplicationByType(sc.next());
                    System.out.println(appByType);
                    break;

                case 3:
                    System.out.println("enter  getApplicationById");
                    Application appById = softwareHub.getApplicationById(sc.nextInt());
                    System.out.println(appById);
                    break;

                case 4:
                    System.out.println("enter getApplicationNameByType");
                    String appName = softwareHub.getApplicationNameByType(sc.next());
                    System.out.println(appName);
                    break;

                case 5:
                    System.out.println("enter getApplicationTypeByName");
                    String appType = softwareHub.getApplicationTypeByName(sc.next());
                    System.out.println(appType);
                    break;

                case 6:
                    System.out.println("enter getApplicationCompanyNameByName");
                    String comanyName = softwareHub.getApplicationCompanyNameByName(sc.next());
                    System.out.println(comanyName);
                    break;


            }
            System.out.println("do you want to continue yes/no");
            input = sc.next();

        }
        while(input.equals("yes"));
        System.out.println("thank you....");

    }
}


       /* Application app1=new Application();
        app1.setAppId(2);
        app1.setAppName("Snapchat");
        app1.setAppVersion("2.3");
        app1.setReleaseDate("8-7-2021");
        app1.setCompanyName("SnapInc");
        app1.setAppType("socialMedia");

        Application app3=new Application();
        app3.setAppId(3);
        app3.setAppName("yono SBI");
        app3.setAppVersion("4.2");
        app3.setCompanyName("SBI");
        app3.setReleaseDate("24-11-2017");
        app3.setAppType("financial app");



        SoftwareHub softwareHub=new SoftwareHub();

        softwareHub.addApplications(app);
        softwareHub.addApplications(app1);
        softwareHub.addApplications(app3);
        softwareHub.getAllApplication();

        softwareHub.updateAppVersionByAppName("2.5", "Snapchat" );

        softwareHub.getAllApplication();
        softwareHub.deleteApplicationByAppName("yono SBI")

        Application appByName = softwareHub.getApplicationByName("Whatsapp");
        System.out.println(appByName.getAppId() +" "+ appByName.getAppName() +" "+ appByName.getAppType() +" "+ appByName.getAppVersion() +" "+ appByName.getCompanyName() + " "+ appByName.getReleaseDate());

        Application appByType = softwareHub.getApplicationByType("socialMedia");
        System.out.println(appByType.getAppId() +" "+ appByType.getAppName() +" "+ appByType.getAppType() +" "+ appByType.getAppVersion() +" "+ appByType.getCompanyName() + " "+ appByType.getReleaseDate());

        Application appById = softwareHub.getApplicationById(2);
        System.out.println(appById.getAppId() +" "+ appById.getAppName() +" "+ appById.getAppType() +" "+ appById.getAppVersion() +" "+ appById.getCompanyName() + " "+ appById.getReleaseDate());

        String appName = softwareHub.getApplicationNameByType("socialMedia");
        System.out.println("app name is fetched by the type:" +appName);

        String appType = softwareHub.getApplicationTypeByName("Whatsapp");
        System.out.println("app type is fetched by the name:" +appType);

        String comanyName = softwareHub.getApplicationCompanyNameByName("Whatsapp");
        System.out.println("company name is fetched by the name:" +comanyName);*/



