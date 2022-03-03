public class Num
{
    private int value;

    public Num (int update)
    {
        value = update;
    }//Sets up new Num object, storing an initial value

    public int getValue ()
    {
        return value;
    }//Returns the stored integer value

    public void setValue(int update)
    {
        value = update;
    }//Sets the stored value to the newly specified value

    //Compares the object obj to this one
    //Returns -1 if the value of this is less than the value of obj,
    //1 if greater, and - if they are equal
    public int compareTo (Object obj)
    {
        int otherValue = ((Num)obj).getValue();

        if (value < otherValue)
        {
            return -1;
        }
        else if (value > otherValue)
        {
            return 1;
        }
        else
        {
            return 0;
        }//End if and else thing
    }//End compareTo

    public String toString ()
    {
        return value + "";
    }//Returns the stored integer value as a string
}//End class Num
