package dev.labs.s3;

class OuterClass {

    int instanceVariable = 0;

    static int classVariable = 0;

    protected class NestedClass{

    }

    private class InnerClass{
        int instanceVarInner = 0;

        static int classVarInner = 0; // JDK 16+
        void methodInnerClass(){
            instanceVariable = 6;

            StaticClass staticRef = new StaticClass();
        }
    }

    private static class StaticClass{
        void methodStaticClass(){
            classVariable = 6;

            OuterClass outerRef = new OuterClass();
            outerRef.instanceVariable = 9;

            OuterClass.InnerClass innerRef = outerRef.new InnerClass();
            innerRef.instanceVarInner = 10;

            InnerClass.classVarInner = 11;

//            InnerClass innerRef = new InnerClass(); // NOT POSSIBLE
        }
    }
}
