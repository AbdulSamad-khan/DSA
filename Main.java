


class WaterTrap {
      int findMinimum = 0;
    public void totalWater(int arr[]){
 
     int maxLeft = arr[0];
     int maxRight = arr[0];
     
     int water = 0;
     for(int j = 0;j<arr.length;j++){
  
         for(int i = j; i>= 0;i--){
             if(arr[i] > maxLeft){
                 maxLeft = arr[i];
             }
         }

         for(int k = j;k<arr.length;k++){
             if(arr[k] > maxRight){
                 maxRight = arr[k];
             }
         }
         
        int  min = findMinimum(maxLeft, maxRight);
        int result = min - arr[j];
        water+=result;
     }
     System.out.println("Accumalated Water: " + water);
    }
    
    public int findMinimum(int maxLeft, int maxRight){
      
        if(maxLeft < maxRight){
            findMinimum=maxLeft;
        }
        if(maxLeft> maxRight){
            findMinimum=maxRight;
        }
        return findMinimum;
    }
}

public class Main{
    public static void main(String args[]){
     
    int arr [] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    WaterTrap obj1 = new WaterTrap();
    obj1.totalWater(arr);
    }
   
}

