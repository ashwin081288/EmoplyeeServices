package com.durvisha.repository.impl;

import com.durvisha.clientProxy.StoreClientProxy;
import com.durvisha.fallbackFactory.StoreClientFallbackFactory;
import com.durvisha.model.Store;
import com.durvisha.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository("employeeRepository")
public class EmployeeRepositoryImpl implements EmployeeRepository {
    /* @Autowired
     ObjectProvider<StoreClientProxy> storeClientProxy;*/
    @Autowired
    @Qualifier("StoreClientProxy")
    private StoreClientProxy storeClientProxy;
  /*  @Autowired
    @Qualifier("storeClientFallbackFactory")
    private StoreClientFallbackFactory storeClientFallbackFactory;
*/
    @Override
    public ResponseEntity<List<Store>> getStoreClientProxy() {
        return storeClientProxy.getStoreList();
    }
}
