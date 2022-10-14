/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nov2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Karinak
 */
public class ServerManager {

    private Server[] sArr = new Server[50];
    private int size = 0;

    public ServerManager() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data\\Servers.txt"));
        while (sc.hasNextLine()) {
            Scanner line = new Scanner(sc.nextLine()).useDelimiter("#");
            String serverID = line.next();
            String location = line.next();
            String fault = line.next();
            String role = line.next();
            sArr[size] = new Server(serverID, location, role, fault);
            size++;

        }
    }

    public String allServers() {
        String out = "";
        for (int i = 0; i < size; i++) {
            out += sArr[i].toString() + "\n\n";
        }
        return out;
    }

    public int countServers(String f, String r) {
        int out = 0;
        for (int i = 0; i < size; i++) {
            if (sArr[i].getFault().equalsIgnoreCase(f) && sArr[i].getRole().equalsIgnoreCase(r)) {
                out = out + 1;
            }
        }
        return out;
    }

    public void assignTechnician() throws FileNotFoundException {
        Technician current;
        Scanner sc = new Scanner(new File("data\\Technicians.txt"));

        while (sc.hasNextLine()) {

            Scanner line = new Scanner(sc.nextLine()).useDelimiter("#");
            String techId = line.next();
            String name = line.next();
            int experience = line.nextInt();
            String role = line.next();
            int used = 0;
            current = new Technician(techId, name, experience, role);

            for (int i = 0; i < size; i++) {
                if (sArr[i].getRole().equalsIgnoreCase(role) && sArr[i].getAssignedTech() == null) {
                    sArr[i].setAssignedTech(current);
                    used++;
                    if (used == 4) {
                        break;
                    }
                }

            }
        }
    }

    public String printMap(String techID) throws IOException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy/MM/dd hh:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String out = now.format(dtf) + "\n\n\n";
        out += " \t" + "1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\t13\t14\t15\n";
        char[][] layout = new char[10][15];
        for (int i = 0; i < layout.length; i++) {
            for (int j = 0; j < layout[i].length; j++) {
                layout[i][j] = '*';
            }
        }

        String[] techServersArr = new String[4];
        int tsSize = 0;

        for (int i = 0; i < size; i++) {
            if (sArr[i].getAssignedTech() != null && sArr[i].getAssignedTech().getTechID().equals(techID)) {
                techServersArr[tsSize] = sArr[i].getLocation();
                tsSize++;
            }
        }

        for (int i = 0; i < tsSize; i++) {
            char cRow = techServersArr[i].charAt(0);
            int row = 0;
            switch (cRow) {
                case 'A':
                    row = 0;
                    break;

                case 'B':
                    row = 1;
                    break;

                case 'C':
                    row = 2;
                    break;

                case 'D':
                    row = 3;
                    break;

                case 'E':
                    row = 4;
                    break;

                case 'F':
                    row = 5;
                    break;

                case 'G':
                    row = 6;
                    break;

                case 'H':
                    row = 7;
                    break;

                case 'I':
                    row = 8;
                    break;

                case 'J':
                    row = 9;
                    break;

            }
            int coloumn = Integer.parseInt(techServersArr[i].substring(1)) - 1;

            layout[row][coloumn] = 'X';
        }

        out += "A\t ";
        for (int j = 0; j < layout[0].length; j++) {
            out += layout[0][j] + "\t";
        }
        out += "\nB\t ";
        for (int j = 0; j < layout[1].length; j++) {
            out += layout[1][j] + "\t";
        }

        out += "\nC\t ";
        for (int j = 0; j < layout[2].length; j++) {
            out += layout[2][j] + "\t";
        }

        out += "\nD\t ";
        for (int j = 0; j < layout[3].length; j++) {
            out += layout[3][j] + "\t";
        }

        out += "\nE\t ";
        for (int j = 0; j < layout[4].length; j++) {
            out += layout[4][j] + "\t";
        }

        out += "\nF\t ";
        for (int j = 0; j < layout[5].length; j++) {
            out += layout[5][j] + "\t";
        }

        out += "\nG\t ";
        for (int j = 0; j < layout[6].length; j++) {
            out += layout[6][j] + "\t";
        }

        out += "\nH\t ";
        for (int j = 0; j < layout[7].length; j++) {
            out += layout[7][j] + "\t";
        }

        out += "\nI\t ";
        for (int j = 0; j < layout[8].length; j++) {
            out += layout[8][j] + "\t";
        }

        out += "\nJ\t ";
        for (int j = 0; j < layout[9].length; j++) {
            out += layout[9][j] + "\t";
        }

        PrintWriter outFile = new PrintWriter(new FileWriter("data\\" + techID + ".txt"));
        outFile.print(out);
        outFile.close();

        return out;

    }

    public String printBetterMap(String techIDIn) {
        //Header
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy/MM/dd hh:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String out = now.format(dtf) + "\n\n\n \t";

        for (int i = 1; i <= 15; i++) {
            out += i + "\t";
        }
        out += "\n"; 

        for (char row = 'A'; row <= 'J'; row++) {
                out += row + "\t";
            for (int col = 1; col <= 15; col++) {
                boolean found = false;
                for (int i = 0; i < size; i++) {
                    Server server = sArr[i];
                    if (server.getAssignedTech() != null) {
                        String serverLocation = server.getLocation();
                        String location = "" + row + col;
                        if (serverLocation.equals(location)) {
                            String techID = server.getAssignedTech().getTechID();
                            if (techID.equals(techIDIn)) {
                                out += "X\t";
                                found = true;
                            }
                        }
                    }
                }
                if (!found) {
                    out += "*\t";
                }
            }
            out +="\n";
        }
        return out;
    }
}
