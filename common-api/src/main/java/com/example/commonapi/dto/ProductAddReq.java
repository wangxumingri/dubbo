package com.example.commonapi.dto;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

public class ProductAddReq implements Serializable {
    @NotNull(message = "商品名称不能为空")
    private String name;
    @NotNull(message = "商品价格不能为空")
    private BigDecimal price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductAddReq{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
