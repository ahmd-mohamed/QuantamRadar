package com.mycompany.qantamradar;

public class SeatbeltRule implements Rule{
    @Override
    Violation check(Observation observation)
    {
        if (observation.getSeatbeltStatus()==SeatbeltStatus.not)
        {
            return new Violation("not safe driving ",100);
        }
        return null;
    }
}
