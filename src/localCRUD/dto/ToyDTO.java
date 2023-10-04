package localCRUD.dto;

import java.io.Serializable;

public class ToyDTO implements Serializable {
    public Integer id;
    private String name;
    private String Category;
    private Integer Price;
    private Integer total;

    public ToyDTO(Integer id, String name, String category, Integer price, Integer total) {
        this.id = id;
        this.name = name;
        Category = category;
        Price = price;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ToyDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Category='" + Category + '\'' +
                ", Price=" + Price +
                ", total=" + total +
                '}';
    }
}
