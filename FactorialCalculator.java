import java.util.Scanner;

public class FactorialCalculator {
     static long calculateFactorial(long n,long res)
        {
            long result=res;
            if(n>0){
                result=res*n;
                n=n-1;
                System.out.println(res);
                if(n>0)
                {
                     calculateFactorial(n,result);
                   
                
                }
                 return result;
               


            }
            else if(n==0 && res==1)
            {
                res=1;
                return res;
            }
          
           return result;
        }
    public static void main(String[]args)
    {
        long res=1;
        Scanner Obj=new Scanner(System.in);
        //System.out.println("Enter the Number");
       long n=6;
    long result=calculateFactorial(n,res);
       System.out.println(result);

       /*long fact=1;
       if(n>0)
       {
        for(int i=6;i>0;i--)
       {
          fact=fact*i;
       }
       System.out.println(fact);
       }
       else if(n==0)
       {
        System.out.println(1);
       }*/
       
    }
}
