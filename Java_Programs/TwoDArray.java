public class TwoDArray {
    public static void main(String[] args){
        int twoD[][]=new int[10][100];
        int i,j,k=0;
        for(i=0;i<10;i++){
            for(j=0;j<100;j++){
                twoD[i][j]=k;
                k++;
            }
            for(i=0;i<10;i++){
                for(j=0;j<100;j++){
                    System.out.print(twoD[i][j]+" ");
                }
                System.out.println();

            }
        }
    }
    
}
