package org.goit.hw5.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SQLFileReader {

    public String readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append("\n");
        }
        reader.close();

        return stringBuilder.toString();
    }

    public List<String> readDataForClientTable(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String line;
        List<String> clientList = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            if (line.equals("INSERT INTO client")) {
                reader.readLine();
                reader.readLine();
                while (!line.contains(";")) {
                    line = reader.readLine();
                    String clientName = line.replaceAll("[^A-Za-z0-9]", "");
                    clientList.add(clientName);
                }
            }
        }
        reader.close();

        return clientList;
    }

    public List<String> readDataForWorkerTable(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        List<String> workerDataList = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            if (line.equals("INSERT INTO worker")) {
                line = reader.readLine();
                line = reader.readLine();
                while (!line.contains(";")) {
                    line = reader.readLine();
                    String workerData = line.replaceAll("[^A-Za-z0-9,-]", " ");
                    workerData.split("\\s+");
                    workerDataList.add(workerData);
                }
            }
        }

        reader.close();

        return workerDataList;
    }

    public List<String> readDataForProjectWorkerTable(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String line;
        List<String> projectWorkerList = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            if (line.equals("INSERT INTO project_worker")) {
                reader.readLine();
                reader.readLine();
                while (!line.contains(";")) {
                    line = reader.readLine();
                    String projectWorkerData = line.replaceAll("[^0-9]", " ");
                    projectWorkerData.split("\\s+");
                    projectWorkerList.add(projectWorkerData);
                }
            }
        }
        reader.close();

        return projectWorkerList;
    }

    public List<String> readDataForProjectTable(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        List<String> workerDataList = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            if (line.equals("INSERT INTO project")) {
                line = reader.readLine();
                line = reader.readLine();
                while (!line.contains(";")) {
                    line = reader.readLine();
                    String workerData = line.replaceAll("[^A-Za-z0-9,-]", " ");
                    workerData.split("\\s+");
                    workerDataList.add(workerData);
                }
            }
        }

        reader.close();

        return workerDataList;
    }

}
