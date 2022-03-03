public class NumDriver
{
    public static void main (String[] args)
    {
        System.out.println ("Alexa Torres, Classwork 5.3");
        System.out.println ();

        Num someNum = new Num (20);
        Num otherNum = new Num (24);
        Num diffNum = new Num (26);

        System.out.println (someNum + ", " + otherNum + ", " + diffNum);

        System.out.println (someNum.compareTo(otherNum));
        System.out.println (otherNum.compareTo(otherNum));
        System.out.println (diffNum.compareTo(otherNum));
    }//End main method
}//End class NumDriver
