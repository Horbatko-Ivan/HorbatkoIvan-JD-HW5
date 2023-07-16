package org.goit.hw4.main;

public class DatabaseInitService {

    private static final String INIT_DB_PATH = "src/main/java/org/goit/hw4/sql/init_db.sql";

    public static void main(String[] args) throws Exception {

        SQLFileReader sqlFileReader = new SQLFileReader();
        String sql = sqlFileReader.readFile(INIT_DB_PATH);

        Database.sendSQLExecute(sql);

    }
}
