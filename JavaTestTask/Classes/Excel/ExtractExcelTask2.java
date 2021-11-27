import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import org.apache.commons.compress.utils.IOUtils;
import org.testng.annotations.Test;

import java.io.InputStream;

public class ExtractExcelTask2 {

    Recordset rs;

    @Test
    public void extract() {
        try {
            System.setProperty("ROW", "1");
            System.setProperty("COLUMN", "1");
            Fillo fillo = new Fillo();
            Connection con = fillo.getConnection("TASK2.xlsx");
            String query1 = "SELECT * FROM Task2From";
            rs = con.executeQuery(query1);
            while (rs.next()) {
                String result = "('"+rs.getField("result")+"')";
                String query2 = "INSERT INTO Task2To(result) VALUES"+result+"";
                con.executeUpdate(query2);
            }
            rs.close();
            con.close();
        } catch (FilloException e) {
            e.printStackTrace();
        }






    }
}
