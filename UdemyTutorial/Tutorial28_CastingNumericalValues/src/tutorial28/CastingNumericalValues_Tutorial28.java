package tutorial28;

public class CastingNumericalValues_Tutorial28 {
    public static void main(String[] args){

        byte byteValue = 20;
        short shortValue = 345;
        int intValue = 2908;
        long longValue = 678904;
        float floatValue = 345.67f;
        double doubleValue = 677889.8777;

        //casting int to long value
        intValue = (int)longValue;
        System.out.println("int value : " + intValue);
        System.out.println("Integer Maximum Value : " + Integer.MAX_VALUE); // use Integer class method MAX.VALUE to see maximum value of int

        //here does not require casting, since int value is small(32 bits) than long value(64 bits)
        longValue = intValue + 2;
        System.out.println("long value : " + longValue);
        System.out.println();

        //casting float to double value
        floatValue = (float)doubleValue;
        System.out.println("float value is : " + floatValue);

        //here does not require casting, since float value is small(32 bits) than double value(64 bits)
        doubleValue = floatValue + 2;
        System.out.println("double value is : " + doubleValue);

        //we usually need to cast but hence we are using Math.round method we don't need to cast this.
        intValue = Math.round(floatValue); //this will chop the decimal value, you will lose the value.Therefore you need to round to nearest integer.
        System.out.println("int value  : " + intValue);

        //casting does not need need here since int value is small than float value, no need to cast,but here they will add a decimal point at the end
        floatValue = intValue;
        System.out.println(floatValue + "\n");

        //this won't work as we expect it to !!
        //135 is too big for a byte
        byteValue = (byte)1350;
        System.out.println(byteValue);
    }
}