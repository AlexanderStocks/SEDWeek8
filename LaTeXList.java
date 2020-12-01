package Q1;

public class LaTeXList implements FormatList{

    public String formatHeader() {
        return "\\begin{itemize}";
    }

    public String formatItem(String item) {
        return "  \\item " + item;
    }

    public String formatFooter() {
        return "\\end{itemize}";
    }
}
