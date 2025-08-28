public class User {
    private String name;
    private String role;

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public boolean canAdvance() {
        return role.equalsIgnoreCase("Manager") || role.equalsIgnoreCase("Admin");
    }

    public String getName() { return name; }
    public String getRole() { return role; }
}