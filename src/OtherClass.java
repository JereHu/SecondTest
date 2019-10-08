public class OtherClass {
    public static void main(String[] args){
        SecondTest myObj = new SecondTest(9);
        myObj.hello();
        SecondTest.example();

        SecondTest myObj2 = new SecondTest(8);
        myObj2.x = 300;

        System.out.println(myObj2.z);

    }
}

