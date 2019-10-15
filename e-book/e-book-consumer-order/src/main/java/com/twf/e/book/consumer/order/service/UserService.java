package com.twf.e.book.consumer.order.service;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.twf.e.book.user.api.facade.UsertFacade;


@FeignClient(name="e-book-user")
public interface UserService extends UsertFacade{

}
