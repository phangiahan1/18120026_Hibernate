package pojo;
import java.util.Date;
public class users implements java.io.Serializable{
    private int id;
    private String password;
    private String fullName;
    private String email;
    private int type;
    private String diaChi;
    private String phone;
    private String gioitinh;

    public users() {
    }

    public users(int id, String password, String fullName, String email, int type, String diaChi, String phone, String gioitinh) {
        this.id = id;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.type = type;
        this.diaChi = diaChi;
        this.phone = phone;
        this.gioitinh = gioitinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    
}
