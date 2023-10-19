package com.xworkz.engineerapp.executor;

import com.xworkz.engineerapp.engineer.CsEngineer;
import com.xworkz.engineerapp.engineer.Engineer;
import com.xworkz.engineerapp.engineer.MarineEngineer;

public class EngineerExecutor {
    public static void main(String[] args) {

        //up casting
        Engineer engineer = new  CsEngineer();
        engineer.problemSolving();

        //down casting
        CsEngineer csengineer = (CsEngineer) engineer;
        csengineer.softwareDeveloper();

        Engineer engineer1 = new MarineEngineer();

        MarineEngineer marineengineer = (MarineEngineer) engineer1;
        marineengineer.enjoy();

    }
}
