package homework;


public class MainWay {

	public static void main(String[] args) {
		 NumList alist = new NumList();
		 alist.ScanNumber();
		 if(alist.n < 0) {
			 System.out.println("输入错误！");
			 return;
		 }
		 for(int  i = 0;i < alist.n; i++) {
			 System.out.print(alist.NumList[i]+" ");
		 }
		 System.out.println("的最大子序列的值为："+alist.GetMax());

	}

}
