import { Component, OnInit } from '@angular/core';
import {BlockchainService} from "../services/blockchain.service";
import {Info} from "../model/info";
import {Observable} from "rxjs/index";

@Component({
  selector: 'my-component',
  templateUrl: './my-component.component.html',
  styleUrls: ['./my-component.component.css']
})
export class MyComponentComponent implements OnInit {

  private blockChainService : BlockchainService;
  private info: Info;

  constructor(blockChainService: BlockchainService) {
    this.blockChainService = blockChainService;
  }

  ngOnInit() {
    this.getInfo();
  }

  private getInfo() {
    this.blockChainService.getBlockchainInfo()
      .subscribe(result => this.info = result);
  }



}
