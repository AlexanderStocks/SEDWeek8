package Q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormattedList {
    private List<String> content = new ArrayList<>();
    FormatList formatList;

    public FormattedList (FormatList formatList) {
        this.formatList = formatList;
    }

    public FormattedList(String... items) {
        content.addAll(Arrays.asList(items));
    }

    public void add(String item) {
        content.add(item);
    }

    public void print() {
        System.out.println(formatList.formatHeader());
        for (String item : content) {
            System.out.println(formatList.formatItem(item));
        }
        System.out.println(formatList.formatFooter());
    }
}

