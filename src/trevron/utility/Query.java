package trevron.utility;

import java.sql.ResultSet;
import java.sql.Statement;

public class Query {
    private static String query;
    private static Statement stmt;
    private static ResultSet result;


    public static void executeQuery(String q) {
        query = q;

        try {
            // Create statement object
            stmt = DBConnection.conn.createStatement();

            // Determine query execution
            if(query.toLowerCase().startsWith("select")) {
                result = stmt.executeQuery(query);
            }

            if(query.toLowerCase().startsWith("delete") || query.toLowerCase().startsWith("insert") || query.toLowerCase().startsWith("update")) {
                stmt.executeUpdate(query);
            }

        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static ResultSet getResult() {
        return result;
    }
}
