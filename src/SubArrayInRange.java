import java.util.Scanner;

public class SubArrayInRange {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println("enter start index: ");
        int start=scanner.nextInt();
        System.out.println("enter end index ");
        int end=scanner.nextInt();
        findSubarryRange(array,size,start,end);
    }
    public static void findSubarryRange(int array[],int size,int start,int end)
    {
        for(int i=start;i<=end;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
