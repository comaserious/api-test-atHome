package apiPracticeAtHome.string;

import java.util.StringTokenizer;

public class SplitPractice {

    public static void main(String[] args) {

        /*String의 split() 메소드는 따로 서술 하겠다*/

        String str1 = "100/홍길동/서울/기획부";
        String str2 = "200/유관순/ /인사과";
        String str3 = "300/이순신/부산/";

        /*문자열이 일정한 패턴을 통해 구분이 지어 져있을때 이를 구분문자에 따라 문자열을 나누어주는 메소드가 split이다*/

        String[] emp1 = str1.split("/");
        String[] emp2 = str2.split("/");
        String[] emp3 = str3.split("/",-1);            // 가장 뒤에 빈공간이 있다는 것을 보여주기 위해서 -1을 집어넣은것이다
        //문자열 배열을 받을 emp 레퍼런스 변수에 split() 메소드를 통해 하나의 문자열을 4개의 문자열로 나누어 emp 배열에 넣은 것이다

        for(int i=0;i<emp1.length;i++){
            System.out.println("emp1["+i+"] = "+emp1[i]);
        }

        for(int i=0;i<emp2.length;i++){
            System.out.println("emp2["+i+"] = "+emp2[i]);
        }

        for(int i=0;i<emp3.length;i++){
            System.out.println("emp3["+i+"] = "+emp3[i]);
        }

        // 이렇듯 split은 공백을 모두 인식하고 배열에 집어 넣는다

        /*반면에 StringTokenizer 클래스를 이용하게 되면 공백을 무시한다
        * StringTokenizer는 문자열과 구분 문자로 초기화하면서 인스턴스를 생성한다*/

        StringTokenizer st1 = new StringTokenizer(str1,"/");
        StringTokenizer st2 = new StringTokenizer(str2,"/");
        StringTokenizer st3 = new StringTokenizer(str3,"/");

        while(st1.hasMoreTokens()){ // hasMoreTokens() 메소드는 StringTokenizer의 메소드로 초기화된 문자열을 구분문자에 따라 토큰이 존재하면 true 토큰이 존재하지 않으면 false를 반환한다

            System.out.println(st1.nextToken());         //nextToken() 메소드는 StringTokenizeer의 메소드로 토큰단위로 토큰을 반환한다
        }
        System.out.println();

        while(st2.hasMoreTokens()){                  // 보시다 싶이 구분 문자 사이에 공백이 존재하게 되면 hasMoretokens() 메소드가 공백에 의해서 더이상 token을 인식하지 못하고 false를 반환한다
            System.out.println(st2.nextToken());       //그에 따라 유관순이라는 이름까지만 출력하고 더이상 출력을 하지 못한다
        }
        System.out.println();
        while(st3.hasMoreTokens()){
            System.out.println(st3.nextToken());
        }
        System.out.println();

        /*출력값을 봤듯이 StringTokenizer클래스는 공백을 무시하고 출력한다*/

    }
}
