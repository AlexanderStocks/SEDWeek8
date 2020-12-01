package Q1;

import java.util.Arrays;

public class HtmlList implements FormatList{
    public String formatHeader() {
        return "<ul>";
    }


    public String formatItem(String item) {
        return "  <li>" + item + "</li>";
    }


    public String formatFooter() {
        return "</ul>";
    }
}
