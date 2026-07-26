package com.mycompany.qantamradar;

import java.util.*;

public class QRadar {

    private ArrayList<Rule> rules;
    private ArrayList<Fine> fines;

    public QRadar(ArrayList<Rule> rules) {
        this.rules = rules;
        this.fines = new ArrayList<>();
    }

    public QRadar() {
    }

    public QRadar(ArrayList<Rule> rules, ArrayList<Fine> fines) {
        this.rules = rules;
        this.fines = fines;
    }

    public ArrayList<Rule> getRules() {
        return rules;
    }

    public void setRules(ArrayList<Rule> rules) {
        this.rules = rules;
    }

    public ArrayList<Fine> getFines() {
        return fines;
    }

    public void setFines(ArrayList<Fine> fines) {
        this.fines = fines;
    }

    public void observe(Observation observation) {
        ArrayList<Violation> violations = new ArrayList<>();
        for (Rule rule : rules) {
            Violation violation = rule.check(observation);
            if (violation != null) {
                violations.add(violation);
            }
        }
        if (!violations.isEmpty()) {
            Fine fine = new Fine(
                    observation.getPlateNumber(),
                    violations
            );
            fines.add(fine);
        }
    }

}
