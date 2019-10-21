import parsing.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {
        List<AbstractParser> list = createParsers();
        for (AbstractParser parser : list) {
            long start = System.currentTimeMillis();
            parser.parseRows(getReader());
            long end = System.currentTimeMillis();
            System.out.println(parser.name + " " + (end-start));
        }
    }

    private static Reader getReader() throws FileNotFoundException {
        return new BufferedReader(new FileReader(new File("/media/anton/BE18-4580/sample/rick_dsp-future_sample-2019-09-20.tsv.gz.truncate")));
    }

    private static List<AbstractParser> createParsers(){
        List <AbstractParser> list = new ArrayList<>();
        UnivocityParser univocityParser = new UnivocityParser();
        OpenCSVParser openCSVParser = new OpenCSVParser();
        FasterxmlParser fasterxmlParser = new FasterxmlParser();
        list.add(univocityParser);
        list.add(openCSVParser);
        list.add(fasterxmlParser);
        return list;
    }
}
