package Parctice03;
import java.util.Scanner;

public class BJ_1018 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		//움직여가며 탐색한 모든 영역의 변경 횟수
		int[] Min = new int[(N-7)*(M-7)];
		
		char[][] Board = new char[N][M];
		
		for(int i = 0; i < N; i++) {
			String temp = sc.next();
			for(int j = 0; j < M; j++) {
				Board[i][j] = temp.charAt(j);
			}
		}
		
		//동서남북 순
		int[] dc = {0, 0, 1, -1};
		int[] dr = {1, -1, 0, 0};
		
		//8*8이 아니라면
		//
		//각각의 영역에 바꿔야할 칸의 갯수를 저장
		
		//8*8크기의 영역을 점진적으로 탐색 -> 0부터 N인덱스 도달할 때까지
		
		for(int i = 0; i <= N-7; i++) {
			for(int j= 0; j <= M-7; j++) {
				//흰색 검은색 칠해야하는 횟수 ==> Min에 기록된 후 초기화
				int w = 0;
				int b = 0;

				for(int k = i; k < i+8; k++){
					for(int h = j; h < j+8; h++) {
						//상하좌우에 본인과 같은 색이 짝수면 유지, 홀수면 체인지
						int count = 0;
						if(Board[k][h] == 'B') {
							//동서남북 탐색
						else {
							Board[k][h];
						}

					}
				}
				Min[i*j] = w+b;
			}
		}
	}
}
