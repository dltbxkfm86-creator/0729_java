package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	// ����(Varialbe)
	// ������?
	// �޸�(RAM) ������ DATA(VALUE)���� �����ϴ� ����

	// ������ Ư¡
	//
	// 1. ������ �ĺ��ڸ� ����
	// 2. ������ ���ο� ���� �����ؼ� ��� ����
	// 3. �ڷ����� ����������
	// 4. ���������� ��� �޸��� Stack������ �ö�
	// 5. **�ϳ��� ������������ �ϳ��� ���� ������ ������**
	// 6. �ʱ�ȭ�� �ؾ߸� ����� ����
	// 7. �ʱ�ȭ�� �� ���� ����
	// 8. �ڷ����� ũ�Ⱑ ������ ����
	// 9. �ڷ��������� ��ȯ�� ����
	// 10. ����� Scope�ȿ����� ��� ����
	// 11. �������� ���굵 ����

	/*
	 * �迭(Array) : �ϳ��� �迭�� ���� ���� ���� ���� �� ���� ��, "���� �ڷ����� ����"�� ���� �� ���� ����
	 * ����(homogeneous collection)�̶�� ��
	 * 
	 * �ڹٶ�� ��� ��ü�� ����� ������ �ڷᱸ��
	 * 
	 * => �迭�� �� �ε����� ���� ���� ��� index�� '0'���� ����
	 */

	public void method1() {

		// ������ ���� 5���� �����ϰ� �ʱ�ȭ�� �����ؾ���

//		int num1 = 12;
//		int num2 = 13;
//		int num3 = 77;
//		int num4 = 7;
//		int num5 = 4;
//		int array[] = {12,13,77,7,4};
//		
//		int sum = 0;
//		
//		for(int i = 0; i < array.length; i++) {
//			sum += array[i]; 
//		}

		// System.out.println(sum);

		// �迭

		// 1. �迭 ����

		/*
		 * ���� ���� ���
		 * 
		 * �ڷ��� �����ĺ���;
		 * 
		 * �迭 ���� ���
		 * 
		 * 1) �ڷ��� �迭�ĺ���[]; 2) �ڷ���[] �迭�ĺ���; --> �� ����� ����� ��!!
		 * 
		 */

		// ���� ����!
		// int num;

		// �迭 ����!
		// int[] nums;

		// int[] nums = 0;

		// 2. �迭 �Ҵ�

		/*
		 * �迭�� �� ���� ���� ���� �迭�� ũ�⸦ �����ִ� ���� ������ ������ŭ ���� �� ������ �Ҵ��
		 * 
		 * [ ǥ���� ]
		 * 
		 * int[] numbers; // �迭 ���� numbers = new int[5]; // �Ҵ�
		 * 
		 * int[] arr = new int[5]; // ����� ���ÿ� �Ҵ�
		 * 
		 * �迭�� ���� �ڷ����̴�.
		 */

		// int[] nums = new int[2];

		// nums��� ������ �迭�� �����ϰ� 5ĭ �Ҵ�޾ƺ���

		int[] nums = new int[5];

		// 3. �迭�� �� �ε����� �� ����
		/*
		 * [ ǥ���� ]
		 * 
		 * �迭�ĺ���[�ε���] = ��;
		 */

		nums[0] = 15;
		nums[1] = 33;
		nums[2] = 6;
		nums[3] = 2;
		nums[4] = 66;

		// System.out.println(nums);
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
		// ���������� �츮�� �迭�� ����ؼ� ���� �� �ִ� ���� : �ݺ��� ��� ����
	}

	public void methodA() {

		// �迭�� �����غ���

		// 1. �迭���� �� �Ҵ�

		int[] intergers = new int[3]; // 0,1,2
		double[] doubles = new double[2]; // 0,1

		// �迭�ĺ���.length : �迭�� ũ��(����) => ����
		System.out.println(intergers.length);
		System.out.println(doubles.length);

		int i;
		// System.out.println(i); localvariable == �ʱ�ȭ�� �������� ������ ����� �� ����
		i = 1;
		System.out.println(i);
		System.out.println(intergers);
		System.out.println(intergers[i]);
		intergers[0] = 1;
		/*
		 * �⺻�ڷ��� :boolean, char, byte, short, int, long, float, double = > ���� ������ ���� ����
		 * ���� �� ���� : (����) ����
		 *
		 * �����ڷ��� : boolean[], char[], byte[], int[]... String = > �ּҰ��� ��� �ִ� ���� : ����
		 * ����(���۷���) *
		 */

		// ����, A������, B������, C������, �繫��

		String[] KH������������������;

		KH������������������ = new String[5];
		System.out.println("������ �ּ� : " + KH������������������);

		KH������������������[0] = "����";
		KH������������������[1] = "A������";
		KH������������������[2] = "B������";
		KH������������������[3] = "C������";
		KH������������������[4] = "�繫��";

		/*
		 * // C������ ��� //System.out.println(KH������������������[3]);
		 * System.out.println(KH������������������[0]); System.out.println(KH������������������[1]);
		 * System.out.println(KH������������������[2]); System.out.println(KH������������������[3]);
		 * System.out.println(KH������������������[4]);
		 * 
		 * System.out.println("----- �ݺ��� -----");
		 * 
		 * for(int index = 0; index < 5; index++) {
		 * System.out.println(KH������������������[index]); }
		 */

		int number1 = 3;
		int number2 = 3;
		System.out.println(number1 == number2);

		int[] numbers1 = new int[3];
		int[] numbers2 = new int[3];
		System.out.println(numbers1 == numbers2);

		// �����ڷ��������� ==(����� ������) ��� ��
		// �ּҰ��� ���ϱ� ������ ���ϴ� ����� ���� �� ����
		// ���ڿ�.equals("���� ���ڿ�");

		// �ؽ��ڵ� : �ּҰ��� 10����(int����)���·� ��Ÿ�� ��
		System.out.println(numbers1.hashCode());
		System.out.println(numbers2.hashCode());

	}

	public void lotto() {

		// �ζǹ�ȣ������ ver_0.2
		// System.out.println(num);
		int[] numbers = new int[6];
		/*
		 * numbers[0] = (int)(Math.random()*45) +1; numbers[1] = (int)(Math.random()*45)
		 * +1; numbers[2] = (int)(Math.random()*45) +1; numbers[3] =
		 * (int)(Math.random()*45) +1; numbers[4] = (int)(Math.random()*45) +1;
		 * numbers[5] = (int)(Math.random()*45) +1;
		 */
		System.out.print("�ζ� ��ȣ : ");

		/*
		 * for(int i = 0; i<numbers.length; i++) { System.out.print(numbers[i]+ " "); }
		 */

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 45) + 1;
			System.out.print(numbers[i] + " ");
		}

		// Arrays.toString(�迭�ĺ���)
		System.out.println(Arrays.toString(numbers));
	}

	public void methodB() {

		// 5���� ��Ҹ� ���� �� �ִ� String�� �迭�� ���� �� �Ҵ��Ͻÿ�.
		// ���� 5�ѻ�

		// 1. �迭 ���� �� �Ҵ�
		String[] animals = new String[5];

		// 2. �迭 �ε����� ���� ����
		animals[0] = "�����";
		animals[1] = "����";
		animals[2] = "������";
		animals[3] = "��";
		animals[4] = "����";
		// animals[5] = "�䳢"; <-- ���������δ� ������ ����

		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5
		 * out of bounds for length 5 at com.kh.array.Array.methodB(Array.java:246) at
		 * com.kh.array.Run.main(Run.java:10)
		 */

		// at com.kh.array.Array.methodB(Array.java:246)
		// ArrayIndexOutOfBounds
		// �迭�� �ε����� ������ ���

		// at com.kh.array.Run.main(Run.java:10)

		// ���� ���ص� ������ ��
		// 1. ;
		// 2. ���� if
		// 3. �հ� sum
	}

	public void methodC() {

		// ����ڿ��� �� ���� ������ �Է¹޾Ƽ� �Է¹��� ���� �� �ּҰ� ���ϱ�

		// �� �������� �迭�� ������ ���� ����
		// 1. �� �� �̻��� ���� �ڷ����� ���� �ٷ� ��
		// 2. �ٷ� ���� ������ ��Ȯ�ϰ� ������ ���� ��

		// 1) ����ڷκ��� ���� �Է¹޾Ƽ� �迭�� �� �ε����� ����
		Scanner sc = new Scanner(System.in); // �Էµ���
		int[] nums = new int[3]; // �����

		// �迭�� �������� ������ ������ ������ ����
		/*
		 * System.out.println("ù ��° ������ �Է����ּ���"); nums[0] = sc.nextInt();
		 * System.out.println("nums��� �迭�� 0��° �ε����� ���Ե� �� : " + nums[0]);
		 * System.out.println("�� ��° ������ �Է����ּ���"); nums[1] = sc.nextInt();
		 * System.out.println("nums��� �迭�� 1��° �ε����� ���Ե� �� : " + nums[1]);
		 * System.out.println("�� ��° ������ �Է����ּ���"); nums[2] = sc.nextInt();
		 * System.out.println("nums��� �迭�� 2��° �ε����� ���Ե� �� : " + nums[2]);
		 */

		for (int i = 0; i < nums.length; i++) {
			System.out.println((i + 1) + "��° ������ �Է��ϼ���");
			nums[i] = sc.nextInt();
			System.out.println("nums��� �迭�� " + i + "��° �ε��� �� : " + nums[i]);
		}

		System.out.println(Arrays.toString(nums));
		/*
		 * int min = nums[0];
		 * 
		 * if(nums[0] > nums[1]) { min = nums[1]; } else if(nums[1] > nums[2]) { min =
		 * nums[2]; } else if(nums[0] < nums[1]) { min = nums[0]; } else if(nums[0] <
		 * nums[2]) { min = nums[0]; } else { min = nums[2]; }
		 */

		int min = nums[0];
//		
//		if(min > nums[1]) {
//			min = nums[1];
//		}
//		
//		if(min > nums[2]) {
//			min = nums[2];
//		}

		for (int i = 1; i < nums.length; i++) {
			if (min > nums[i]) {
				min = nums[i];
			}
		}

		System.out.println("�迭�� ��� �� ���� ���� �� : " + min);
	}

	public void methodD() {
		/*
		 * �� �� �Ҵ���� �迭�� ũ�⸦ ������ �� ����!
		 */
		String[] name = new String[3];
		name[0] = "��";
		name[1] = "��";
		name[2] = "ö";
		System.out.println(Arrays.toString(name));
		name[2] = "��";
		System.out.println(Arrays.toString(name));
		System.out.println(name.hashCode());

		name = new String[4];
		name[3] = "��";
		System.out.println(Arrays.toString(name)); // �ּҰ��� int�� ��ȯ�ؼ� ������
		System.out.println(name.hashCode());
		// garbage collection

		/*
		 * ������ ���� ������ �迭�� ���� �ð��� ������ G.C�� �˾Ƽ� �������ش�. : �ڵ� �޸� ����
		 * 
		 * �����迭�ĺ��ڿ� �Ҵ縸 ���Ӱ� �Ѵٸ� = > ���� �����ϰ� �ִ� ������ ����� ���ο� �迭�� ����
		 */

		// null : �ƹ��͵� �������� ������ �ǹ��ϴ� ��
		/*
		 * �⺻��
		 * 
		 * ���� = 0 �Ǽ� = 0.0 ���� = ''
		 * 
		 * �����ڷ��� = null
		 * 
		 * �����ڷ������� null�̶�� ���� ���µ� �ּҰ��� �����ϴ°� �׷��� ������
		 * 
		 */

		name = null; // ���� ������� ���� �ʹ�
		System.out.println(name);
		name[0] = "ȫ�浿";
		// ����Ű�� �ִ� ����� null�ε� �ּҰ� ���µ� ��� ������?
	}

	public void methodE() {

		// �׷��� �迭 ��� ��?
		// �׷��� �迭 ���� ��ĳ��?

		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(Arrays.toString(arr));

		// �迭 ���� ����� ���ÿ� ��Ҹ� �����ؼ� �����
		int[] arr1 = new int[] { 10, 20, 30 };
		System.out.println(Arrays.toString(arr));

		int[] arr2 = { 100, 200, 300 };
		System.out.println(Arrays.toString(arr2));

	}

	/*
	 * �迭 ����
	 * 
	 * 1. ���� ����
	 * 
	 * 2. ���� ����
	 */
	public void methodF() {

		int[] origin = { 1, 2, 3, 4, 5 };
		// new int[5];
		// origin[0] = 1; origin[1] = 2; ...
		System.out.println(Arrays.toString(origin));

		// ���� ����� �迭�� ����
		int[] copy = origin;
		System.out.println(Arrays.toString(copy));

		origin[2] = 33;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));

		// ���� ���� => �ּҰ��� �����ϴ� ���̱� ������ ����Ű�� �ִ� ����� ����.

		System.out.println(origin.hashCode());
		System.out.println(copy.hashCode());
	}

	// 2. ���� ����
	public void methodG() {

		int[] origin = { 1, 2, 3, 4, 5 };

		int[] copy = new int[6];
		/*
		 * copy[0] = origin[0]; copy[1] = origin[1]; copy[2] = origin[2]; copy[3] =
		 * origin[3]; copy[4] = origin[4];
		 * 
		 * for(int i = 0; i < origin.length; i++) { copy[i] = origin[i]; }
		 */

		// �迭�� ���� ������ ��� ���� �迭�� ũ�⺸�� ū �迭�� �����ϴ� ��찡 ����

		// ctrl + ����Ű (�� �̵�)
		// ctrl + alt + ����Ű (�ູ��)
		// ctrl + d(�� ����)
		// ctrl + shift + f(�ڵ�����)
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
		
		int[] copy2 = new int[10];
		
		System.arraycopy(origin, 0, copy2, 5, 5);
		System.out.println(Arrays.toString(copy2));
		
		/*
		 * ���̹������� == ù ���ڰ� �빮�� == Ŭ���� / �������̽�
		 * arraycopy() == > SystemŬ����
		 * 
		 * System.arraycopy(���� �迭 �ĺ���, �����迭���� ���縦 ������ �ε���,
		 * 					���纻 �迭 �ĺ���, ���纻 �迭���� ���簡 ���۵� �ε���,
		 * 					������ ����);
		 * 
		 * 
		 * 
		 */
		System.out.println(Arrays.toString(origin));
		// ArraysŬ�������� �����ϴ� copyOf()
		
		int[] copy3 = Arrays.copyOf(origin, 15);
		System.out.println(Arrays.toString(copy3));
		
		int[] copy4 = origin.clone();
		System.out.println(Arrays.toString(copy4));
	}

}
