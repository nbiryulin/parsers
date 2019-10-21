package parsing;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.Reader;
import java.util.List;

public class FasterxmlParser extends AbstractParser{

    public List<String[]> parseRows(Reader reader) throws Exception {
        name = "Fasternxml parser";
        CsvSchema schema = CsvSchema.emptySchema().withoutQuoteChar().withColumnSeparator('\t').withLineSeparator("\n");
        CsvMapper mapper = new CsvMapper();
        mapper.enable(CsvParser.Feature.WRAP_AS_ARRAY);
        MappingIterator<String[]> it = mapper.readerFor(String[].class).with(schema).readValues(reader);
        return it.readAll();
    }
}
