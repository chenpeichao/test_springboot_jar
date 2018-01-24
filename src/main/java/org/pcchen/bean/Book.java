package org.pcchen.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 测试常量的bean类
 * 配置文件注入常量，通过bean实现
 * Created by ceek on 2018-01-24 20:49.
 */
@Component
@PropertySource(value = {"classpath:config/book.properties"},encoding="utf-8")
public class Book {
    @Value("${book.name}")
    private String name;        //名称
    @Value("${book.price}")
    private Float price;        //价格

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        return price != null ? price.equals(book.price) : book.price == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
