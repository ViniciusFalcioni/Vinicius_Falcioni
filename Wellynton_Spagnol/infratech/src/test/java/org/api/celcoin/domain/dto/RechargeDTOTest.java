package org.api.celcoin.domain.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class RechargeDTOTest {
    @Test
    void testSetDocument() {
        RechargeDTO rechargeDTO = new RechargeDTO();
        rechargeDTO.setDocument("Document");
        rechargeDTO.setId("42");
        rechargeDTO.setOperatorId(1);
        PhoneDTO phone = new PhoneDTO();
        phone.setCountryCode(3);
        phone.setNumber("42");
        phone.setStateCode(1);
        rechargeDTO.setPhone(phone);
        rechargeDTO.setReceipt("Receipt");
        rechargeDTO.setSuccess(true);
        rechargeDTO.setTransactionId(1L);
        rechargeDTO.setValue(10.0d);
        String actualDocument = rechargeDTO.getDocument();
        String actualId = rechargeDTO.getId();
        Integer actualOperatorId = rechargeDTO.getOperatorId();
        PhoneDTO actualPhone = rechargeDTO.getPhone();
        String actualReceipt = rechargeDTO.getReceipt();
        Long actualTransactionId = rechargeDTO.getTransactionId();
        Double actualValue = rechargeDTO.getValue();
        boolean actualIsSuccessResult = rechargeDTO.isSuccess();
        assertEquals("42", actualId);
        assertEquals("Document", actualDocument);
        assertEquals("Receipt", actualReceipt);
        assertEquals(1, actualOperatorId.intValue());
        assertEquals(10.0d, actualValue.doubleValue());
        assertEquals(1L, actualTransactionId.longValue());
        assertTrue(actualIsSuccessResult);
        assertSame(phone, actualPhone);
    }
}
