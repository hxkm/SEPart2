package lms_rozier_convers.core.items;

import lms_rozier_convers.core.geometry.Cuboid;
import lms_rozier_convers.core.library.Location;

import java.util.ArrayList;

/**
 * 16/11/2015.
 * A basic CD.
 */
public class CD extends LibraryItem {
    /**
     * MAIN CONSTRUCTOR
     * @param title
     * @param type
     * @param publisher
     * @param authors
     * @param year
     * @param numberVolume
     * @param borrowable
     * @param shape
     */
    public CD(String title, String type, String publisher, ArrayList<String> authors, int year, int numberVolume, boolean borrowable, Cuboid shape) {
        super(title, type, publisher, authors, year, numberVolume, borrowable, shape);
    }

    /**
     * CONSTRUCTOR
     * @param shape
     */
    public CD(Cuboid shape) {
        super(shape);
    }

    /**
     * CONSTRUCTOR
     */
    public CD() {
        super();
    }

    public CD(String title, String publisher, int year, int numberVolume, boolean borrowable, Location location, Cuboid shape)
    {
        super(title,publisher,year,numberVolume,borrowable,location,shape);
    }

    /**
     * CONSTRUCTOR
     * @param title
     * @param publisher
     * @param year
     * @param numberVolume
     * @param borrowable
     * @param shape
     */
    public CD(String title, String publisher, int year, int numberVolume, boolean borrowable, Cuboid shape) {
        super(title, publisher, year, numberVolume, borrowable, shape);
    }
}
