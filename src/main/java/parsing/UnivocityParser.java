package parsing;

import com.univocity.parsers.tsv.TsvParser;
import com.univocity.parsers.tsv.TsvParserSettings;

import java.io.File;
import java.io.Reader;
import java.util.List;


public class UnivocityParser extends AbstractParser{

    @Override
    public List<String[]> parseRows(Reader reader) throws Exception {
        TsvParserSettings settings = new TsvParserSettings();
        settings.getFormat().setLineSeparator("\n");
        TsvParser parser = new TsvParser(settings);
        return parser.parseAll(reader);
    }

    public File getFile() {
        return new File("/media/anton/BE18-4580/sample/rick_dsp-future_sample-2019-09-20.tsv.gz.truncate");
    }
}
