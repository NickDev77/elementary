package ru.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 90;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = rubleToDollar(3200);
        System.out.println("3200 rubles are " + dollar + " dollars.");

        float in = 140;
        float expected = 1.4f;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 1.4. Test result : " + passed);

        float inValue = 3200;
        float expectedValue = 35.555557f;
        float outValue = rubleToDollar(inValue);
        boolean passedTest = expectedValue == outValue;
        System.out.println("3200 rubles are 35.555557. Test result : " + passedTest);
    }
}
