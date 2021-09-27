import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		int result[] = new int[10];
		int i;
		int j;
		System.out.print("10개의 정수데이터 입력 >");
		for(i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		while(true) {
			
			for(int z=0;z<10;z++) {
				result[z]=arr[z];
			}
			
			System.out.println("1 : 선택정렬 ");
			System.out.println("2 : 버블정렬 ");
			System.out.println("3 : 퀵정렬 ");
			System.out.println("4 : 끝 ");
			System.out.print("> ");
			j=sc.nextInt();
			
			System.out.println();
			
			if(j==1) {
				result = Selection_sort(result);
				for(int z=0;z<10;z++) {
					System.out.print(result[z]+" ");
					
				}
				System.out.println();
			}
			else if(j==2) {
				result = Bubble_sort(result);
				for(int z=0;z<10;z++) {
					System.out.print(result[z]+" ");
				}
				System.out.println();
			}
			else if(j==3) {
				Quick_sort(result,0,result.length-1);
				for(int z=0;z<10;z++) {
					System.out.print(result[z]+" ");
				}
				System.out.println();
				
			}
			else if(j==4) {
				System.out.println(" 끝 ");
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다. ");
			}
				
		}
		sc.close();
	}
	public static int[] Selection_sort(int[] arr1) {
		
		int i,j,t;
		
		for(i=0;i<arr1.length-1;i++) {
			for(j=i+1;j<arr1.length;j++) {
				if(arr1[i]>arr1[j]) {
					t=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=t;
				}
			}
//			for(int z=0;z<10;z++) {
//				System.out.print(arr1[z]+" ");
//			}
//			System.out.println();
		}
		
		return arr1;
	}
	public static int[] Bubble_sort(int[] arr2) {
		
		int i,j,t;
		
		for(i=0;i<arr2.length-1;i++) {
			for(j=0;j<arr2.length-i-1;j++) {
				if(arr2[j]>arr2[j+1]) {
					t=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=t;
							
				}
			}
//			for(int z=0;z<10;z++) {
//				System.out.print(arr2[z]+" ");
//			}
//			System.out.println();
		}
		
		return arr2;
	}
	public static void Quick_sort(int[] arr3,int l, int r) {
		
		int pivot, tmp;
		int left,right;
		left=l;
		right=r;
		
		pivot=(left+right)/2;
		
		while(left<=right) {
			while(arr3[left]<arr3[pivot]) {
				left++;
			}
			while(arr3[right]>arr3[pivot]) {
				right--;
			}
			if(left<=right) {
				tmp=arr3[left];
				arr3[left]=arr3[right];
				arr3[right]=tmp;
				left++;
				right--;
			}
		}
		if(l<left-1) {
			Quick_sort(arr3,l,left-1);
		}
		if(r>left) {
			Quick_sort(arr3,left,r);
		}
		
			
	}
	

}
