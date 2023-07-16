package org.goit.hw4.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DatabaseQueryExecution {

    public static void main(String[] args) {

        Database database = Database.getINSTANCE();
        Connection conn = database.getConnection();
        Statement statement;
        try {
            statement = conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        List<FindMaxSalaryWorker> findMaxSalaryWorkerList;
        try {
            findMaxSalaryWorkerList = new DatabaseQueryService().findMaxSalaryWorker();
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("FindMaxSalaryWorkerList: " + findMaxSalaryWorkerList.toString());
        System.out.println("\n");

        List<FindLongestProject> findLongestProjectList;
        try {
            findLongestProjectList = new DatabaseQueryService().findLongestProjects();
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("FindLongestProject: " + findLongestProjectList.toString());
        System.out.println("\n");

        List<FindYoungestEldestWorkers> findYoungestEldestWorkersList;
        try {
            findYoungestEldestWorkersList = new DatabaseQueryService().findYoungestEldestWorkers();
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("FindYoungestEldestWorkers: " + findYoungestEldestWorkersList.toString());
        System.out.println("\n");

        List<FindMaxProjectsClient> findMaxProjectsClientList;
        try {
            findMaxProjectsClientList = new DatabaseQueryService().findMaxProjectsClients();
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("FindMaxProjectsClient: " + findMaxProjectsClientList.toString());
        System.out.println("\n");

        List<PrintProjectPrices> printProjectPricesList;
        try {
            printProjectPricesList = new DatabaseQueryService().printProjectPrices();
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("PrintProjectsPrices: " + printProjectPricesList.toString());
        System.out.println("\n");

        try {
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        database.closeConnection();
    }
}
