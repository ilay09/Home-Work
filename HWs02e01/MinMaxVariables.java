package minmaxvariables;


public class MinMaxVariables {

    
    public static void main(String[] args) {
       byte maximumByte = Byte.MAX_VALUE;
        short maximumShort = Short.MAX_VALUE;
        int maximumInteger = Integer.MAX_VALUE;
        long maximumLong = Long.MAX_VALUE;
        
        float maximumFloat = Float.MAX_VALUE;
        double maximumDouble = Double.MAX_VALUE;
        
       byte minimumByte = Byte.MIN_VALUE;
        short minimumShort = Short.MIN_VALUE;
        int minimumInteger = Integer.MIN_VALUE;
        long minimumLong = Long.MIN_VALUE;
        
        float minimumFloat = Float.MIN_VALUE;
        double minimumDouble = Double.MIN_VALUE;
        
        System.out.println("Byte "
                           + maximumByte + " " + minimumByte);
        System.out.println("Short "
                           + maximumShort + " " + minimumShort);
        System.out.println("Integer "
                           + maximumInteger + " " + minimumInteger);
        System.out.println("Long "
                           + maximumLong + " " + minimumLong);
 
        System.out.println("Float "
                           + maximumFloat + " " + minimumFloat);
        System.out.println("Double "
                           + maximumDouble + " " + minimumDouble);
 
    }
}
