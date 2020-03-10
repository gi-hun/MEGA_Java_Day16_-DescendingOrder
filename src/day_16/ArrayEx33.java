/*
 * # 정렬하기
 * 1. 인덱스 0번이 나머지를 검사한다.
 * 2. 제일 큰 값을 찾아 교환한다.
 * 3. 인덱스 1증가한다.
 * 4. [1~3]을 끝까지 반복한다.
 * 예)
 * 10, 50, 30, 40, 80, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 30, 40, 10, 7111ㄴ
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
			//반복문 한번 돌면 최대값이 score[0]에 최댓값 저장 된다
		}
		
		for(int i=0;i<6;i++)
		{
			System.out.print(score[i] +" ");
		}
	}
}
