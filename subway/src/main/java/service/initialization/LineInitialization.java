package service.initialization;

import domain.Line;
import repository.LineRepository;
import type.LineType;

public class LineInitialization {

    public static void initializeLines(){
        LineRepository.addLine(new Line(LineType.TWO.getLine()));
        LineRepository.addLine(new Line(LineType.THREE.getLine()));
        LineRepository.addLine(new Line(LineType.SHINBUNDANG.getLine()));
    }
}
