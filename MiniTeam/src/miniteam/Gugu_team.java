package miniteam;

public class Gugu_team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
				//System.out.print(j * i + "\t");
			}
			System.out.println();
	    }
		//1�� ����
		
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.println(sum);
		}
		//총합계
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + j * i + "\t");
				//System.out.print(j * i + "\t");
			}
			System.out.println();
	    }

}
