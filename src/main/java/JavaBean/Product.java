package JavaBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//实体类Product

@Entity//表示该类是实体类，并且使用默认的 orm 规则
public class Product {
    @javax.persistence.Id//用于声明一个实体类的属性映射为数据库的主键列
    @GeneratedValue(strategy = GenerationType.AUTO)//用于标注主键的生成策略，通过strategy 属性指定
    private Long Id;
    private String Name;
    private double Price;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
