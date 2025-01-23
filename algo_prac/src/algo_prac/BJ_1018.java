package BJ;
import java.util.Scanner;

public class BJ_1018 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int result = 0;
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
		int[] dr = {0, 0, 1, -1};
		int[] dc = {1, -1, 0, 0};
		
		//8*8이 아니라면
		//
		//각각의 영역에 바꿔야할 칸의 갯수를 저장
		
		//8*8크기의 영역을 점진적으로 탐색 -> 0부터 N인덱스 도달할 때까지
		
		for(int i = 0; i < N-7; i++) {
			for(int j= 0; j < M-7; j++) {
				//흰색 검은색 칠해야하는 횟수 ==> Min에 기록된 후 초기화
				int w = 0;
				int b = 0;

				for(int k = i; k < i+8; k++){
					for(int h = j; h < j+8; h++) {
						//상하좌우에 본인 포함 같은 색이 짝수면 유지, 홀수면 체인지
						
						int count = 0;
						if(Board[k][h] == 'B') {
							 count++;
							//현 위치가 B, 동서남북 탐색
							for(int d = 0; d < 4; d++) {
								//모서리 아닌 부분
								if(0 <= k+dr[d]&&k+dr[d]<N&&0<=h+dc[d]&&h+dc[d] < M) {
									if(Board[k+dr[d]][h+dc[d]] == 'B') {
										count++;
									}
								}
							}
							//컬러 체인지 여부
							if(count%2!=0||count == 0) {
								w++;
							}
						}
						else {
							count++;
							//현 위치가 W, 동서남북 탐색
							for(int d = 0; d < 4; d++) {
								//모서리 아닌 부분
								if(0 <= k+dr[d]&&k+dr[d]<N&&0<=h+dc[d]&&h+dc[d] < M) {
									if(Board[k+dr[d]][h+dc[d]] == 'W') {
										count++;
									}
								}
							}
							//컬러 체인지 여부
							if(count%2!=0) {
								b++;
							}
						}
						System.out.printf("%d\n", count);
					}
				}
				System.out.printf("%d %d\n", w, b);
				Min[i*j] = w+b;
			}
		}
		for(int i = 0; i < (N-7)*(M-7); i++) {
			System.out.println(Min[i]);		
			}
		//System.out.println(result);
	}
}
