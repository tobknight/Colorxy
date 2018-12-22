package com.colorxy.www.colorxy.Library;

import android.graphics.Color;

import java.util.ArrayList;

/**
 * Library that stores color (Singleton)
 *
 * @author Tobknight
 */
public class ColorLibrary implements ColorInterface {
    /**
     * Instance of Color Library
     */
    private static ColorLibrary instance;

    /**
     * Shelf
     */
    private ArrayList<Color> ColorShelf;


    public static ColorLibrary getInstance() {
        if (instance == null) {
            instance = new ColorLibrary();
        }
        return instance;
    }

    /**
     * Constructor
     */
    private ColorLibrary() {
        ColorShelf = new ArrayList<Color>();
    }

    /**
     * Add color in RGB
     *
     * @param R Red
     * @param G Green
     * @param B Blue
     */
    @Override
    public void addRGB(float R, float G, float B) {

    }

    /**
     * Add color in HSL
     *
     * @param H HUE
     * @param S Saturation
     * @param L Lightness
     */
    @Override
    public void addHSL(float H, float S, float L) {

    }

    /**
     * Add color in HSV
     *
     * @param H HUE
     * @param S Saturation
     * @param V Value
     */
    @Override
    public void addHSV(float H, float S, float V) {

    }

    /**
     * Return List of Color stored in Library
     *
     * @return ArrayList Color
     */
    public ArrayList<Color> getShelf() {
        return ColorShelf;
    }

    public int size() {
        return ColorShelf.size();
    }
}
