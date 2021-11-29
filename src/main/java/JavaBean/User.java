package JavaBean;

import javax.persistence.Entity;
import javax.persistence.Id;

//实体类User

@Entity//表示该类是实体类，并且使用默认的 orm 规则
public class User {
    @Id//用于声明一个实体类的属性映射为数据库的主键列
    private Long Id;
    private String UserName;
    private String Password;
    private boolean Sex;
    private int Age;
    private double Height;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public boolean getSex() {
        return Sex;
    }

    public void setSex(boolean sex) {
        Sex = sex;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }
}
