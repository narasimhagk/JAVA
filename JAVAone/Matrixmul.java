import java.util.*;
class Matrixmul{
	public static void main(String[] args){
		int[][] a=new int[2][2];
		int[][] b=new int[2][2];
		int[][] c=new int[2][2];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				b[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				for(int k=0;k<2;k++){
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		System.out.print("\n");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(c[i][j]+" " );
			}
			System.out.print("\n");
		}
	}
}