// Source https://docs.oracle.com/javase/tutorial/java/javaOO/examples/ShadowTest.java

package dev.labs.s3;

public class ShadowTest {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }

    public static void main(String... args) {
        ShadowTest st = new ShadowTest(); // OuterClass
        ShadowTest.FirstLevel fl = st.new FirstLevel(); // InnerClass
        fl.methodInFirstLevel(23);
    }
}
