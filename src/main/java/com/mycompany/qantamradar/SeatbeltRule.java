package com.mycompany.qantamradar;

public class SeatbeltRule implements Rule{
    @Override
    public Violation check(Observation observation)
    {
        if (observation.getSeatbeltStatus()==SeatbeltStatus.not)
        {
            return new Violation("Seatbelt not fastned",100);

        }
        return null;
    }
}
