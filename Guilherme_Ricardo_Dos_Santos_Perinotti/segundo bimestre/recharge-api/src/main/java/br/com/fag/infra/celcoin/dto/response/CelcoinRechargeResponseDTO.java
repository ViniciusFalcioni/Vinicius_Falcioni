package br.com.fag.infra.celcoin.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CelcoinRechargeResponseDTO {

  private Integer nsuNameProvider;
  private Integer authentication;
  private CelcoinRechargeReceiptDTO receipt;
  private String settleDate;
  private String createDate;
  private Long transactionId;
  private String urlreceipt;
  private String errorCode;
  private String message;
  private Integer status;

}
