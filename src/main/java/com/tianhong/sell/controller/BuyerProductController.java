package com.tianhong.sell.controller;

//买家商品

import com.tianhong.sell.VO.ProductInfoVO;
import com.tianhong.sell.VO.ProductVO;
import com.tianhong.sell.VO.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @GetMapping("/list")
    public ResultVO list() {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");

        ProductVO productVO = new ProductVO();
        ProductInfoVO productInfoVO = new ProductInfoVO();

        resultVO.setData(Arrays.asList(productVO));
        productVO.setProductInfoVOList(Arrays.asList(productInfoVO));

        return resultVO;
    }
}
