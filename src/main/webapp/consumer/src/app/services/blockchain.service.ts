import { Injectable } from '@angular/core';
import {HttpClient } from '@angular/common/http';
import { Info} from "../model/info";
import {Observable} from "rxjs/index";

@Injectable({
  providedIn: 'root'
})
export class BlockchainService {

  private http: HttpClient;

  constructor(httpClient: HttpClient) {
    this.http = httpClient;
  }

  public getBlockchainInfo(): Observable<Info>{
    return this.http
      .get<Info>("http://localhost:8080/api/v1/getInfo");
  }
}
