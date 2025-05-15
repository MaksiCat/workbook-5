public class Main {
    public static void main(String[] args) {
        Cash cash = new Cash("Emergency Fund", 777);
        System.out.println("Asset Name: " + cash.getName());
        System.out.println("Asset Value: $" + cash.getValue());
    }
}
