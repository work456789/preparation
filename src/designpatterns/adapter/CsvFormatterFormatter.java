package designpatterns.adapter;

public class CsvFormatterFormatter implements TextFormattable {
    @Override
    public String formatText(String text) {
        String formattedText = text.replace(".", ",");
        formattedText = formattedText + " (formatted using CSV formatter)";
        return formattedText;
    }
}
