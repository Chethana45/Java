import java.util.Scanner;

class example28
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] a = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter a[" +i +"]: ");
            a[i] = scan.nextInt();
        }
        
        if(size%2==0)
        {
            int mid= size/2;
            System.out.println("Middle elements of the array are "+ a[mid-1] +" and " +a[mid]);
        }
        else
        {
            int mid= size/2;
            System.out.println("Middle element of the array is " +a[mid]);
        }
    }
}