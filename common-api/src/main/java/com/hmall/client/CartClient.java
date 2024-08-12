package com.hmall.client;

import com.hmall.dto.ItemDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

@FeignClient("cart-service")
public interface CartClient {

    @DeleteMapping("/carts")
    void removeByItemIds(@RequestParam("ids")Collection<Long> ids);
}
