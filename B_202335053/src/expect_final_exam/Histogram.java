package expect_final_exam;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        int[] num = new int[10];
        int[] hist = {0,0,0,0,0,0,0,0,0,0};

        Scanner in = new Scanner(System.in);

        System.out.println("숫자를 10개 입력하세요.");
        for(int i=0; i< num.length; i++) {
            num[i] = in.nextInt();

            if(num[i]>=0 && num[i]<10) {
                hist[0] ++;
            }
            else if(num[i]>=10 && num[i]<20) {
                hist[1] ++;
            }
            else if(num[i]>=20 && num[i]<30) {
                hist[2] ++;
            }
            else if(num[i]>=30 && num[i]<40) {
                hist[3] ++;
            }
            else if(num[i]>=40 && num[i]<50) {
                hist[4] ++;
            }
            else if(num[i]>=50 && num[i]<60) {
                hist[5] ++;
            }
            else if(num[i]>=60 && num[i]<70) {
                hist[6] ++;
            }
            else if(num[i]>=70 && num[i]<80) {
                hist[7] ++;
            }
            else if(num[i]>=80 && num[i]<90) {
                hist[8] ++;
            }
            else if(num[i]>=90 && num[i]<100) {
                hist[9] ++;
            }
        }


        for(int i=0; i< hist.length; i++) {
            System.out.print((i*10)+"~"+(i*10+9)+":");
            for(int j=0; j<hist[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

//배열 초기화:
//
// int[] num 배열은 사용자로부터 입력받을 10개의 숫자를 저장합니다.
// int[] hist 배열은 입력된 숫자의 범위에 따라 각 구간에 대한 히스토그램 데이터를 저장합니다.
//사용자 입력 및 히스토그램 데이터 수집:
//
//for 루프를 통해 10개의 숫자를 입력받습니다.
//입력된 숫자가 어떤 구간에 속하는지를 조건문을 통해 판별하고, hist 배열의 해당 인덱스에 대한 값을 증가시킵니다.
//히스토그램 출력:
//
//두 번째 for 루프를 통해 hist 배열을 순회하면서 히스토그램을 출력합니다.
//각 구간에 해당하는 범위를 출력한 후에는 해당 구간의 빈도수에 따라 별표(*)를 출력합니다.