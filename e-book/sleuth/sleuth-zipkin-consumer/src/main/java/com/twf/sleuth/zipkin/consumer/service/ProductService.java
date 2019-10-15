package com.twf.sleuth.zipkin.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.twf.sleuth.zipkin.product.api.facade.ProductFacade;

@FeignClient(name="e-book-product")
public interface ProductService extends ProductFacade{

}
