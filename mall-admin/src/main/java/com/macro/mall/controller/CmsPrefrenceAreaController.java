package com.macro.mall.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.CmsPrefrenceArea;
import com.macro.mall.service.CmsPrefrenceAreaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 商品优选管理Controller
 * Created by macro on 2018/6/1.
 */
@Controller
@Api(tags = "CmsPrefrenceAreaController", description = "商品优选管理")
@RequestMapping("/prefrenceArea")
public class CmsPrefrenceAreaController {
    @Autowired
    private CmsPrefrenceAreaService prefrenceAreaService;

    @ApiOperation("获取所有商品优选")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CmsPrefrenceArea>> listAll() {
        List<CmsPrefrenceArea> prefrenceAreaList = prefrenceAreaService.listAll();
        return CommonResult.success(prefrenceAreaList);
    }

    public static void main(String[] args) {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        String str = "2020-12-13 09:50:50";
        try {
            String s = sd.format(new Date());
            System.out.println(s);
            Date d = sd.parse(s);
            System.out.println();
            //System.out.println(sd.parse(s));
        }catch (ParseException e){
            e.printStackTrace();
        }




    }
}
