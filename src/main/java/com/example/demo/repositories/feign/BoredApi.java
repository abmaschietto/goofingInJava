package com.example.demo.repositories.feign;

import com.example.demo.models.Activity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
@FeignClient(value = "boredApi", url = "https://www.boredapi.com/api/")
public interface BoredApi {


    @GetMapping(value = "activity")
    public Activity getActivity();
}
