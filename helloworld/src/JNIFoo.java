public class JNIFoo {
    static {
       System.loadLibrary("foo"); // Load native library at runtime
                                   // hello.dll (Windows) or libhello.so (Unixes)
    }

    // Declare a native method sayHello() that receives nothing and returns void
    private native void sayHello();

    // Test Driver
    public static void main(String[] args) {
       new JNIFoo().sayHello();  // invoke the native method
    }
}