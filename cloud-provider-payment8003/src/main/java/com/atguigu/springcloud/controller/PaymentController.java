package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.*;
import com.google.gson.Gson;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
    //public CommonResult create(Payment payment){
        paymentService.create(payment);
        return new CommonResult(200,"插入success",payment);
    }
    @DeleteMapping( value = "/payment/delete/{id}")
    public CommonResult delete(@PathVariable("id") Long id){
        //public CommonResult create(Payment payment){
        paymentService.delete(id);
        return new CommonResult(200,"删除success",1);
    }

    @PutMapping(value = "/payment/update")
    public CommonResult update(@RequestBody Payment payment){
        //public CommonResult create(Payment payment){
        paymentService.update(payment);
        return new CommonResult(200,"修改success",1);
    }
    @GetMapping(value="/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        return new CommonResult(200,"查询消息见右：",payment);
    }

    @GetMapping(value="/payment/list")
    public CommonResult list(){
        List<Payment> paymentList = paymentService.list();
        Gson gson = new Gson();
        String paymentListJson = gson.toJson(paymentList);
        return new CommonResult(200,"查询消息见右：",paymentListJson);
    }

}
