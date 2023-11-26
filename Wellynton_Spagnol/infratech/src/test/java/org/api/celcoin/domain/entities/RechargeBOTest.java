package org.api.celcoin.domain.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;

import org.junit.jupiter.api.Test;

class RechargeBOTest {

    @Test
    void testConstructor() {
        UUID id = UUID.randomUUID();
        PhoneBO phone = new PhoneBO(1, 3, "42");

        RechargeBO actualRechargeBO = new RechargeBO(id, 10.0d, "Document", 1, phone, "Receipt", 1L, true);

        assertEquals("Document", actualRechargeBO.getDocument());
        assertEquals("Receipt", actualRechargeBO.getReceipt());
        assertEquals(1, actualRechargeBO.getProviderId().intValue());
        assertEquals(10.0d, actualRechargeBO.getValue().doubleValue());
        assertEquals(1L, actualRechargeBO.getTransactionId().longValue());
        assertTrue(actualRechargeBO.isSuccess());
        assertSame(phone, actualRechargeBO.getPhone());
        assertSame(id, actualRechargeBO.getId());
    }

    @Test
    void testConstructor2() {
        PhoneBO phone = new PhoneBO(1, 3, "42");

        RechargeBO actualRechargeBO = new RechargeBO(null, 10.0d, "foo", 1, phone, "foo", 1L, true);

        assertEquals("foo", actualRechargeBO.getDocument());
        assertEquals("foo", actualRechargeBO.getReceipt());
        assertEquals(1, actualRechargeBO.getProviderId().intValue());
        assertEquals(10.0d, actualRechargeBO.getValue().doubleValue());
        assertEquals(1L, actualRechargeBO.getTransactionId().longValue());
        assertTrue(actualRechargeBO.isSuccess());
        assertSame(phone, actualRechargeBO.getPhone());
    }

    @Test
    void testConstructor3() {
        UUID id = UUID.randomUUID();
        assertThrows(RuntimeException.class,
                () -> new RechargeBO(id, null, "Document", 1, new PhoneBO(1, 3, "42"), "Receipt", 1L, true));

    }

    @Test
    void testConstructor4() {
        UUID id = UUID.randomUUID();
        assertThrows(RuntimeException.class,
                () -> new RechargeBO(id, 10.0d, null, 1, new PhoneBO(1, 3, "42"), "Receipt", 1L, true));

    }

    @Test
    void testConstructor5() {
        UUID id = UUID.randomUUID();
        assertThrows(RuntimeException.class,
                () -> new RechargeBO(id, 10.0d, "", 1, new PhoneBO(1, 3, "42"), "Receipt", 1L, true));

    }

    @Test
    void testConstructor6() {
        assertThrows(RuntimeException.class,
                () -> new RechargeBO(UUID.randomUUID(), 10.0d, "Document", 1, null, "Receipt", 1L, true));

    }

    @Test
    void testHandleSuccess() {
        UUID id = UUID.randomUUID();
        RechargeBO rechargeBO = new RechargeBO(id, 10.0d, "Document", 1, new PhoneBO(1, 3, "42"), "Receipt", 1L, true);
        rechargeBO.handleSuccess("Receipt", 1L);
        assertEquals("Receipt", rechargeBO.getReceipt());
        assertEquals(1L, rechargeBO.getTransactionId().longValue());
        assertTrue(rechargeBO.isSuccess());
    }

    @Test
    void testSetDocument() {
        UUID id = UUID.randomUUID();
        RechargeBO rechargeBO = new RechargeBO(id, 10.0d, "Document", 1, new PhoneBO(1, 3, "42"), "Receipt", 1L, true);
        rechargeBO.setDocument("Document");
        UUID id2 = UUID.randomUUID();
        rechargeBO.setId(id2);
        PhoneBO phone = new PhoneBO(1, 3, "42");

        rechargeBO.setPhone(phone);
        rechargeBO.setProviderId(1);
        rechargeBO.setReceipt("Receipt");
        rechargeBO.setSuccess(true);
        rechargeBO.setTransactionId(1L);
        rechargeBO.setValue(10.0d);
        rechargeBO.handleError();
        String actualDocument = rechargeBO.getDocument();
        UUID actualId = rechargeBO.getId();
        PhoneBO actualPhone = rechargeBO.getPhone();
        Integer actualProviderId = rechargeBO.getProviderId();
        String actualReceipt = rechargeBO.getReceipt();
        Long actualTransactionId = rechargeBO.getTransactionId();
        Double actualValue = rechargeBO.getValue();
        boolean actualIsSuccessResult = rechargeBO.isSuccess();
        assertEquals("Document", actualDocument);
        assertEquals("Receipt", actualReceipt);
        assertEquals(1, actualProviderId.intValue());
        assertEquals(10.0d, actualValue.doubleValue());
        assertEquals(1L, actualTransactionId.longValue());
        assertFalse(actualIsSuccessResult);
        assertSame(phone, actualPhone);
        assertSame(id2, actualId);
    }
}
