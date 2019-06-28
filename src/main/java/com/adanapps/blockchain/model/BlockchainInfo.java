package com.adanapps.blockchain.model;

import lombok.Data;

import java.math.BigInteger;

@Data
public class BlockchainInfo {
    private int networkId;
    private BigInteger latestBlock;
}
