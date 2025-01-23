package Parctice03;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class BJ_14696 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		int N = sc.nextInt();

		// N회 반복
		for (int j = 0; j < N; j++) {

			// A의 그림 수, A의 그림
			int A_len = sc.nextInt();
			int[] A = new int[A_len];
			int[] A_temp = new int[A_len];
			for (int i = 0; i < A_len; i++) {
				A[i] = sc.nextInt();
			}

			// B의 그림 수, B의 그림
			int B_len = sc.nextInt();
			int[] B = new int[B_len];
			int[] B_temp = new int[B_len];
			for (int i = 0; i < B_len; i++) {
				B[i] = sc.nextInt();
			}
			// 높은 점수 그림 순으로 정렬 => 정렬 후 역순 저장
			Arrays.sort(A);
			Arrays.sort(B);

			int idx = 0;
			for (int i = A_len - 1; i >= 0; i--) {
				A_temp[idx] = A[i];
				idx++;
			}
			idx = 0;
			for (int i = B_len - 1; i >= 0; i--) {
				B_temp[idx] = B[i];
				idx++;
			}
			// 그림 수가 적은 카드의 그림 수만큼 양쪽 비교
			for (int i = 0; i < Math.min(A_len, B_len); i++) {
				if (A_temp[i] == B_temp[i]) {
					if (i == Math.min(A_len, B_len) - 1) {
						if (A_len < B_len) {
							System.out.println("B");
							break;
						} else if (A_len > B_len) {
							System.out.println("A");
							break;
						} else {
							System.out.println("D");
							break;
						}
					}
				} else if (A_temp[i] < B_temp[i]) {
					System.out.println("B");
					break;
				} else {
					System.out.println("A");
					break;
				}
			}
		}
	}
}


