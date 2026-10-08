package com.inventory.factory;

public class ReportFactory {

    public static String createReport(String reportType) {
        if ("STOCK".equalsIgnoreCase(reportType)) {
            return "Stock Report";
        }

        if ("LOW_STOCK".equalsIgnoreCase(reportType)) {
            return "Low Stock Report";
        }

        if ("SALES".equalsIgnoreCase(reportType)) {
            return "Sales Report";
        }

        throw new IllegalArgumentException("Unknown report type.");
    }
}
