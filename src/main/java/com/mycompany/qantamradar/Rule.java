package com.mycompany.qantamradar;

public interface Rule {
    Violation check(Observation observation);
}
