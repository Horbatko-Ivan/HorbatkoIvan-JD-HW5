package org.goit.hw4.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DatabaseQueryService {

    private static final String MAX_SALARY_WORKER_FILE_PATH = "src/main/java/org/goit/hw4/sql/find_max_salary_worker.sql";
    private static final String LONGEST_PROJECT_FILE_PATH = "src/main/java/org/goit/hw4/sql/find_longest_project.sql";
    private static final String MAX_PROJECTS_CLIENT_FILE_PATH = "src/main/java/org/goit/hw4/sql/find_max_projects_client.sql";
    private static final String YOUNGEST_ELDEST_WORKERS_FILE_PATH = "src/main/java/org/goit/hw4/sql/find_youngest_eldest_workers.sql";
    private static final String PRINT_PROJECT_PRICES_FILE_PATH = "src/main/java/org/goit/hw4/sql/print_project_prices.sql";

    public List<FindMaxSalaryWorker> findMaxSalaryWorker() throws IOException, SQLException {

        List<FindMaxSalaryWorker> findMaxSalaryWorkerList = new ArrayList<>();
        SQLFileReader sqlFileReader = new SQLFileReader();
        String query = sqlFileReader.readFile(MAX_SALARY_WORKER_FILE_PATH);

        Database database = Database.getINSTANCE();
        Connection conn = database.getConnection();
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
            String name = rs.getString("name");
            int salary = rs.getInt("salary");
            findMaxSalaryWorkerList.add(new FindMaxSalaryWorker(name, salary));
        }

        return findMaxSalaryWorkerList;
    }

    public List<FindLongestProject> findLongestProjects() throws IOException, SQLException {

        List<FindLongestProject> findLongestProjectList = new ArrayList<>();
        SQLFileReader sqlFileReader = new SQLFileReader();
        String query = sqlFileReader.readFile(LONGEST_PROJECT_FILE_PATH);
        Database database = Database.getINSTANCE();
        Connection conn = database.getConnection();
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
            int id = rs.getInt("id");
            int monthCount = rs.getInt("project_time");
            findLongestProjectList.add(new FindLongestProject(id, monthCount));
        }

        return findLongestProjectList;
    }

    public List<FindYoungestEldestWorkers> findYoungestEldestWorkers() throws IOException, SQLException {
        List<FindYoungestEldestWorkers> findYoungestEldestWorkersList = new ArrayList<>();
        SQLFileReader sqlFileReader = new SQLFileReader();
        String query = sqlFileReader.readFile(YOUNGEST_ELDEST_WORKERS_FILE_PATH);
        Database database = Database.getINSTANCE();
        Connection conn = database.getConnection();
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
            String type = rs.getString("type");
            String name = rs.getString("name");
            Date birthday = rs.getDate("birthday");
            findYoungestEldestWorkersList.add(new FindYoungestEldestWorkers(type, name, birthday));
        }

        return findYoungestEldestWorkersList;
    }

    public List<FindMaxProjectsClient> findMaxProjectsClients() throws IOException, SQLException {
        List<FindMaxProjectsClient> findMaxProjectsClientList = new ArrayList<>();
        SQLFileReader sqlFileReader = new SQLFileReader();
        String query = sqlFileReader.readFile(MAX_PROJECTS_CLIENT_FILE_PATH);
        Database database = Database.getINSTANCE();
        Connection conn = database.getConnection();
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
            String name = rs.getString("name");
            int projectCount = rs.getInt("project_count");
            findMaxProjectsClientList.add(new FindMaxProjectsClient(name, projectCount));
        }

        return findMaxProjectsClientList;
    }

    public List<PrintProjectPrices> printProjectPrices() throws IOException, SQLException {
        List<PrintProjectPrices> printProjectPricesList = new ArrayList<>();
        SQLFileReader sqlFileReader = new SQLFileReader();
        String query = sqlFileReader.readFile(PRINT_PROJECT_PRICES_FILE_PATH);
        Database database = Database.getINSTANCE();
        Connection conn = database.getConnection();
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
            int name = rs.getInt("name");
            int projectCost = rs.getInt("project_cost");
            printProjectPricesList.add(new PrintProjectPrices(name, projectCost));
        }

        return printProjectPricesList;
    }
}
