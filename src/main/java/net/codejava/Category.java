package net.codejava;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="categories")
public class Category {
    @Id
    private Integer cid;
    @Column(length = 15, nullable = false, name="name")
    private String categoryName;
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cid=" + cid +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}


