package com.example.arcadeplatformer;

import java.util.ArrayList;

public class Mask {
    //2D array of  X Y MaskPoint
    private int x_size;
    private int y_size;
    private MaskPoint[][] points;
    Mask(int x_size,int y_size){
        //propogate point matrix with defaualt point vals
        this.x_size=x_size;
        this.y_size=y_size;
        points= new MaskPoint[x_size][y_size];
        for (int i=0;i<x_size;i++){
            for (int j=0;j<y_size;j++){
                points[i][j]=new MaskPoint();
            }
        }
    }
    MaskPoint getPoint(int x,int y){
        return points[x][y];
    }
    void setPoint(int x,int y,MaskPoint maskPoint){
        points[x][y]=maskPoint;
    }
    void fill(int chanel){
        //set chanel index of maskval to true for all mask points in this matrix
        for (int i=0;i<x_size;i++){
            for (int j=0;j<y_size;j++){
                points[i][j].maskVals[chanel]=true;
            }
        }
    }
}
