package com.colorxy.www.colorxy.ColorPicker;

import android.graphics.Color;

/**
 * Digital Color Picker
 *
 * @author Tobknight
 */
public class DigitalColorPicker {

    /**
     * Shape
     */
    private String Shape;

    /**
     * Saturation
     */
    private int saturation;
    /**
     * Lightness
     */
    private int lightness;
    /**
     * Shape: Triangle
     */
    private final static String triangle = "TRIANGLE";
    /**
     * Shape: Square
     */
    private final static String square = "SQUARE";

    /**
     * Constructor
     */
    public DigitalColorPicker(String shape) {
        Shape = shape;

    }

    /**
     * Constructor
     */
    public DigitalColorPicker() {
        Shape = triangle;
    }


    /**
     * @return Color
     */
    public Color getCorlorinforbyTouch() {
        return null;
    }

    public int getSaturation() {
        return saturation;
    }

    public void setSaturation(int saturation) {
        this.saturation = saturation;
    }

    public int getLightness() {
        return lightness;
    }

    public void setLightness(int lightness) {
        this.lightness = lightness;
    }

    /**
     * ColorWheel
     */
    private class ColorWheel {
        /**
         * Hue valuel
         */
        private int HUE;

        /**
         * Constructor
         *
         * @param value HUE VALUE
         */
        public ColorWheel(int value) {
            setHUE(value);
        }

        /**
         * Get Hue
         */
        public int getHUE() {
            return HUE;
        }

        /**
         * Set Hue
         * @param HUE HUE Value
         */
        public void setHUE(int HUE) {
            this.HUE = HUE;
        }
    }

}
