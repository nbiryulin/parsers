package parsing;

import java.io.File;
import java.io.Reader;
import java.util.List;

public abstract class AbstractParser {

   // public abstract void processRows(Reader reader) throws Exception;

    public abstract List<String[]> parseRows(Reader reader) throws Exception;
}
