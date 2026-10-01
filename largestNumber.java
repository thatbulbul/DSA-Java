public class largestNumber {
//largest
    public static int GreatestNum(int marks[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<marks.length;i++){
            if(marks[i]>largest){
                largest=marks[i];
            }
            if(marks[i]<smallest){
                smallest=marks[i];
            }
        }
        return largest;
    }

    
    public static void main(String args[]){
        int marks[]={99,98,100,12,10,22,46};
        int largest=GreatestNum(marks);
        System.out.println("the largest num is "+largest);
    }
}
