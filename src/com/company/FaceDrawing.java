package com.company;

public class FaceDrawing {
    private String[][] faceFeatures;
    public FaceDrawing(String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }
    void edit(String replace, int row, int column)
    {
     this.faceFeatures[row][column] = replace;
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

}
