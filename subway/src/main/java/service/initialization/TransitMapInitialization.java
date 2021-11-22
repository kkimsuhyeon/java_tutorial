package service.initialization;

import domain.Line;
import domain.Station;
import repository.LineRepository;
import repository.StationRepository;
import repository.TransitMapRepository;
import type.StationType;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TransitMapInitialization {

    private static final List<Station> stations = StationRepository.getStations();

    public static void initializeTransitMaps(){
        List<Line> lines = getInitializationLines();
        List<LinkedList<Station>> lineStations = getInitializationStations();

        for(int i = 0; i < lines.size(); i++){
            TransitMapRepository.
        }
    }

    public static List<Line> getInitializationLines(){
        return LineRepository.getLines();
    }

    public static List<LinkedList<Station>> getInitializationStations(){
        List<LinkedList<Station>> lineStations = new ArrayList<>();
        LinkedList<Station> lineTwoStations = new LinkedList<>();
        LinkedList<Station> lineThreeStations = new LinkedList<>();
        LinkedList<Station> lineShinStations = new LinkedList<>();

        for(Station station: stations){
            getLineTwoStations(station, lineTwoStations);
            getLineThreeStations(station, lineThreeStations);
            getLineShinStations(station, lineShinStations);
        }

        lineStations.add(lineTwoStations);
        lineStations.add(lineThreeStations);
        lineStations.add(lineShinStations);

        return lineStations;
    }

    public static void getLineTwoStations(Station station, List<Station> lineTwoStations){
        String stationName = station.getName();

        if (stationName.equals(StationType.EDUCATION_UNIVERSITY.getStation())) {
            lineTwoStations.add(station);
        }
        if (stationName.equals(StationType.GANGNAM.getStation())) {
            lineTwoStations.add(station);
        }
        if (stationName.equals(StationType.YEOKSAM.getStation())) {
            lineTwoStations.add(station);
        }
    }

    public static void getLineThreeStations(Station station, List<Station> lineThreeStations){

        String stationName = station.getName();

        if (stationName.equals(StationType.EDUCATION_UNIVERSITY.getStation())) {
            lineThreeStations.add(station);
        }
        if (stationName.equals(StationType.NAMBU_BUS_TERMINAL.getStation())) {
            lineThreeStations.add(station);
        }
        if (stationName.equals(StationType.YANGJAE.getStation())) {
            lineThreeStations.add(station);
        }
        if (stationName.equals(StationType.MAEBONG.getStation())) {
            lineThreeStations.add(station);
        }


    }

    public static void getLineShinStations(Station station, List<Station> lineShinStations){
        String stationName = station.getName();

        if (stationName.equals(StationType.GANGNAM.getStation())) {
            lineShinStations.add(station);
        }
        if (stationName.equals(StationType.YANGJAE.getStation())) {
            lineShinStations.add(station);
        }
        if (stationName.equals(StationType.YANGJAE_CITIZENS_FOREST.getStation())) {
            lineShinStations.add(station);
        }
    }
}
