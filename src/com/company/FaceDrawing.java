package com.company;

public class FaceDrawing {
    private String replace;
    private int row;
    private int column;
    private String str;
    private String[][] faceFeatures;
    public FaceDrawing(String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }
    void edit(String replace, int row, int column)
    {
        this.replace = replace;
        this.row = row;
        this.column = column;

    }
    void fill(String str)
    {
        this.str = str;

    }
    String toString()
    {

    }
}
