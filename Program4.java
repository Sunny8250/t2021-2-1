import java.util.Scanner;

public class Program_4 {

	public static void main(String[] args) {
		int c1=0, c2=0, c3=0, c4=0, c5=0, c6=0, c7=0, c8=0, c9=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scan.nextInt();
		int a[] = new int [size];
		
		System.out.println("Enter array contents.");
		for(int i=0; i<=a.length-1; i++){
			a[i] = scan.nextInt();
		}
		
		for(int i=0; i<=a.length-1; i++){
			if(a[i]%1 == 0){
				c1++;
			}
			}
			for(int i=0; i<=a.length-1; i++){
			 if(a[i]%2 == 0){
				c2++;
			 }
			}
			for(int i=0; i<=a.length-1; i++){
				if(a[i]%3 == 0){
				c3++;
				}
			}
			for(int i=0; i<=a.length-1; i++){
				if(a[i]%4 == 0){
				c4++;
				}
			}
			for(int i=0; i<=a.length-1; i++){
				if(a[i]%5 == 0){
				c5++;
				}
			}
			for(int i=0; i<=a.length-1; i++){
				if(a[i]%6 == 0){
				c6++;
				}
			}
			for(int i=0; i<=a.length-1; i++){
				if(a[i]%7 == 0){
				c7++;
				}
			}
			for(int i=0; i<=a.length-1; i++){
				if(a[i]%8 == 0){
				c8++;
				}
			}
			for(int i=0; i<=a.length-1; i++){
				if(a[i]%9 == 0){
				c9++;
			}
		}
		
		System.out.println("1:"+c1+", 2:"+c2+", 3:"+c3+", 4:"+c4+", 5:"+c5+", 6:"+c6+", 7:"+c7+", 8:"+c8+", 9:"+c9);
		
	}

}
