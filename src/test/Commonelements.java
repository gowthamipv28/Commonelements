package test;
import java.util.*;
public class Commonelements {

    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        int[] arr1={5,6,7,8};
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr[i]==(arr1[j]))
                {
                    System.out.println("Common elements are:"+(arr[i]));
                }
            }
        }
    }


}
