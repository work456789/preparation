package com.preparation.designpatterns.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        TextFormattable textFormattable = new NewLineTextFormatter();
        showToUI(textFormattable);
        TextFormattable textFormattableCSV = new CsvFormatterFormatter();
        showToUI(textFormattableCSV);
    }

    private static void showToUI(TextFormattable textFormattable) {
        System.out.println(textFormattable.formatText(" Something, coming from database. Needs formatting, in order to be shown."));
    }
}
