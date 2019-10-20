package parsing;

import com.fasterxml.jackson.dataformat.csv.CsvFactory;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.Reader;
import java.util.List;

public class FasterxmlParser extends AbstractParser{

    public List<String[]> parseRows(Reader reader) throws Exception {
        CsvFactory csvFactory = new CsvFactory();
        CsvParser parser = csvFactory.createParser(getFile());
        CsvSchema schema = CsvSchema.builder().setLineSeparator('\t').build();
        
        return null;
    }
    public File getFile() {
        return new File("/media/anton/BE18-4580/sample/rick_dsp-future_sample-2019-09-20.tsv.gz.truncate");
    }
}
