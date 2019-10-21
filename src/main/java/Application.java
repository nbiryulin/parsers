import parsing.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {
        List<AbstractParser> list = createParsers();
        for (AbstractParser parser : list) {
            long sum = 0;
            for (int i = 0; i <10 ; i++) {
                long start = System.currentTimeMillis();
                //List<String[]> text = parser.parseRows(getReader());
                parser.parseRows(getReader());
                long end = System.currentTimeMillis();
                sum += (end-start);
                System.out.print((end-start) + " ");
                //System.out.println(text.get(0)[0]);
                //add this two line to check if all parsers work correctly
            }
            System.out.println("Average: " + sum/10 + " " + parser.name);

        }
    }

    private static Reader getReader() throws FileNotFoundException {
        return new FileReader(new File("/media/anton/BE18-4580/sample/file"));
    }

    private static List<AbstractParser> createParsers(){
        List <AbstractParser> list = new ArrayList<>();

        UnivocityParser univocityParser = new UnivocityParser();
        OpenCSVParser openCSVParser = new OpenCSVParser();
        FasterxmlParser fasterxmlParser = new FasterxmlParser();
 //       FlatpackParser flatpackParser = new FlatpackParser();
        SuperCsvParser superCsvParser = new SuperCsvParser();

        list.add(univocityParser);
        list.add(openCSVParser);
        list.add(fasterxmlParser);
 //       list.add(flatpackParser);
        list.add(superCsvParser);
        return list;
    }
}
