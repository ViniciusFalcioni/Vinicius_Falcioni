package org.diego.infra.providers.celcoin;

import java.util.List;

import org.diego.domain.entities.Merchant;

public record CelcoinRequest (
     String key, 
     Double amount, 
     String transactionIdentification, 
     Merchant merchant, 
     List<String> tags, 
     String additionalInformation, 
     Boolean withdrawal

){

}
