package com.tianhong.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Data
public class OrderMaster {

    // 订单ID
    private String orderId;

    // 买家姓名
    private String buyerName;

    // 买家手机号
    private String buyerPhone;

    // 买家地址
    private String buyerAddress;

    // 买家微信Openid
    private String buyerOpenid;

    // 订单总金额
    private BigDecimal orderAmount;

    // 订单状态， 默认为新下单
    private Integer orderStatus = 0;


}
