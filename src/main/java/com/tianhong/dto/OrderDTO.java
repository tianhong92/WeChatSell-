package com.tianhong.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tianhong.dataobject.OrderDetail;
import com.tianhong.utils.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

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

    // 订单状态， 默认0为新下单
    private Integer orderStatus;

    // 支付状态， 默认0为未支付
    private Integer payStatus;

    // 创建时间
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    // 更新时间
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    // 订单详情列表
    List<OrderDetail> orderDetailList;
}
