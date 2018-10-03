package l.com.ldk.duykhanh.bestui.MODEL;

public class User {

    private int id;
    private String username;
    private String password;
    private String phone;
    private String fullname;

    public User() {
    }

    public User(String username, String password, String phone, String fullname) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.fullname = fullname;
    }

    public User(int id, String username, String password, String phone, String fullname) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.fullname = fullname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
