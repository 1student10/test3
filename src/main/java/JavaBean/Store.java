package JavaBean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity//表示该类是实体类，并且使用默认的orm规则
public class Store {
    @Id//用于声明一个实体类的属性映射为数据库的主键列
    private Long Id;
    private String StoreName;
    private String URL;//网址

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String storeName) {
        StoreName = storeName;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
