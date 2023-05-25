package com.solve;


import java.util.Scanner;

class Main11{
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t= Character.toUpperCase(t);

        //1.for문을 사용하여 작성
//        for (int i =0; i<str.length(); i++){
//            if(str.charAt(i)==t) answer++;
//        }
        // charAt(index) : String 문자열을 char 타입으로 변환해준다.
        //Scanner는 char를 받는 함수가 존재하지 않는다. Intnext()와 같은
        // 따라서 String 타입을 charAt()함수를 사용하며 char타입으로 변형하여 사용해야 한다.
        //sc.next() 띄어쓰기와 엔터를 기준으로 입력 받을 값을 구분 
        // sc.nextLine() 줄바꿈을 기준으로 입력 받을 값을 구분

        //2.향상된 for each 문을 사용하여 작성
        for(char x : str.toCharArray()){ 
            // for each 문 에는 배열이나 iterator 속성을 가진 것들만 올 수 있다. 
            // 따라서 toCharArray()을 사용하여 str을 문자 하나하나씩 잘라 배열화 시킴
            if(x ==t){
                answer++;
            }
        }
        return answer;
    }


        public static void main(String[] args) {
            Main11 T = new Main11();
            Scanner kb = new Scanner(System.in);
            String str = kb.next();
            char t = kb.next().charAt(0);
            System.out.println(T.solution(str,t));


        }
    }



//main 메소드와 아닌곳 실행 순서 차이 체크