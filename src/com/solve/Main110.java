package com.solve;

import java.util.Scanner;


class Main110 {
    public int[] solution(String str,char c) {// 문자하나를 사용할 때에는 char사용하네
        int[] answer = new int[str.length()];
        int p = 1000;
        for (int i =0; i< str.length(); i++){// i<=str.length(); 로 하면 인덱스가 하나를 초과하는 현상 발생 인덱스는 0부터시작 length는 1부터시작
            if (str.charAt(i)==c){
                p=0;
                answer[i]=p;
            }else {
                p++;
                answer[i]=p;
            }
        }
        p=1000;//초기화 해놨어야했는데 안했음
        for (int i =str.length()-1; i>=0; i--){
            if (str.charAt(i)==c){
                p=0;
                // answer[0]=p;// 이 코드가 필요 없는 이유 해당 인덱스의 문자가 같으면 위에서 이미 0을 넣어놨으니까 p값만 0만들어주면된다.
            }else {
                p++;
                answer[i]=Math.min(p,answer[i]);
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        Main110 T = new Main110();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);//charAt이란 String 타입을 char타입으로 변환해주는 메서드
        for (int x : T.solution(str,c)) {
            System.out.print(x+" ");
        }
    }
}
//replace 에는 정규식을 사용할 수없다
//replace 에는 정규식을 사용할 수 있다.  정규식이란 ?
//replaceAll("[^A-Z]",""); 알파벳이 아니면(^ 부정표시) 공백으로
//char형을 String 과 비교하기 위해서는  c ='변수' 해야한다. ""는 불가능 (char c)