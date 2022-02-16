public class Client {

    public static void main(String[] args) {

        JavaDeveloper jj1 = new JavaDeveloperBuilder().setAge(30).setName("Maxim").getDeveloper();

        System.out.println("\n\n" + jj1 + "\n\n");

    }

}
