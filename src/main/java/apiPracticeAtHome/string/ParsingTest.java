package apiPracticeAtHome.string;

public class ParsingTest {

    public static void main(String[] args) {

        /*서로 다른 사람들간에 자료를 송수신하다보면 타입이 내가 원하는 타입이 아닌경우가 있다
        * 이를 내가 원하는 타입으로 번역하기 위해서 parsing을 사용한다
        * parsing은 String 타입을 기본자료형으로 바꾸는 작업과
        * 반대로 기본자료형을 String 타입으로 바꾸는 것을 말한다*/

        /*String 에서 기본 자료형으로*/

        byte bnum = Byte.parseByte("10");    // 역시 parsing 메소드 또한 특별한 호출없이 사용하는 것을 보아 static 메소드이다
        System.out.println("bnum = " + bnum);

        short snum = Short.parseShort("22");

        int inmu = Integer.parseInt("121");

        long lnum = Long.parseLong("121");

        float fnum = Float.parseFloat("1212.2");

        double dnum = Double.parseDouble("-121.2");

        boolean isTrue = Boolean.parseBoolean("true");
        System.out.println("isTrue = " + isTrue);

//        char ch = Character.parseCharacter("a");
        // 문자의 경우 필요가 없다 charAt() 메소드를 이용하면 손쉽게 문자열에서 문자를 뽑아낼수 있기 때문이다

        char ch = "apple".charAt(0);
        System.out.println("ch = " + ch);


        /*기본자료형에서 문자열로
        * 1. valueOf() 메소드로 인스턴스후 toString으로 문자열 반환한기
        * 2. String.valueOf() 를 이용한 방법
        * 3. +"" 을 이용하여 문자열 만들기*/

        /*toString 기법*/

        String b= Byte.valueOf((byte)12).toString();            // <=형변환 하는 이유를 모르겠다
        String s = Short.valueOf((short)123).toString();
        String i = Integer.valueOf(123).toString();
        String l = Long.valueOf(1233L).toString();

        String f=  Float.valueOf(1234.2f).toString();
        String d = Double.valueOf(123.44).toString();

        String q = Boolean.valueOf(true).toString();

        String c = Character.valueOf('d').toString();

        /*String valueOf() 메소드로 바로 넣기*/
        String b1 = String.valueOf(bnum);
        String s1 = String.valueOf(snum);
        String i1 = String.valueOf(inmu);
        String l1 = String.valueOf(lnum);

        String f1 = String.valueOf(fnum);
        String d1 = String.valueOf(dnum);

        String q1 = String.valueOf(isTrue);

        String c1 = String.valueOf(ch);

        /*+"" 문자열 합치기로 문자열 만들기*/

        String str = 123+"" ;


    }
}
