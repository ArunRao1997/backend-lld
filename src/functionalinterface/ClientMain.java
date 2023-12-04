package src.functionalinterface;

public class ClientMain {
    public static void main(String[] args) {
        FuncInterface fi = new FIImpl();
        fi.foo();

        FuncInterface fi1 = new FuncInterface() {
            @Override
            public void foo() {
                System.out.println("Anonymous Class");
            }
        };
        fi1.foo();
        }
    }
