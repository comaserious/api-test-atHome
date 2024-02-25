package apiPracticeAtHome.string;

public class StringBuilderTest {

    public static void main(String[] args) {

        /*앞서 봤듯이 String은 "불변객체"에 의해서 값이 달라지면 다른 인스턴스를 생성하여 메모를 낭비하는 문제를 야기 시킨다
        * 이를 해결하기 위해서 나온것이 StringBuilder 클래스이다
        * StringBuilder 클래스는 String과 달리 값이 달라지더라도 인스턴스를 새로 생성하는 것이 아닌 우리가 아는 방식인
        * 덮어 씌우기를 한다
        * 따라서 메모리의 낭비를 줄일 수 있다 다만
        * String 과 달리 StringBuilder는 원본에도 영향을 끼치게 된다*/

        StringBuilder str1 = new StringBuilder("java");
        StringBuilder str2 = new StringBuilder("java");

        String str3 = "java";

        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);            타입이 다르기 때문에 비교가 불가능하다
        System.out.println(str1.equals(str3));           //Stringbuilder 는 equals() 오버라이딩 하지 않았다 따라서 동일객체가 아닌기 때문에 false를 반환한다

        System.out.println("변경전 str1 : "+str1.hashCode());
        System.out.println(str1.append("oracle"));        // append() 메소드는 합치기 연산과 동일하다
        System.out.println(str1);                           // 메소드 연산후 원본에 영향이 간다

        System.out.println("변경후 str1 : "+str1.hashCode());   // 주소에는 변화가 없다

        System.out.println(str1.delete(0,4));               //substring() 과 마찬가지로 시작 인덱스와 끝나는 인덱스 다음 번호를 적고 그 사이의 문자열을 없앤다
        System.out.println(str1.deleteCharAt(0));         //deleteCharAt(indext)를 통해 해당 인덱스번호의 문자를 없앨수있다

        System.out.println(str2.insert(2,"||"));       // 첫번째 인자 : 삽입할 문자가 들어갈 인덱스 번호 , 두번째 인자 : 삽입할 문자
        // 인덱스 2번이기 때문에 3번째에 || 를 집어넣겠다는 것이다

        System.out.println(str2.reverse());                     //메소드명 그대로 반대로 쓰겠다는 것이다







    }
}
