package myproject;

public class Bubblesort {

	public static void main(String[] args) {
		int temp;
		int[]a= {3,5,1,7,2};
		for(int i=0;i<a.length;i++) {
			int flag=0;
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
			}

          }
			if(flag==0) {
				break;
			}
       }
		for(int l=0;l<a.length;l++) {
			System.out.println(a[l]+" ");
		}
    }
  }
