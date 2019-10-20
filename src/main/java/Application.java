import parsing.*;

import java.io.*;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        UnivocityParser univocityParser = new UnivocityParser();
        OpenCSVParser openCSVParser = new OpenCSVParser();
        Reader reader = null;
        Reader reader1 = null;
        try {
           reader = new BufferedReader(new FileReader(new File("/media/anton/BE18-4580/sample/rick_dsp-future_sample-2019-09-20.tsv.gz.truncate")));
            reader1 = new BufferedReader(new FileReader(new File("/media/anton/BE18-4580/sample/rick_dsp-future_sample-2019-09-20.tsv.gz.truncate")));
        } catch (IOException e) {
            e.printStackTrace();}
        long start = System.currentTimeMillis();
        try {
            univocityParser.parseRows(reader);
        } catch (Exception p) {
            p.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        start = System.currentTimeMillis();
        openCSVParser.parseRows(reader1);
        end = System.currentTimeMillis();
        System.out.println(end-start);

        List<String[]> a = openCSVParser.parseRows(reader);
        System.out.println(a);

        List<String[]> b = univocityParser.parseRows(reader);
        System.out.println(b);




}}
