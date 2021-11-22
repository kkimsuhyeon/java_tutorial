package repository;

import domain.Line;
import domain.Station;

import java.util.*;

public class TransitMapRepository {

    private static final Map<Line, LinkedList<Station>> transitMaps = new LinkedHashMap<>();

    public static Map<Line, LinkedList<Station>> getTransitMaps(){
        return Collections.unmodifiableMap(transitMaps);
    }

    public static void deleteTransitMapByLine(Line line){
        transitMaps.remove(line);
    }

    public static List<String> getTransitMapsLineNames(){
        List<String> transitMapsLineNames = new ArrayList<>();

        for(Map.Entry<Line, LinkedList<Station>> entry : transitMaps.entrySet()){
            Line key = entry.getKey();
            transitMapsLineNames.add(key.getName());
        }

        return transitMapsLineNames;
    }

    public static List<LinkedList<String>> getTransitMapsStationNames(){
        List<LinkedList<String>> transitMapsStationNames = new ArrayList<>();

        for(Map.Entry<Line, LinkedList<Station>> entry : transitMaps.entrySet()){
            LinkedList<String> transitMapStationNames = new LinkedList<>();
            LinkedList<Station> values = entry.getValue();

            for(Station value : values){
                transitMapStationNames.add(value.getName());
            }
            transitMapsStationNames.add(transitMapStationNames);
        }
        return transitMapsStationNames;
    }

    public static List<String> getTransitMapStationNamesByLineName(String lineName){

        List<String> transitMapStations;
        transitMapStations = getTransitMapStationNames(transitMaps.get(lineName));

        return transitMapStations;
    }

    public static List<String> getTransitMapStationNames(LinkedList<Station> stations){
        List<String> stationNames = new ArrayList<>();

        for(Station station: stations){
            stationNames.add(station.getName());
        }

        return stationNames;
    }

}
