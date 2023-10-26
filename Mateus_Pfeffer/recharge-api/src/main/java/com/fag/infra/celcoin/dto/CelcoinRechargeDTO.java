package com.fag.infra.celcoin.dto;

public record CelcoinRechargeDTO(String cpfCnpj, Integer providerId, CelcoinPhoneDTO phone, CelcoinRechargeValueDTO topupData) {
}
