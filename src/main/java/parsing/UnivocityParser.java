package parsing;

import com.univocity.parsers.tsv.TsvParser;
import com.univocity.parsers.tsv.TsvParserSettings;

import java.io.Reader;
import java.util.List;


public class UnivocityParser extends AbstractParser{
    @Override
    public List<String[]> parseRows(Reader reader) {
        name = "Univocity parser";
        TsvParserSettings settings = new TsvParserSettings();
        settings.getFormat().setLineSeparator("\n");
        TsvParser parser = new TsvParser(settings);
        return parser.parseAll(reader);
    }
}
