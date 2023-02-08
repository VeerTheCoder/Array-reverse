import java.util.Scanner;
class Reverse{
	public static void main(String[] args) {
		int ar[],i,j;
		ar=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Elements:");
		for(i=0;i<6;i++)
			ar[i]=sc.nextInt();
		for(i=0,j=5;i<j;i++,j--){
			int t=ar[i];
			ar[i]=ar[j];
			ar[j]=t;
		}
		System.out.println("After Swapping:");
		for(i=0;i<6;i++)
			System.out.print(ar[i]+" ");
	}
}