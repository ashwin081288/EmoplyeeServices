package com.durvisha.clientProxy;

import com.durvisha.fallbackFactory.StoreClientFallbackFactory;
import com.durvisha.model.Store;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "STORE-SERVICE", value = "STORE-SERVICE",
        url = "localhost:8086", path = "/api",
        contextId = "StoreClientProxy", qualifier = "StoreClientProxy",
        fallback = StoreClientFallbackFactory.class, primary = true)
public interface StoreClientProxy {
    @GetMapping(value = "/store")
    public ResponseEntity<List<Store>> getStoreList() ;
}