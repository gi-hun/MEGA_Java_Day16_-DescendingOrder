/*
 * # �����ϱ�
 * 1. �ε��� 0���� �������� �˻��Ѵ�.
 * 2. ���� ū ���� ã�� ��ȯ�Ѵ�.
 * 3. �ε��� 1�����Ѵ�.
 * 4. [1~3]�� ������ �ݺ��Ѵ�.
 * ��)
 * 10, 50, 30, 40, 80, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 30, 40, 10, 7111��
 * 80, 50, 40, 30, 10, 7
 */
package day_16;

public class ArrayEx33 {
	public static void main(String[] args) {
		int[] score = {7,30,40,50,60,80};
		
		for(int i=0;i<6;i++)
		{
			int max = score[i];
			int count = i;
			
			for(int j=i;j<6;j++)
			{
				if(max<score[j])
				{
					max = score[j];
					count = j;
				}
			}
			
			int temp = score[i];
			score[i] = score[count];
			score[count] = temp;
			//�ݺ��� �ѹ� ���� �ִ밪�� score[0]�� �ִ� ���� �ȴ�
		}
		
		for(int i=0;i<6;i++)
		{
			System.out.print(score[i] +" ");
		}
	}
}
