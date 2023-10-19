package com.xworkz.playstoreapp.hub;

import com.xworkz.playstoreapp.application.Application;

import java.util.Arrays;

public class SoftwareHub {
    Application application[];
    int index;
    public SoftwareHub(int size){
        application = new Application[size];
    }
    public boolean addApplications(Application application){
    boolean isAdded = false;
    if(application != null){
        this.application[index++] = application;
        isAdded = true;
    }
    return isAdded;
    }


    public void getAllApplication() {
        System.out.println("The list of application details are:");

        for (int i = 0; i < index; i++) {
            System.out.println(
                    application[i].getAppId() + " " +
                            application[i].getAppName() + " " +
                            application[i].getAppVersion() + " " +
                            application[i].getReleaseDate() + " " +
                            application[i].getCompanyName() + " " +
                            application[i].getAppType() );

        }
    }

    public Application getApplicationByName(String appName) {
        Application application1 = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppName()== appName) {
                application1 = application[appIndex];
                System.out.println("Application found.. please collect it executor");
            }
        }
        return application1;
    }

    public Application getApplicationByType(String appType){
        Application application1 = null;
        for(int appIndex = 0; appIndex <this.application.length; appIndex++){
            if(application[appIndex].getAppType()== appType){
                application1 = application[appIndex];
                System.out.println("application found..");
            }
        }
        return application1;
    }

    public Application getApplicationById(int appId){
        Application application1 = null;
        for(int appIndex = 0; appIndex <this.application.length; appIndex++){
            if(application[appIndex].getAppId()== appId){
                application1 = application[appIndex];
                System.out.println("application found..");
            }
        }
        return application1;
    }

    public String getApplicationNameByType(String appType){

        String appName = null;
        System.out.println("invoking the method get getApplicationNameByType");
        for(int i = 0; i <this.application.length; i++){
            if(application[i].getAppType()== appType){
                appName = application[i].getAppName();
            }
        }
        return appName;
    }

    public String getApplicationTypeByName(String appName){

        String appType = null;
        System.out.println("invoking the method get getApplicationTypeByName");
        for(int i = 0; i <this.application.length; i++){
            if(application[i].getAppName()== appName){
                appType = application[i].getAppType();
            }
        }
        return appType;
    }

    public String getApplicationCompanyNameByName(String appName){

        String companyName = null;
        System.out.println("invoking the method get getApplicationCompanyNameByName");
        for(int i = 0; i <this.application.length; i++){
            if(application[i].getAppName()== appName){
                companyName = application[i].getCompanyName();
            }
        }
        return companyName;
    }

    //upadate operation
    public boolean updateAppVersionByAppName(String updateVersion, String existingAppName){

        boolean isVersionUpdated = false;
        System.out.println("invoking the method get updateAppVersionByAppName");
        for(int i = 0; i <this.application.length; i++){
            if(application[i].getAppName()== existingAppName){
              application[i].setAppVersion(updateVersion);
              isVersionUpdated = true;
                System.out.println("application found..");
            }
        }
        return isVersionUpdated;
    }

    /*public boolean updateAppVersionAndSizeByAppName(){
        return
    }*/
    //delete operation
    public void deleteApplicationByAppName(String appName){
        System.out.println("invoking");
        int index, newIndex;
        for (index=0, newIndex = 0; index<this.application.length; index++){
            if(application[index].getAppName() != appName){
                application[index++] = application[index];
                System.out.println("given data");
            }
            else{
                System.out.println("Data has been delete is "+application[index].getAppName());
            }

        }
        application = Arrays.copyOf(application, newIndex);
        getAllNewApplication(application);
    }

    public void getAllNewApplication(Application[] application){
      for(int i = 0; i < application.length; i++ ) {
          System.out.println(application[i].getAppId() +" "+ application[i].getAppName() +" "+ application[i].getAppVersion() +" "+ application[i].getCompanyName() +" "+ application[i].getAppType() +" "+ application[i].getReleaseDate());
      }
    }
}
