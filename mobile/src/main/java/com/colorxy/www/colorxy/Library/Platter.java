package com.colorxy.www.colorxy.Library;

import android.graphics.Color;

import java.util.ArrayList;

/**
 * Platter
 * @author  Tobknight
 */
public class Platter implements ColorInterface, PlatterInterface {
    /**
     * Platter list container
     */
    private ArrayList<Color> platter;
    /***/
    private Color colorcreator;

    /**
     * Constructor
     */
    public Platter() {
        platter = new ArrayList<Color>();
        colorcreator = Color.valueOf(0.0f,0.0f,0.0f);
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
     * Add
     *
     * @param element Element
     */
    @Override
    public void add(Object element) {
        if (!(element instanceof Color)) {
            throw new IllegalArgumentException("Invalid Input");
        }
        platter.add((Color) element);
    }

    /**
     * Get
     *
     * @param idx Index
     */
    @Override
    public Object get(int idx) {
        return platter.get(idx);
    }

    /**
     * Exchange element by index in array
     *
     * @param i Element
     * @param j Element
     */
    @Override
    public void exch(int i, int j) {

        if( platter.get(i)==null|| platter.get(j)==null){
            throw new NullPointerException("ぬるぽ");
        }

        Color temp = platter.get(i);
        platter.get(i) = platter.get(j);
        platter.get(j) = temp;
    }

    /**
     * Delete
     *
     * @param idx Index
     */
    @Override
    public void delete(int idx) {
        platter.remove(idx);
    }

    /**
     * Delete All element
     */
    @Override
    public void deleteAll() {
        platter.clear();
    }

    /**
     * Size
     */
    @Override
    public int size() {
        return platter.size();
    }
}
