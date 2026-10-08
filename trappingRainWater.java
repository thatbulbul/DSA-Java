import java.util.*;

public class trappingRainWater {
    public static void rainWater(int barHeight[]){
        int width=1;
        int rightMax[]=new int[7];
        int leftMax[]=new int[7];
        leftMax[0]=barHeight[0];
        //left max
        for(int i=1;i<barHeight.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],barHeight[i]);
        }
        // System.out.println(Arrays.toString(leftMax));
        //right max
        // rightMax[barHeight.length-1]=barHeight[barHeight.length-1];
        rightMax[6]=barHeight[6];
        for(int i=barHeight.length-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],barHeight[i]);
        }
        // System.out.println(Arrays.toString(rightMax));
        
        //find the area of trapped water
        int trappedWater[]=new int[7];
        for(int i=0;i<barHeight.length;i++){
            trappedWater[i]=(Math.min(rightMax[i],leftMax[i])-barHeight[i])*width;
        }
        System.out.println(Arrays.toString(trappedWater));
    }
    public static void main(String args[]){
        int barHeight[]={4,2,0,6,3,2,5};
        rainWater(barHeight);
    }
}
