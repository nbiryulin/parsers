package parsing;

import org.supercsv.io.CsvListReader;
import org.supercsv.prefs.CsvPreference;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class SuperCsvParser extends AbstractParser{
    public List<String[]> parseRows(Reader reader) throws Exception {
        name = "Super csv parser";
        List<String[]> rows = new ArrayList<String[]>();
        CsvListReader parser = new CsvListReader(reader, CsvPreference.TAB_PREFERENCE);
        List<String> row;
        while ((row = parser.read()) != null) {
            rows.add(row.toArray(new String[0]));
        }
        parser.close();
        reader.close();
        return rows;
    }
}

