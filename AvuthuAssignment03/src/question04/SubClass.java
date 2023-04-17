package question04;

public class SubClass extends SuperClass {
    // This is a new static method, not an overridden method
    public static void staticMethod() {
        System.out.println("SubClass static method");
    }

    // This is a new private method, not an overridden method
    private void privateMethod() {
        System.out.println("SubClass private method");
    }

}
