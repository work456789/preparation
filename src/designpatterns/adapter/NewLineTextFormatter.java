package designpatterns.adapter;

public class NewLineTextFormatter implements TextFormattable {
    @Override
    public String formatText(String text) {
        String formattedText = text.replace(".", "\n");
        formattedText = formattedText + " (formatted using text formatter)";
        return formattedText;
    }
}
