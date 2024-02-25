package apiPracticeAtHome.object;

public class Application {
    public static void main(String[] args) {

    Book book1 =new Book("홍길동전","허균",50000);
    Book book2 = new Book("홍길동전","허균",50000);

    // toString 메소드를 오버라이딩 하기 전에는 레퍼런스변수 book1과 book2는 각각의 인스턴스 주소를 가지고 있다

        System.out.println(book1 == book2);        //toString 을 오버라이딩 하기 전에는 서로 다른것을 알 수 있다

        //해당 클래스에서 Object 클래스의 toString() 메소드를 오버라이딩하게 되면 컴파일러가 자동으로 해당 클래스의 필드값을 String 타입으로 반환하는 메소드로 오버라이딩 해준다

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        // toString 오버라이딩하기 전에는 해당 클래스의 인스턴스화의 주소를 반환해준다 이는 묵시적 명시적 동일하기 때문에 레퍼런스 변수만 넣어주면 되었다

        System.out.println(book1);
        System.out.println(book2);
        /*toString을 오버라이딩한 후 다시 runtime을 해보면 toString을 명시적, 암묵적 모두 오버라이딩한 toStrig한 해당 필드값을 String 타입으로 반환하는 것을 볼수 있다
        * 하지만 여전히 book1 와 book2의 비교연산자는 두 레퍼런스변수의 주소값을 비교하고 있기에 값은 false를 도출한다*/

        /* == 는 동일하다라는 것을 보여주는 연산자이다
        * 여기서 동일하다와 동등하다의 개념을 이해해야한다
        *  동일객체 : 주소값이 같다
        *  동등객체 : 데이터가 같다
        * 따라서 주소값이 아닌 내용물이 같은지 확인하고 싶을때가 당연히 많을 수 밖에 없다 이를 해결하기 위해서 equals() 메소드를 오버라이딩하는 것이다*/

        System.out.println(book1.equals(book2));
        /*equals() 메소드 역시 오버라이딩 하기 전에는 동일한지 아닌지를 확인 하는 메소드 이기 때문에 book1.equals(book2)는 false 를 반환한다 하지만 다시 Book클래스에
        * 돌아가 Object 클래스의 equals()메소드를 오버라이딩하게 되면 동일 객체가 아닌 동등객체를 확인하는 메소드로 재정의하게 된다*/

        /*equals() 메소드를 재정의후 다시 runtime 하게 되면 equals() 메소드의 값이 true로 반환하는 것을 확인할수 있다*/

        System.out.println(book1 == book2 );
        // 하지만 여전히 주소값은 다르기 때문에 동일 관계를 확인하는 비교연산자 == 는 false를 반환한다

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        /*그렇다면 왜 hashCode() 메소드의 값은 동일하게 나오는가?
        그 이유는 equals()메소드르 재정의하면서 hashCode()메소드 역시 동등한 관계인 경우 같은 해시코드값을 반환하도록 재정의 하도록 권장하기 때문에
        hashCode() 메소드또한 그에 따라 재정의 되었다고 볼수 있다
         */




    }
}
