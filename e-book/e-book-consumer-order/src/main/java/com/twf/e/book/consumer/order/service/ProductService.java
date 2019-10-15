package com.twf.e.book.consumer.order.service;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.twf.e.book.product.api.facade.ProductFacade;


@FeignClient(name="e-book-product")
public interface ProductService extends ProductFacade{

}
