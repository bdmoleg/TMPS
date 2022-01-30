public class MainCliennt {

    public static void main(String[] args) throws NoSuchMethodException {

/*        JavaDeveloper javadev = new JavaDeveloper();
        // javadev.doCoding();

        PythonDeveloper pydev = new PythonDeveloper();


        // pydev.doCoding();

        PythonDeveloper pydev2 = new PythonDeveloper();

        JSDeveloper jsdev = new JSDeveloper();
        // jsdev.doCoding();


        GoDeveloper godev = new GoDeveloper();*/

        System.out.println("We want some software with tech-stack Java + Go + Swift + Angular\n");


        SoftwareFactory softwarefuture = new SoftwareFactory();
        Developer2 py = softwarefuture.createDeveloper("Python");

        // Developer devs[] = {new JavaDeveloper(), new PythonDeveloper(), new JSDeveloper(), new GoDeveloper()};

        try {
            Developer2 devs[] = {softwarefuture.createDeveloper("Java"), softwarefuture.createDeveloper("Python"),
                    softwarefuture.createDeveloper("JS"), softwarefuture.createDeveloper("Go"),
                    softwarefuture.createDeveloper("Swift")};

            for(int i = 0; i < devs.length; i++) {
                devs[i].doCoding();
            }
            System.out.println();
            for(int i = 0; i < devs.length; i++) {
                devs[i].sayHello();
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } finally {
            System.out.println("No more software for today!");
        }

/*        javadev.doCoding();
        godev.doCoding();
        pydev.doCoding();
        jsdev.doCoding();*/
        System.out.println("\nApp is ready!");

        // Developer2 devdev = new Developer2();

    }

}