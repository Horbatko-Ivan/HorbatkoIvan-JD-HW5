package org.goit.hw4.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabasePopulateService {

    private static final String POPULATE_DB_PATH = "src/main/java/org/goit/hw4/sql/populate_db.sql";

    public static void main(String[] args) throws IOException, SQLException {

        Database database = Database.getINSTANCE();
        Connection conn = database.getConnection();

        PreparedStatement statementClient = conn.prepareStatement("INSERT INTO client (name) VALUES (?)");
        List<String> clientTableData = new SQLFileReader().readDataForClientTable(POPULATE_DB_PATH);

        for (String name : clientTableData) {
            statementClient.setString(1, name);
            statementClient.addBatch();
        }
        statementClient.executeBatch();
        statementClient.close();

        PreparedStatement statementWorker = conn.prepareStatement("INSERT INTO worker (name, birthday, level, salary) VALUES (?,?,?,?)");
        List<String> workerTableData = new SQLFileReader().readDataForWorkerTable(POPULATE_DB_PATH);

        String workerName;
        String workerBirthday;
        String workerLevel;
        String workerSalary;
        List<String> workerLine = new ArrayList<>();

        for (int i = 0; i < workerTableData.size(); i++) {
            workerLine.add(workerTableData.get(i));

            String[] array = workerLine.get(i).split("\\s+,");

            workerName = array[0].trim();
            workerBirthday = array[1].trim();
            workerLevel = array[2].trim();
            workerSalary = array[3].trim();

            statementWorker.setString(1, workerName);
            statementWorker.setDate(2, Date.valueOf(workerBirthday));
            statementWorker.setString(3, workerLevel);
            statementWorker.setInt(4, Integer.parseInt(workerSalary));
            statementWorker.addBatch();
            statementWorker.executeBatch();
        }
        statementWorker.close();

        PreparedStatement statementProject = conn.prepareStatement("INSERT INTO project (client_ID, start_date, finish_date) VALUES (?,?,?)");
        List<String> projectTableData = new SQLFileReader().readDataForProjectTable(POPULATE_DB_PATH);

        String clientID;
        String startDate;
        String finishDate;
        List<String> projectLine = new ArrayList<>();
        for (int i = 0; i < projectTableData.size(); i++) {
            projectLine.add(projectTableData.get(i));

            String[] projectArray = projectLine.get(i).split(",");
            clientID = projectArray[0].trim();
            startDate = projectArray[1].trim();
            finishDate = projectArray[2].trim();

            statementProject.setInt(1, Integer.parseInt(clientID));
            statementProject.setDate(2, Date.valueOf(startDate));
            statementProject.setDate(3, Date.valueOf(finishDate));
            statementProject.addBatch();
            statementProject.executeBatch();
        }

        statementProject.close();

        PreparedStatement statementPW = conn.prepareStatement("INSERT INTO project_worker (project_ID, worker_ID) VALUES (?,?)");
        List<String> projectWorkerTableData = new SQLFileReader().readDataForProjectWorkerTable(POPULATE_DB_PATH);

        String pID;
        String wID;

        List<String> projectWorkerLine = new ArrayList<>();
        for (int i = 0; i < projectWorkerTableData.size(); i++) {
            projectWorkerLine.add(projectWorkerTableData.get(i));

            String[] projectWorkerArray = projectWorkerLine.get(i).split(" \\s+");
            pID = projectWorkerArray[0].trim();
            wID = projectWorkerArray[1].trim();

            statementPW.setInt(1, Integer.parseInt(pID));
            statementPW.setInt(2, Integer.parseInt(wID));
            statementPW.addBatch();
            statementPW.executeBatch();

        }
        statementPW.close();

        database.closeConnection();
    }
}
