package chapter4.array;

public class TestIntArray {

	public static void main(String[] args) {
		//TODO int Ÿ���� 1���� �迭�� �����غ� �ϼ��� ����
		
		//int Ÿ���� �迭�� ����
		int[] nums;
		int nums2[] = {100,200,300,400,500,600};
		for (int i : nums2) {
			System.out.println(i);
		}
		System.out.println("�迭���� ���� :" + getSum(nums2));
		
		//�迭�� ����
		nums = new int[3];
		System.out.println(nums.length);
		System.out.println(nums);
		System.out.println(nums[0]);
		//System.out.println(nums[3]);  ArrayIndexOutofBoundsException �߻�
		fillArray(nums);
		
		printArray(nums);
		
	}//main
	//�迭�� ���� ���ؼ� �����ϸ� ��
	public static int getSum(int[] nums2) {
		int sum = 0;
//		for (int i = 0; i < nums2.length; i++) {
//			//sum = sum + nums2[i];
//			sum += nums2[i];
//		}
		for (int value : nums2) {
			sum += value;
		}
		return sum;
	}
	public static void printArray(int[] nums) {
		//������ For Loop ���
		int value = 0;
		for (int i = 0; i < nums.length; i++) {
			value = nums[i];
			System.out.println(value);
		}
		//������ For Loop
		for(int value2 : nums) {
			System.out.println(value2);
		}
		for (int i : nums) {
			System.out.println(i);
		}
	}
	public static void fillArray (int[] nums) {
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
	}
	

}
