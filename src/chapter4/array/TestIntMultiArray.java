package chapter4.array;

public class TestIntMultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2���� �迭 ����
		int[][] nums;
		int[] nums2 [] = { {10,20},{30,40},{50,60} };
		int nums3 [][];
		
		nums = new int[3][2];
		System.out.println(nums.length); //3
		System.out.println(nums[0].length);  //2
		nums[0][0] = 10;
		nums[0][1] = 20;
		nums[1][0] = 30;
		nums[1][1] = 40;
		nums[2][0] = 50;
		nums[2][1] = 60;
		
		for (int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length;j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println("");

		}
		//2���� �迭�� ���� ���ϼ���
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				sum += arr[i][j];
			}
		}
		System.out.println("�迭�� �� : " + sum);
		System.out.println("�迭�� ��� :" + sum / (float)(arr.length * arr[0].length) );
		
		//String Ÿ���� 2���� �迭
		String[][] names = {
				{"���ⷮ","�����","�輮��","�迵��","������"},
				{"�ڼ���","������","������","������","��â��"},
				{"�����","��ä��","��ȭ��","�Ű���","�Ȼ��"},
				{"�ȿ켱","�̵���","������","������","�弮��"},
				{"������","�ֿ켱","������","����ö","�Կ���"}
		};
		for (int i = 0; i < names.length; i++) {
			for(int j=0; j< names[i].length;j++) {
				System.out.print(names[i][j]+" ");
			}
			System.out.println("");
		}
		
	}

}











