package homework;


public class MainWay {

	public static void main(String[] args) {
		 NumList alist = new NumList();
		 alist.ScanNumber();
		 if(alist.n < 0) {
			 System.out.println("�������");
			 return;
		 }
		 for(int  i = 0;i < alist.n; i++) {
			 System.out.print(alist.NumList[i]+" ");
		 }
		 System.out.println("����������е�ֵΪ��"+alist.GetMax());

	}

}
