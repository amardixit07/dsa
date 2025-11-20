public class findifarrsorted {
    static  boolean issorted(int[] arr,int index, String order)
    {
        if(arr.length==index)
        {
            return true;
        }
      
        // logic to find ascending 
        if (order==null){
              if (arr[index]>arr[index-1])
              {
                  order="ascending";

              }
              else if(arr[index]<arr[index-1])
              {
                order ="descending";
              }
        }
        if (order!=null)
        {
            if (order=="ascending")
            {if(arr[index]>arr[index-1])
            {
                return false ;
            }
            

            }
            else
            {
                if (arr[index]<arr[index-1])
                {
                    return false;

                }
              
            }
        }


      return  issorted(arr, index+1, order);
    }
    public static void main(String[] args) {
        int[] arr= {10,90,30,40,50};
        System.out.println(issorted(arr, 1, ""));
        

    }
    
}
