public class SoftwareFactory {
    public Developer2 createDeveloper(String typeOfDeveloper) throws NoSuchMethodException{
        if(typeOfDeveloper.equals("Python")) {
            return new PythonDeveloper();
        } else if(typeOfDeveloper.equals("Go")){
            return new GoDeveloper();
        } else if(typeOfDeveloper.equals("JS")) {
            return new JSDeveloper();
        } else if(typeOfDeveloper.equals("Java")) {
            return new JavaDeveloper();
        } else if (typeOfDeveloper.equals("Swift")) {
            return new SwiftDeveloper();
        } else {
            throw new NoSuchMethodException();
        }
    }
}