/*
(Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers.)
*/
public class PE_1_12
{
    public static void main(String[] args)
    {
        System.out.println("The average speed in Kmph is " + (24 * 1.6) / ((1) + (40/60) + (35/3600)));
    }
}
