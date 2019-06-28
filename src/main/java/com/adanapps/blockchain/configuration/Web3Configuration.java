package com.adanapps.blockchain.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.SimpleHttpInvokerServiceExporter;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

@Configuration
public class Web3Configuration {

    @Bean
    public Web3j getWeb3Service(){
        return Web3j.build(new HttpService("http://localhost:8000"));
    }
}
