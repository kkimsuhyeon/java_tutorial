package repository;

import domain.Station;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class StationRepository {

    private static final List<Station> stations = new ArrayList<>();

    public static List<Station> getStations(){
        return Collections.unmodifiableList(stations);
    }

    public static void addStation(Station station){
        stations.add(station);
    }

    public static boolean deleteStationByName(String name){
        return stations.removeIf(station -> Objects.equals(station.getName(), name));
    }

    public static List<String> getStationNames(){
        List<String> stationNames = new ArrayList<>();

        for(Station station: stations){
            stationNames.add(station.getName());
        }

        return stationNames;
    }
}
