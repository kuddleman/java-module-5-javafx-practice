package sample;

import javafx.scene.shape.Line;
@FunctionalInterface
public interface LineInfoDisplayer {

    String getInfo(Line line);

    public static enum InfoType {
        DISTANCE, MIDPOINT, VERTHORZ;
    }

    public static LineInfoDisplayer createLineInfoDisplayer(InfoType type) {
        //  YOUR CODE HERE!
//        switch(type) {
//            case DISTANCE: return //TODO;
//            case MIDPOINT: return //TODO;
//            case VERTHORZ: return //TODO;
//        }


        return null;
    }

}
