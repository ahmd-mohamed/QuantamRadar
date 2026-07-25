

package com.mycompany.qantamradar;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class QantamRadar {

    public static void main(String[] args) {



        Observation o1 = new Observation(
                "ABC123",
                new Date(),
                CarType.Private,
                90,
                SeatbeltStatus.not
        );
Rule r1 = new SeatbeltRule();
Rule r2 = new SpeedRule();
Violation v1 = r1.check(o1);
Violation v2 = r2.check(o1);

        System.out.println(r1.check(o1));
        System.out.println(r2.check(o1));
        System.out.println();
        ArrayList<Violation> violations = new ArrayList<>();
        violations.add(v1);
        violations.add(v2);
        Fine f1 = new Fine("ABC123",violations);
        System.out.println(f1.CalculateTotalPrice());

    }


}
