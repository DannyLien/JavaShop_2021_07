package com.tom.report;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {
    public static void main(String[] args) {
        Report health = new HealthReport();
        Report finace = new FinaceReport();
        List<Report> reports = new ArrayList<>();
        reports.add(health);
        reports.add(finace);

        for (Report report : reports) {
            System.out.println(report.load());
            report.print();
        }

    }
}
