public class DemoPrimev4{
    public static void main(String args[]){
        int num=50,flag=0,i,j;
        System.out.println(" The list of prime numbers 2 to 50 ");
        for(i=2;i<=num;i++)
       {
           flag=0;
           for(j=2;j<i;j++)
           {
               if(i%j==0)
               {
                   flag=1;
                   break;
               }
           }
        if(flag==0)
        {
            System.out.print(i+" ");
        }
       }
    }
}