public class thingythingthing{
    public static int quadrant(double x, double y){
        return Math.abs((int)(Math.signum(x)*Math.signum(y)*(1 + (1 - Math.signum(x))/2.0 + (1 - Math.signum(y))/2.0 + (Math.signum(x) + 1)*(1 - Math.signum(y))/2.0)));
    }
    public static boolean isVowel(String l){
        return (l.charAt(0)-97)*(l.charAt(0)-101)*(l.charAt(0)-105)*(l.charAt(0)-111)*(l.charAt(0)-117)==0;
    }
}