package pattern;

public class printing4 {
    public static void main(String[] args) {
       

        for(int c=1;c<=7;c++)
        {
            for (int r=1;r<=5;r++)
            {
                if(c==3 && r==4 )
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print(" . ");
                }
            }
            System.out.println();
             
        }
    
       
    }   }
