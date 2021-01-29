package by.example.lecture9.nestedclasses;

public class OuterClassWithAnonymousInnerClass {

    private static class StaticInnerClass {
        public void printInfo() {
            System.out.println("static inner class");
        }

        public void printHi() {
            System.out.println("hi!");
        }
    }

    public void print() {

        StaticInnerClass staticInnerClass1 = new StaticInnerClass() {
            @Override
            public void printInfo() {
                super.printInfo();
                System.out.println("anonymous inner class 1");
            }
        };
        staticInnerClass1.printInfo();
        staticInnerClass1.printHi();

        StaticInnerClass staticInnerClass2 = new StaticInnerClass() {
            @Override
            public void printInfo() {
                super.printInfo();
                System.out.println("anonymous inner class 2");
            }
        };
        staticInnerClass2.printInfo();
        staticInnerClass2.printHi();

        Application application = new Application() {
            @Override
            public void nonStaticMethod() {
                super.nonStaticMethod();
            }
        };
        application.nonStaticMethod();

    }

}
