/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Karinak
 */
public class TourManager {

    private Stop[] sArr = new Stop[100];
    private int size = 0;

    public TourManager() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data\\data.txt"));
        while (sc.hasNextLine()) {
            Scanner lineSC = new Scanner(sc.nextLine()).useDelimiter(",");
            String name = lineSC.next();
            int stopType = lineSC.nextInt();
            String route = lineSC.next();

            sArr[size] = new Stop(name, route, stopType);
            size++;
        }

    }

    public Route getRouteCodeWith(char c, boolean b) {
        Route r = new Route(c, b);
        Stop[] stopsForRoute = new Stop[100];
        int arrSize = 0;
        for (int i = 0; i < size; i++) {
            if (sArr[i].isPartOfRoute(c)) {
                stopsForRoute[arrSize] = sArr[i];
                arrSize++;
            }
        }
        r.setStops(stopsForRoute);
        return r;
    }

    public String routesInCommon(Route r, Route p) {
        String out = "Stops in common \n";
        for (int i = 0; i < 100; i++) {
            if (r.getStopAt(i) == null || p.getStopAt(i) == null) {
                break;
            }
            if (r.getStopAt(i).toString().equalsIgnoreCase(p.getStopAt(i).toString())) {
                out += r.getStopAt(i).toString();
            }
        }

        return out;
    }

    public String stopsInCommon(Route r1, Route r2) {
        String toret = "Common\n";
// alternative 1: working with the two routes
        int count = 0;
        Stop s = r1.getStopAt(count);
// s not necessary - can work directly with r1.getStopAt(count);
        while (s != null) {
            if (s.isPartOfRoute(r2.getRouteCode())) {
                toret += s + "\n";
            }
            count++;
            s = r1.getStopAt(count);
        }
        return toret;
    }

}
