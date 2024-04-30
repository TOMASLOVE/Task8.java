import java.util.*;
    
public class Task{
    static int cumulativeSum(int n1,int n2, int n3){
        return sumOfANumber(n1)+sumOfANumber(n2)+sumOfANumber(n3);
    }
    static int sumOfANumber(int x){
        int sum = 0;
        for(int a=1;a<=x;a++)
            sum+=a;
        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        System.out.println("the cumulative sum of ("+n1+"+"+n2+"+"+n3+")= "+cumulativeSum(n1,n2,n3));
    }
}
