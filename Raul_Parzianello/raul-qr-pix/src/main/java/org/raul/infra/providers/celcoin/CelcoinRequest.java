package org.raul.infra.providers.celcoin;

import java.util.List;

import org.raul.domain.entities.Merchant;

public class CelcoinRequest {
     private String key;
     private String amount;
     private String transactionIdentification;
     private Merchant merchant;
     private List<String> tags;
     private String additionalInformation;
     private Boolean withdrawal;

     public CelcoinRequest(String key, Double amount, String transactionIdentification, Merchant merchant,
               List<String> tags, String additionalInformation, Boolean withdrawal) {
          this.key = key;
          this.amount = String.format("%.2f", amount).replace(",", ".");
          this.transactionIdentification = transactionIdentification;
          this.merchant = merchant;
          this.tags = tags;
          this.additionalInformation = additionalInformation;
          this.withdrawal = withdrawal;
     }

     public String getKey() {
          return key;
     }

     public String getAmount() {
          return amount;
     }

     public String getTransactionIdentification() {
          return transactionIdentification;
     }

     public Merchant getMerchant() {
          return merchant;
     }

     public List<String> getTags() {
          return tags;
     }

     public String getAdditionalInformation() {
          return additionalInformation;
     }

     public Boolean getWithdrawal() {
          return withdrawal;
     }

}
