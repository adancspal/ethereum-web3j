package com.adanapps.blockchain.controller;

import com.adanapps.blockchain.model.BlockchainInfo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

@RestController
public class BlockchainController {

    Web3j web3Service;
    public BlockchainController(Web3j web3Service) {
        this.web3Service = web3Service;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/api/v1/getInfo")
    public BlockchainInfo getInfo() throws Exception {

        BlockchainInfo bi = new BlockchainInfo();
        bi.setLatestBlock(web3Service.ethBlockNumber().send().getBlockNumber());
        bi.setNetworkId(1111);
        return bi;
    }
}
