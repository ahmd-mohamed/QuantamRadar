

package com.mycompany.qantamradar;



import java.util.ArrayList;
import java.util.*;

public class QantamRadar {

    public static void main(String[] args) {


        ArrayList<Rule> rules = new ArrayList<>();

        rules.add(new SpeedRule());
        rules.add(new SeatbeltRule());


        QRadar radar = new QRadar(rules);


        Observation o1 = new Observation(
                "ABC1234",
                new Date(),
                CarType.Private,
                94,
                SeatbeltStatus.not
        );


        radar.observe(o1);



        for (Fine fine : radar.getFines()) {
            fine.printfine();
        }


        Map<String, Integer> allFines = radar.getallfines();

        for (Map.Entry<String, Integer> entry : allFines.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " : "
                            + entry.getValue()
                            + " EGP"
            );
        }
    }


}
