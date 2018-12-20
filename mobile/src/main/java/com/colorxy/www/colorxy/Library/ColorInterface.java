package com.colorxy.www.colorxy.Library;

/**
 * @author Tobknight
 * @created on 12/20/2018
 * @updated on 12/20/2018
 */
public interface ColorInterface {
    /**
     * Add color in RGB
     *
     * @param R Red
     * @param G Green
     * @param B Blue
     */
    void addRGB(float R, float G, float B);

    /**
     * Add color in HSL
     *
     * @param H HUE
     * @param S Saturation
     * @param L Lightness
     */
    void addHSL(float H, float S, float L);

    /**
     * Add color in HSV
     *
     * @param H HUE
     * @param S Saturation
     * @param V Value
     */
    void addHSV(float H, float S, float V);


}
