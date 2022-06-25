public class Evendig {
public static void main(String[] args) 
{
     int[] arr = {12,345,2,6,7896};
     System.out.print(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            String s = String.valueOf(i);
            int n = s.length();
            if(n % 2 == 0)
            {
                count ++;
            }
        }
        return count;
    }
}