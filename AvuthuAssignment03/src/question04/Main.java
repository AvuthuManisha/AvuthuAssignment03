package question04;

public class Main {
    public static void main(String[] args) {
        // Call the static method of the SuperClass
        SuperClass.staticMethod(); // Output: SuperClass static method

        // Call the static method of the SubClass
        SubClass.staticMethod(); // Output: SubClass static method

        // Create an instance of the SubClass
        SubClass subClass = new SubClass();

        // Call the private method of the SuperClass
        // This will not compile as the private method is not visible in the SubClass
        // subClass.privateMethod();

        // Call the private method of the SubClass
        // This will not compile as the private method in the SubClass is not an overridden method
        // subClass.privateMethod();
    }


}
