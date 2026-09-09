public class AdvPatterns {
    //Hollow Rectangle
    public static void hollowRectangle(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1||i==4||j==1||j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
           System.out.println();
        }
    }

    //Inverted Half Pyramid
    public static void invertedHalfPyramid(int tolRow, int tolCol){
        for(int i=1;i<=tolRow;i++){
            for(int j=1;j<=tolCol;j++){
                if((i+j)>4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Floyd's Triangle
    public static void floydTriangle(int tolRow, int tolCol){
        int count=1;
        for(int i=1;i<=tolRow;i++){
            for(int j=1;j<=tolCol;j++){
                if((i+j)>tolCol){
                System.out.print(count+" ");
                count++;
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        // hollowRectangle();
        int tolRow=5;
        int tolCol=4;
        // invertedHalfPyramid(tolRow, tolCol);
        floydTriangle(tolRow, tolCol);

    }
}
