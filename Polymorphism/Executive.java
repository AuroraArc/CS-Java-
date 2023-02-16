public class Executive extends Manager {

    public Executive(String name, double salary, String department) {
        super(name, salary, department);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Executive) {
            Executive executive = (Executive)obj;
            return super.equals(executive);
        }
        return false;
    }
}
