package com.fag.dto;

import com.fag.model.EnumOperation;

import java.math.BigDecimal;

public record EquacaoDTO(BigDecimal value1, BigDecimal value2, EnumOperation operation, BigDecimal result) {
}
