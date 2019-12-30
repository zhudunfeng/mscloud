package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaymentDao {
    public void create(Payment payment);

    public Payment getPaymentById(Long id);

    void delete(Long id);

    void update(Payment payment);

    List<Payment> list();
}

