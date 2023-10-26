package com.fag.infra.celcoin.dto;

public record CelcoinOperatorDTO(Integer category, Integer rechargeType, String name, Integer providerId, Double maxValue, Double minValue) {
}
