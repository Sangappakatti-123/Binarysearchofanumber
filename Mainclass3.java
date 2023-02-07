package com.jspider.p11;

public class Mainclass3 {
	public static void main(String[] args) {
		int[] a= {1,2,5,6,8,15,35,68,98,145};
		int x=98;
		System.out.println(binarysearch1(a,x));
	}
	public static int binarysearch1(int [] arg,int x){
		int beg=0;int y=0;
		int end=arg.length-1;
		
		for (int i = 0; i < arg.length; i++) {
			int mid=(beg+end)/2;
			if(x==arg[mid]) {
				return mid;
			}
			else if(x>arg[mid]) {
				beg=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return y;
		
	}

}
