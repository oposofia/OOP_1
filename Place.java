package OOP;

import static java.lang.Math.*;
public class Place {

    int x,y;

    Place(int x, int y){
        this.x = x;
        this.y = y;
    }
    int getX(){
        return this.x;
    }

    int getY(){
        return this.y;
    }

    double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt((Math.pow(x2 - x1, 2)  + Math.pow(y2 - y1, 2)));
    }
}
