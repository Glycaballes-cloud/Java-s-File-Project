public class AccessModifiersDemo {
    public static void main(String[] args) {
        Example ex = new Example();

        ex.publicVar = "Heart";
        ex.protectedVar = "Belle";

        ex.setPrivateVar("Knox");

        System.out.println("publicVar : " + ex.publicVar);
        System.out.println("protectedVar : " + ex.protectedVar);
        System.out.println("privateVar : " + ex.getPrivateVar());
    }
}
