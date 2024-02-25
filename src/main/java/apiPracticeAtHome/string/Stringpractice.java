package apiPracticeAtHome.string;

public class Stringpractice {

    public static void main(String[] args) {

        /*String 은 굉장히 특이한 자료형이다 사실 참조자료형이기 때문에 근본적으로 변수는 레퍼런스 변수이다 따라서 변수간 비교는
        *  동일객체인지 확인하는 == 연산자만 사용이 가능했던 것이다*/

        /*또한 String은 다른 자료형과는 다르게 변수의 초기화?가 아닌 새로운 인스턴스를 생성하는 방식을 취한다*/

        String str1 = "java";
        String str2 = "java";

        System.out.println(str1 == str2);      // str1 관 str2는 레퍼런스 변수이기 때문에 == 는 동일객체임을 말하는 것이다

        /*String 타입은 "불변객체"라는 특징을 가지고 있다 변수에 새롭게 초기화 할 때마다 새로운 객체를 생성하기 때문에
        *  값을 초기화하게 되면 새로운 주소를 가지게 된다
        * 또한 앞서 봤듯이 같은 값을 즉, 동등객체일 경우 동일한 주소를 가리키게 된다
        * 따라서 동등 객체이면 동일 객체인것이다*/
        System.out.println("str1 의 해시코드 : "+str1.hashCode());
        str1 = "oracle";

        System.out.println("변경된 str1의 해시코드 : "+str1.hashCode());
        str1 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println(str1 == str2);          // 다시 "java"로 바꾸니 동일한 주소를 가진다
        System.out.println(str1 == str3);          // new 연산자로 인스턴스를 생성하게 되면 같은 문자열이라도 다른 주소값을 가지게 된다 (이를 통해서 String은 클래스타입이라는 것을 확인할수 있다)
        System.out.println(str3 == str4);          // 당연히 new 연산자로 인스턴스 했기 때문에 서로 주소가 다를 수 밖에 없다
        System.out.println("=====================equals()==========================");
        /*equals()*/

        System.out.println(str1.equals(str2));           // 동일 관계이기 때문에 당연히 true 가 나온다(동등이자 동일이다)
        System.out.println(str1.equals(str3));          // 주소가 다르기 때문에 false 일거 같지만 true가 출력된다 이를 통해 String 클래스는 euqals() 메소드가 오버라이딩 되었다는 것을 알 수있다
        System.out.println(str3.equals(str4));              //따라서 동일객체가 아닌 동등 객체임에도 true 값이 반환된다


        /*이러한 특징 때문에 메소드 호출에 따른 값이 변하지 않는 특징을 가지고 있다*/

        System.out.println(str1.charAt(1));          // charAT(index) 인덱스넘버에 해당하는 문자를 반환한다

        System.out.println(str1.compareTo(str2));         // 사전식 나열에 따라 같으면 같으면 0 str1이 인자 str2보다 크면 양수 반대 작으면 음수를 반환한다

        System.out.println(str1.compareToIgnoreCase(str2));  // 대/소문자를 무시하고 사전식 나열에 따라 같으면 0 str1이 str2보다 크면 양수 반대로 작으면 음수를 반환한다

        System.out.println(str1.concat(str2));                 // str1 과 str2를 붙인다

        System.out.println(str1.indexOf('r'));                   //앞에서 부터 indexOf()의 인자와 같은 문자의 인덱스번호를 반환한다(같은 문자가 여러개 일경우 가장 앞에 있는 인덱스 번호 반환)

        System.out.println(str1.lastIndexOf('l'));          // 뒤에서부터 lastIndexOf()의 인자와 같은 문자의 인데스번호 반환(같은 문자가 여러개 일경우 가장 큰 인덱스 번호 반환)

        String str5 = "                  space                    ";

        System.out.println("*"+str5+"*");
        System.out.println("*"+str5.trim()+"*");                     // trim() 메소드는 해당 문자열의 공백을 없애준다

        System.out.println(str1.toUpperCase());                    //문자열을 대문자로 바꾼다
        String str6 = "MAXNUM";
        System.out.println(str6.toLowerCase());                    //문자열을 소문자로 바꾼다

        str1 = "hardWork";
        System.out.println(str1.substring(2,5));                //  인덱스 넘버 첫번재 인자 부터 두번째 인덱스 넘버 전까지 (first index <=                 < second indext 이다 !!!!!주의하자

        System.out.println(str1.replace("hard","easy"));     // 문자열에 (target, replacement) 로 문자열의 타겟문자(열)와 그 문자와 바꿀 문자열을 쓰면 된다

        System.out.println(str1.length());                    //당연히 문자열의 길이다

        System.out.println("".isEmpty());                   //문자열의 길이가 0 이면 true 아니면 false



    }
}
