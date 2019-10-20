package parsing;

import org.supercsv.io.CsvListReader;
import org.supercsv.prefs.CsvPreference;

import java.io.Reader;
import java.util.List;

public class SuperCsvParser extends AbstractParser{
    public List<String[]> parseRows(Reader reader) throws Exception {
        CsvListReader parser = new CsvListReader(reader, CsvPreference.TAB_PREFERENCE);
        parser.getHeader(true);
        List<String[]> result = null;
        while (parser.read() != null){
   //         result.add(parser.read());

        }
        parser.read();
        return null;
    }
}

//    private static void readWithCsvListReader() throws Exception {
//
//        ICsvListReader listReader = null;
//        try {
//            listReader = new CsvListReader(new FileReader(CSV_FILENAME), CsvPreference.STANDARD_PREFERENCE);
//
//            listReader.getHeader(true); // skip the header (can't be used with CsvListReader)
//            final CellProcessor[] processors = getProcessors();
//
//            List<Object> customerList;
//            while( (customerList = listReader.read(processors)) != null ) {
//                System.out.println(String.format("lineNo=%s, rowNo=%s, customerList=%s", listReader.getLineNumber(),
//                        listReader.getRowNumber(), customerList));
//            }
//
//        }
//        finally {
//            if( listReader != null ) {
//                listReader.close();
//            }
//        }
//    }
