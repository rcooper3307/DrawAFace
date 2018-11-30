package com.company;

public class FaceDrawing {
    private String[][] faceFeatures;
    public FaceDrawing(String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }
    void edit(String replace, int row, int column)
    {
        faceFeatures[row][column] = replace;
        System.out.print(faceFeatures[row][column]);
    }
    void fill(String str)
    {
        for(int i = 0; i < faceFeatures.length; i++)
        {
            for(int j = 0; j < faceFeatures[i].length; j++)
            {
                faceFeatures[i][j] = str;
                System.out.print(faceFeatures[i][j]);
            }
            System.out.println();
        }

    }

}
