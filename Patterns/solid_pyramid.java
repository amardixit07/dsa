package Patterns;

public class solid_pyramid {
    public static void main(String[] args) {
         int n =4;
        //  // for rows
        //  for(int i = 1; i<=n;i++)
        //  {
        //     // for spaces
        //     for(int j = 1; j<=n-i;j++)
        //     {
        //         System.out.print(" ");
        //     }

        //      for(int k = 1; k<= 2 * i -1;k++)
        //     {
        //         System.out.print("*");
        //     }
        //     // for(int l = 0; l<=i-1;l++)
        //     // {
        //     //     System.err.print("*");
        //     // }
        //     System.out.println();



        //  }
         

        // Reverse pyramid


        // //int n=5 ;
        // for (int i=1; i<=n; i++)
        // {
        //     int j;
        //     for( j=0;j<=i-1;j++ )
        //     {
        //         System.out.print(" ");

                
        //     }
        //     for(int k=1;k<= 2*n-(2*i+1); k++)
        //     {
        //       System.out.print("*");
        //     }
        //     System.out.println();
        // }
   // hollow rectangle 

   for (int i=  1; i<=n;i++)

   {
    for(int col=1; col<=6;col++)
   {
    if(i==1||i==n)
        {
        System.out.print("*" );
    }

    else {
        if (col==1 || col==6)
        {
        System.out.print("*" );

        }
        
        else{

        System.out.print(" " );
            

        }
    }


   }
   System.out.println();

   }
    }
    
}
