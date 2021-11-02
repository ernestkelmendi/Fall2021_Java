package Homework1;

public class File1 {
    public static void main(String... args) {

        // 1. Convert degree Celsius to degree Fahrenheit
        // fT=cT*9/5+32
        // cT=12.7778

        double cTemp = 12.7778;
        double fTemp = (cTemp * 9 / 5 + 32);

        System.out.println (cTemp+"°C (celsius) is equal to="+fTemp+"°F (fahrenheit)");


        // 2. Convert degree Celsius to degree Kelvin
        // kT=cT+273.15
        // cT=12.7778

        cTemp = 12.7778;
        double kTemp = cTemp + 273.15;

        System.out.println (cTemp+"°C (celsius) is equal to="+kTemp+"K (kelvin)");


        // 3. Convert degree Fahrenheit to Celsius
        // cT=(fT-32)*5/9
        // cT=12.7778

        fTemp = 55.00004;
        cTemp = (fTemp - 32) * 5 / 9;

        System.out.println (fTemp+"°F (fahrenheit) is equal to="+cTemp+"°C (celsius)");


        // 4. Convert degree Fahrenheit to Kelvin
        // kT=(fT+459.67)*5/9
        // fT=55.0004

        fTemp = 55.00004;
        kTemp = (fTemp + 459.67) * 5 / 9;

        System.out.println (fTemp+"°F (fahrenheit) is equal to="+kTemp+"K (kelvin)");


        // 5. Convert Kelvin to Celsius
        // cT=kT-273.15
        // kT=285.9278

        kTemp = 285.9278;
        cTemp = kTemp - 273.15;

        System.out.println (kTemp+"K (kelvin) is equal to="+cTemp+"°C (celsius)");


        // 6. Convert Kelvin to Fahrenheit
        // fT=kT*9/5-459.67
        // kT=285.9278

        kTemp = 285.9278;
        cTemp = kTemp * 9 / 5 - 459.67;

        System.out.println (kTemp+"K (kelvin) is equal to="+cTemp+"°F (fahrenheit)");


    }

}
