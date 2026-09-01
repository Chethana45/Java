import java.util.Random;

class example31
{
    public static void main(String args[])
    {
        Random rand = new Random();
        int randNum =0;
        while(randNum!=5)
        {
            randNum= rand.nextInt(11);
            System.out.println(randNum);
        }
    }
}