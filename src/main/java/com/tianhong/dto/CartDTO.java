package com.tianhong.dto;

public class CartDTO {
    // 商品id
    private String productId;
    // 订单数量
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
