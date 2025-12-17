package org.java.core.lesson1.exception_inerfaces;

public class ValidationUtils {

    public static double ALCOHOL_NORM = 0.1;

    public static boolean canBuyAlcohol(int age) {
        return age >= 18;
    }

    public boolean canDriveCar(double alcoholCount) {
        return alcoholCount >= ALCOHOL_NORM;
    }

    public static boolean canVisitClub(int age) {
        return age >= 21;
    }
}
