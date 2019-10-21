package parsing;

import net.sf.flatpack.DataSet;
import net.sf.flatpack.DefaultParserFactory;
import net.sf.flatpack.Parser;
import net.sf.flatpack.Record;

import java.io.*;
import java.util.*;

public class FlatpackParser extends AbstractParser {
    public List<String[]> parseRows(Reader reader) {
        name = "Flatpack parser";
        List<String[]> rows = new ArrayList<String[]>();
        Parser parser = DefaultParserFactory.getInstance()
                .newDelimitedParser(
                        reader,
                        '\t',
                        'n');
        DataSet dataset = parser.parse();
        while (dataset.next()) {
            Record record = dataset.getRecord().get();
            String[] row = new String[record.getColumns().length];
            int i = 0;
            for (String column : record.getColumns()) {
                row[i++] = record.getString(column);
            }
            rows.add(row);
        }
        return rows;
    }
}
