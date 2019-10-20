package parsing;


import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;


import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class OpenCSVParser extends AbstractParser {
    public List<String[]> parseRows(Reader reader) throws Exception {
        CSVParser parser = new CSVParserBuilder()
                .withSeparator('\t')
                .build();

        CSVReader csvReader = new CSVReaderBuilder(reader)
                .withSkipLines(0)
                .withCSVParser(parser)
                .build();
        List<String[]> list = new ArrayList<String[]>();
        list = csvReader.readAll();
        //reader.close();
        csvReader.close();
        return list;
    }
}
