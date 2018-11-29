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
    void edit(String replace, int column, int row)
    {
     this.faceFeatures[this.row][this.column] = this.replace;
    }
    void fill(String str)
    {
        for(int i = 0; i < faceFeatures.length; i++)
        {
            for(int j = 0; j < faceFeatures[i].length; j++)
            {
                faceFeatures[i][j] = str;
            }
            System.out.println();
        }

    }
    String toString()
    {

    }
}
