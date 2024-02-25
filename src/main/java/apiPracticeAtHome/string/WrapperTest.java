package apiPracticeAtHome.string;

public class WrapperTest {

    public static void main(String[] args) {

        /*wrapper 란 기본자료형을 인스턴스화 하는 것을 말한다 어떠한 메소드는 매개변수로 인스턴스를 요구 할 수 있고
        * 따라서 이러한 경우를 위해서 기본 자료형을 인스턴스로 바꾸는 작업을 wrapper라고 한다
        * 기본자료형을 클래스로 감싸는 느낌이라고 생각하면된다*/

        byte bnum =1 ;
        short snum =2;
        int inum = 20;
        long lnum = 22L;

        float fnum = 12.3f;
        double dnum =12.3;

        boolean isTrue = true;

        char ch = 'a';

        Byte b = new Byte(bnum);
        Short s = new Short(snum);
        Integer i = new Integer(inum);         // int 자료형은 풀네임으로 바뀐다
        Long l = new Long(lnum);

        Float f = new Float(fnum);
        Double d = new Double(dnum);

        Character c = new Character(ch);        // char 또한 풀네임으로 바뀐다

        Boolean q = new Boolean(isTrue);
        // 이런식으로 wrapper 클래스르 만드는 것을 boxing이라고 한다

        Integer i1 = 20;                    // 이런식으로 new 연산자없이 인스턴스를 만들면 autoBoxing이라고 한다


        /*boxing이 있다면 반대로 인스턴스 내부에 있는 필드값을 다시 기본 자료형으로 돌려 놓는 것을 unBoxing 이라고 한다*/

        inum = i.intValue();          // i 인스턴스의 필드값을 반환하기 때문에 앞서 배운 getter 접근자 메소드라고 할 수 있다

        bnum = b.byteValue();
        snum = s.shortValue();
        lnum = l.longValue();

        fnum = f.floatValue();
        dnum = d.doubleValue();

        ch = c.charValue();

        isTrue = q.booleanValue();

        /*autoBoxing 이 있다면 autoUnBoxing도 존재한다*/

        int inum1 =25;

        Integer i2 = inum1+4;
        System.out.println(i2.intValue());

        inum1 = i2;

        System.out.println("i2 = " + i2);           // i2값이 25에서 29로 초기화 되었다 이를 통해서 autoUnBoxing을 볼 수 있다

        int integerNum = 20;

        Integer boxingNum1 = new Integer(20);
        Integer boxingNum2 = new Integer(20);

        Integer autoBoxingNum1 = 20;
        Integer autoBoxingNum2 = 20;

        System.out.println("boxingNum1 = " + boxingNum1);     // wrapper 클래스는 toString이 오버라이드 되었음을 알 수 있다

        System.out.println(boxingNum1==boxingNum2);     // 예상 : false new 연산자를 썼기 때문에       , 실제 : false
        System.out.println(boxingNum1.equals(boxingNum2));   // true 값이 나왔기 때문에 동등 객체에서 true가 나왔다 따라서 equals() 메소드는 오버라이딩되었다

        System.out.println(boxingNum1==autoBoxingNum1); //예상: 오토박싱도 인스턴스를 만든것이기 때문에 다른 인스턴스일것이다 false   , 실제 fasle

        System.out.println(autoBoxingNum2== autoBoxingNum1); // 예상 :동일하게 인스턴스 생성 때문에 false    실제 ; true     <=이게 가장 문제다

        /*이렇게 값이 같음에도 어떨때는 주솟값 어떨때는 값을 비교하기 때문에 매우 헷갈린다 이를 방지 하고자 valuseOf() 메소드를 사용한다
        * valueOf() 메소드는 동일한 값이면 동일한 주소값을 보장해주기 때문에 동일객체임을 확신할 수 있다*/

        Integer in1 = Integer.valueOf(123);
        Integer in2 = Integer.valueOf(123);           // 인스턴스 생성없이 바로 쓴것으로 보아 valueOf() 메소드는 static  메소드 이다

        //valueOf() 메소드 해당 메소드 설명란에 들어가면 리턴값이 new Integer(); 이기 때문에 인스턴스를 생성하게 된다
        //다만 같은 값을 초기화 할경우 in1 과 in2의 주소값은 동일하다

        System.out.println(in1 == in2);            //true로 동일한 주소값을 가지고 있다





    }
}
