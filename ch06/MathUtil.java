public class MathUtil {
    public static void main(String[] args) {
        double volume1 = getCargoVolume(10.5, 12.5, 15.5, false);
        System.out.println(volume1);

        double volume2 = getCargoVolume(10.5, 12.5, 15.5, true);
        System.out.println(volume2);
        //int absoluteSum = absolumteSum(10, -20);
       // System.out.println("The Absolute Sum is: " + absoluteSum);

        int absoluteSum = absolumteSum(10, -20 , 2);
        System.out.println("The Absolute Sum is: " + absoluteSum);
    }


    public static double getCargoVolume(double height, double length, double depth, boolean heavyDuty) {
        double volume = 0;

        final double DEFAULT_MATERIAL_THICKNESS = 0.25;
        final int HEAVY_DUTY_MULTIPLIER = 2;

        double materialThickness;

        if (heavyDuty) {
            materialThickness = DEFAULT_MATERIAL_THICKNESS * HEAVY_DUTY_MULTIPLIER;
        } else {
            materialThickness = DEFAULT_MATERIAL_THICKNESS;
        }

        double interiorHeight = height - (2 * materialThickness);
        double interiorLength = length - (2 * materialThickness);
        double interiorDepth = depth - (2 * materialThickness);

        volume = interiorHeight * interiorLength * interiorDepth;


        return volume;
    }

    public static int absolumteSum(int number3, int number4) {
        int absoluteSum = Math.abs(number3 + number4);

        return absoluteSum;
    }

    public static int absolumteSum(int number3, int number4, int number5) {
        int absoluteSum = Math.abs(number3 + number4 + number5);
        return absoluteSum;
    }
}
