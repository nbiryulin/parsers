package parsing;

import java.io.Reader;
import java.util.List;

public abstract class AbstractParser {

    public String name;

    public abstract List<String[]> parseRows(Reader reader) throws Exception;
}
