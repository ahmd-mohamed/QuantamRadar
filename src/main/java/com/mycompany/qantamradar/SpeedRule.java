package com.mycompany.qantamradar;

public class SpeedRule implements Rule {
    @Override
    public Violation check(Observation observation) {

        if (observation.getCarType() == CarType.Private
                && observation.getSpeed() > 80) {
            return new Violation(
                    "Speed of " + observation.getSpeed()
                            + " exceeded max allowed 80",
                    300
            );
        }
        if (observation.getCarType() == CarType.Bus&& observation.getSpeed() > 70) {
            return new Violation(
                    "speed of "+ observation.getSpeed()+ " exceeded max allowed 70",
                    500
            );
        }
        if (observation.getCarType() == CarType.Truck && observation.getSpeed() > 60)
        {
            return new Violation("speed of "+ observation.getSpeed()+ " exceeded max allowed 60",
                    600);
        }
        return null;
    }
}
