package com.company;

public class Runner {

    public static void main(String[] args) {
	// write your code here
        String[][] face = new String[8][11];
        FaceDrawing face1 = new FaceDrawing(face);

        face1.fill("-");
        face1.edit(" ",0, 0);
        face1.edit(" ",7,10);
        face1.edit(" ",0,10);
        face1.edit(" ",7,0);
        face1.edit(" ",1,1);
        face1.edit(" ",1,2);
        face1.edit(" ",1,3);
        face1.edit(" ",1,4);
        face1.edit(" ",1,5);
        face1.edit(" ",1,6);
        face1.edit(" ",1,7);
        face1.edit(" ",1,8);
        face1.edit(" ",1,9);
        face1.edit(" ",2,1);
        face1.edit(" ",2,5);
        face1.edit(" ",2,9);
        face1.edit(" ",3,1);
        face1.edit(" ",3,2);
        face1.edit(" ",3,3);
        face1.edit(" ",3,4);
        face1.edit(" ",3,5);
        face1.edit(" ",3,6);
        face1.edit(" ",3,7);
        face1.edit(" ",3,8);
        face1.edit(" ",3,9);
        face1.edit(" ",4,1);
        face1.edit(" ",4,2);
        face1.edit(" ",4,4);
        face1.edit(" ",4,5);
        face1.edit(" ",4,6);
        face1.edit(" ",4,8);
        face1.edit(" ",4,9);
        face1.edit(" ",5,1);
        face1.edit(" ",5,2);
        face1.edit(" ",5,3);
        face1.edit(" ",5,7);
        face1.edit(" ",5,8);
        face1.edit(" ",5,9);
        face1.edit(" ",6,1);
        face1.edit(" ",6,2);
        face1.edit(" ",6,3);
        face1.edit(" ",6,4);
        face1.edit(" ",6,5);
        face1.edit(" ",6,6);
        face1.edit(" ",6,7);
        face1.edit(" ",6,8);
        face1.edit(" ",6,9);
        System.out.print(face1);


    }
}
