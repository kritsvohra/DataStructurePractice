package LogicBuildingProblems_01.easy_problems_2;

import java.util.Map;

public class CalculateDistanceBetweenTwoPoints_5 {

    public static int distanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {

        double distance = Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1,2));
        int roundedDistance = (int) Math.round(distance);
        return roundedDistance;
    }

    public static void main(String[] args) {

        int x1 = -20, y1 = 23, x2 = -15, y2 = 68;
        System.out.println(distanceBetweenTwoPoints(x1, y1, x2, y2));
    }
}
