import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import java.util.Hashtable;

public class ReadExcel {
        static Fillo fillo;
        static Connection connection;
        final String excelFilePath = "TASK2.xlsx"; // excel file name
        final String connectionString;
        final String dataStartRow;

        public ReadExcel(int startRow) {
            this.connectionString = "SELECT * FROM ForTask3Opt";
            this.dataStartRow = Integer.toString(startRow); // starting row index for sub table
        }

        public Object[][] getExcelData() throws FilloException {
            System.setProperty("ROW", dataStartRow);// Table start row
            System.setProperty("COLUMN", "1");// Table start column

            fillo = new Fillo();
            connection = fillo.getConnection(excelFilePath);
            Recordset recordset = connection.executeQuery(connectionString);

            Hashtable<String, String> table;
            Object[][] data = new Object[recordset.getCount()][1];
            int rowIndex = 0;
            while (recordset.next()) {
                table = new Hashtable<>();
                for (String strColumn : recordset.getFieldNames()) {
                    table.put(strColumn, recordset.getField(strColumn.toString()));
                }
                data[rowIndex][0] = table; // putting hash table into Object array
                rowIndex++;
            }

            recordset.close();
            connection.close();
            return data;

        }
}
