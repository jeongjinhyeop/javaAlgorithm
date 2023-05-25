package com.solve;




import java.util.Scanner;


class Main112 {
    public String solution(int n,String str) {// 문자하나를 사용할 때에는 char사용하네
        String answer = "";
        char[] c =str.toCharArray();

        String str1 = "";
        for (int i =0; i<str.length(); i++) {
            if (i==0){
                str1 += c[i];

            }else if (i%7==1 && i>0){

                str1+=c[i];
            }else if (i%7==6 && i>0){
                str1+=c[i];
                str1=str1.replace("#","1");
                str1=str1.replace("*","0");
                //int a =Integer.parseInt(str1);
                int b = Integer.valueOf(str1,2);//valueOf(String,n진수) n진수->10진수
                //String strb = new String();
                //Character.toChars(b).toString();
                //System.out.println(Character.toChars(b));// 아스키코드를 char 타입으로 변형하는 코드 --> 구지 이렇게 할 필요 없음 (char)str1;
                char[] c1 = Character.toChars(b);
                //String str2 = Arrays.toString(Character.toChars(b));
                String str2=String.valueOf(c1);
                //System.out.println(str2+"str2");
                answer+= str2;
                str1="";

            }else {
                str1 += c[i];
            }
        }

        //System.out.println(str1);

        //answer+=str1;
        //ToCharArray()해서 인덱스 0~6 까지담고 문자를 숫자로 변환시키고 2진수를 10진수로 변환시키고
        return answer;
    }


    public static void main(String[] args) {
        Main112 T = new Main112();
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        String str = kb.next();
        //char c = kb.next().charAt(0);//charAt이란 String 타입을 char타입으로 변환해주는 메서드
        System.out.print(T.solution(n,str));
        //엔터눌러서 입력받기?
        //ex)4
        //   ########

    }
}

// 2번째 풀이
//class Main {
//    public String solution(int n,String s) {// 문자하나를 사용할 때에는 char사용하네
//        String answer = "";
//        for (int i =0; i<n; i++) {//n이 4이므로 4번 반복
//            String tmp= s.substring(0,7).replace('#','1').replace('*','1');
//            int num = Integer.parseInt(tmp,2);
//            answer+=(char)num; // --> 숫자를 char타입으로 변경하면 아스키코드 번호에 해당 문자 출력
//            s= s.substring(7);//subString을 이용하여 시작 인덱스를 7로 설정하여 매번 인덱스 7전의 단어는 잘리게 된다.
//        }
//        return answer;
//    }
//
//
//    public static void main(String[] args) {
//        com.Practice.Main T = new com.Practice.Main();
//        Scanner kb = new Scanner(System.in);
//        int n =kb.nextInt();
//        String str = kb.next();
//        System.out.print(T.solution(n,str));
//    }
//}
//전략
//1.length가 7인 String배열을 생성
//1-1 7자씩 들어가도록 설정..?
//2.#==>1 , *==>0으로 replace
//3. 2진수 ->10진수(2^n n을 반복문으로 돌리면 되지 않을까)  --> String값을 int값으로 변환후 2진수에서 10진수로 변경하여 해결
// int a = Integer.valueOf(st1,2);
//4.answer += Character.charAt(아스키코드);

//문제푸는데 오래걸린이유
//마지막에 char 타입을 String로 변형해줘야했음
//intellij에서는 안바꿔도 실행되던데?
// 조심해야할듯
//String->char   ,char->String 정리해보기