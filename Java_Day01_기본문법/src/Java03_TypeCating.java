
public class Java03_TypeCating {
	// 형변환 : 자료형을 바꾸는 행위

	// 1. 묵시적 형변환(자동적) : 작은 자료형 -> 큰 자료형
	int age = 10;
	double age2 = age;
	long age5 = age;

	// 2. 명시적 형변환 : 큰 자료형 -> 작은 자료형
	double age3 = 1000;
	int age4 = (int) age3; // 데이터가 소실 될수 있어서 네가 책임져
}
