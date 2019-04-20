package homework;

import java.util.*;

public class NumList {
	
	public int n;
	public int[] NumList;
	
	public void ScanNumber() {
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		if(n > 0) {
			NumList = new int[n];
		}
		else {
			NumList = new int[0];
		}
		for(int i = 0 ;i < n ;i++) {
			NumList[i]=scan.nextInt();
		}
		scan.close();
	}
	
	public int  GetMax() {
		int MaxNow = 0;
		int NumNow = 0;
		if(n < 0) {
			return -1;
		}
		for(int i = 0 ;i < n ;i++) {
			NumNow += NumList[i];
			if(NumNow > MaxNow) {
				MaxNow = NumNow;
			}
			else if( NumNow < 0) {
				NumNow = 0;
			}
		}
		return MaxNow;
	}
}
