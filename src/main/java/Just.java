import static java.lang.Double.NaN;

public class Just {
    public static void main(String[] args) {
        Object object= 22l;
        System.out.println(9223372036854775807L*9223372036854775807L);
        System.out.println(5.5*5.5);
        long lon = (long) object;
        System.out.println(lon);
        System.out.println(0.00/0.00);
        System.out.println(0.00/0.00);
        System.out.println(NaN);
        System.out.println( Math.sqrt(Math.abs(0)));

    }
}
/*

 if (((a) instanceof String)|((b) instanceof String)|((expected) instanceof String))   {
         stringToDouble(a,b,expected);
         double divDouble = calculator.div(super.a,super.b);
         Assert.assertEquals(divDouble, super.expected);
         } else {
         objectToDouble(a,b,expected);
         double divDouble = calculator.div(super.a, super.b);
         Assert.assertEquals(divDouble, super.expected);*/


/*
    public void objectToDouble(Object aTemp, Object bTemp, Object expectedTemp) {
        a = (double) aTemp;
        b = (double) bTemp;
        expected = (double) expectedTemp;
    }*/
