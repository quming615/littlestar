package com.unicom.star.serviceimpl;

import com.unicom.star.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("TestServiceImpl")
public class TestServiceImpl implements TestService {

    @Value("${token}")
    private String token;

    @Value("${AppID}")
    private String clientId;

    @Value("${API_Key}")
    private String clientSecret;

    @Override
    public String getAllProtiters() {
        return "===clientId"+clientId+"===token"+token+"clientSecret"+clientSecret;
    }
}
