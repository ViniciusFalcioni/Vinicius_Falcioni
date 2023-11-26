package org.api.celcoin.domain.mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;

import org.api.celcoin.domain.dto.PhoneDTO;
import org.api.celcoin.domain.dto.RechargeDTO;
import org.api.celcoin.domain.entities.PhoneBO;
import org.api.celcoin.domain.entities.RechargeBO;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class RechargeMapperTest {
    /**
     * Method under test: {@link RechargeMapper#toBO(RechargeDTO)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testToBO() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Invalid UUID string: 42
        //       at java.base/java.util.UUID.fromString1(UUID.java:280)
        //       at java.base/java.util.UUID.fromString(UUID.java:258)
        //       at org.api.celcoin.domain.mappers.RechargeMapper.toBO(RechargeMapper.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        PhoneDTO phone = new PhoneDTO();
        phone.setCountryCode(3);
        phone.setNumber("42");
        phone.setStateCode(1);

        RechargeDTO dto = new RechargeDTO();
        dto.setDocument("Document");
        dto.setId("42");
        dto.setOperatorId(1);
        dto.setPhone(phone);
        dto.setReceipt("Receipt");
        dto.setSuccess(true);
        dto.setTransactionId(1L);
        dto.setValue(10.0d);
        RechargeMapper.toBO(dto);
    }

    /**
     * Method under test: {@link RechargeMapper#toBO(RechargeDTO)}
     */
    @Test
    void testToBO2() {
        PhoneDTO phone = new PhoneDTO();
        phone.setCountryCode(3);
        phone.setNumber("42");
        phone.setStateCode(1);

        RechargeDTO dto = new RechargeDTO();
        dto.setDocument("Document");
        dto.setOperatorId(1);
        dto.setPhone(phone);
        dto.setReceipt("Receipt");
        dto.setSuccess(true);
        dto.setTransactionId(1L);
        dto.setValue(10.0d);
        dto.setId(null);
        RechargeBO actualToBOResult = RechargeMapper.toBO(dto);
        PhoneBO phone2 = actualToBOResult.getPhone();
        assertEquals("42", phone2.getNumber());
        assertEquals("Document", actualToBOResult.getDocument());
        assertEquals("Receipt", actualToBOResult.getReceipt());
        assertEquals(1, phone2.getStateCode().intValue());
        assertEquals(1, actualToBOResult.getProviderId().intValue());
        assertEquals(10.0d, actualToBOResult.getValue().doubleValue());
        assertEquals(1L, actualToBOResult.getTransactionId().longValue());
        assertEquals(3, phone2.getCountryCode().intValue());
        assertTrue(actualToBOResult.isSuccess());
    }

    /**
     * Method under test: {@link RechargeMapper#toBO(RechargeDTO)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testToBO3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: Campo obrigatório - Document
        //       at org.api.celcoin.domain.entities.RechargeBO.validate(RechargeBO.java:47)
        //       at org.api.celcoin.domain.entities.RechargeBO.<init>(RechargeBO.java:27)
        //       at org.api.celcoin.domain.mappers.RechargeMapper.toBO(RechargeMapper.java:19)
        //   See https://diff.blue/R013 to resolve this issue.

        PhoneDTO phone = new PhoneDTO();
        phone.setCountryCode(3);
        phone.setNumber("42");
        phone.setStateCode(1);

        RechargeDTO dto = new RechargeDTO();
        dto.setDocument(null);
        dto.setOperatorId(1);
        dto.setPhone(phone);
        dto.setReceipt("Receipt");
        dto.setSuccess(true);
        dto.setTransactionId(1L);
        dto.setValue(10.0d);
        dto.setId(null);
        RechargeMapper.toBO(dto);
    }

    /**
     * Method under test: {@link RechargeMapper#toBO(RechargeDTO)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testToBO4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: Campo obrigatório - Document
        //       at org.api.celcoin.domain.entities.RechargeBO.validate(RechargeBO.java:47)
        //       at org.api.celcoin.domain.entities.RechargeBO.<init>(RechargeBO.java:27)
        //       at org.api.celcoin.domain.mappers.RechargeMapper.toBO(RechargeMapper.java:19)
        //   See https://diff.blue/R013 to resolve this issue.

        PhoneDTO phone = new PhoneDTO();
        phone.setCountryCode(3);
        phone.setNumber("42");
        phone.setStateCode(1);

        RechargeDTO dto = new RechargeDTO();
        dto.setDocument("");
        dto.setOperatorId(1);
        dto.setPhone(phone);
        dto.setReceipt("Receipt");
        dto.setSuccess(true);
        dto.setTransactionId(1L);
        dto.setValue(10.0d);
        dto.setId(null);
        RechargeMapper.toBO(dto);
    }

    /**
     * Method under test: {@link RechargeMapper#toBO(RechargeDTO)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testToBO5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: Campo obrigatório - Value
        //       at org.api.celcoin.domain.entities.RechargeBO.validate(RechargeBO.java:43)
        //       at org.api.celcoin.domain.entities.RechargeBO.<init>(RechargeBO.java:27)
        //       at org.api.celcoin.domain.mappers.RechargeMapper.toBO(RechargeMapper.java:19)
        //   See https://diff.blue/R013 to resolve this issue.

        PhoneDTO phone = new PhoneDTO();
        phone.setCountryCode(3);
        phone.setNumber("42");
        phone.setStateCode(1);

        RechargeDTO dto = new RechargeDTO();
        dto.setDocument("Document");
        dto.setOperatorId(1);
        dto.setPhone(phone);
        dto.setReceipt("Receipt");
        dto.setSuccess(true);
        dto.setTransactionId(1L);
        dto.setValue(null);
        dto.setId(null);
        RechargeMapper.toBO(dto);
    }

    /**
     * Method under test: {@link RechargeMapper#toDTO(RechargeBO)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testToDTO() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.api.celcoin.domain.dto.PhoneDTO.getStateCode()" because "dto" is null
        //       at org.api.celcoin.domain.mappers.PhoneMapper.toBO(PhoneMapper.java:9)
        //       at org.api.celcoin.domain.mappers.RechargeMapper.toBO(RechargeMapper.java:16)
        //   See https://diff.blue/R013 to resolve this issue.

        RechargeMapper.toDTO(RechargeMapper.toBO(new RechargeDTO()));
    }

    /**
     * Method under test: {@link RechargeMapper#toDTO(RechargeBO)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testToDTO2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.api.celcoin.domain.dto.PhoneDTO.getStateCode()" because "dto" is null
        //       at org.api.celcoin.domain.mappers.PhoneMapper.toBO(PhoneMapper.java:9)
        //       at org.api.celcoin.domain.mappers.RechargeMapper.toBO(RechargeMapper.java:16)
        //   See https://diff.blue/R013 to resolve this issue.

        RechargeBO bo = RechargeMapper.toBO(new RechargeDTO());
        bo.setId(null);
        RechargeMapper.toDTO(bo);
    }

    /**
     * Method under test: {@link RechargeMapper#toDTO(RechargeBO)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testToDTO3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.api.celcoin.domain.dto.PhoneDTO.getStateCode()" because "dto" is null
        //       at org.api.celcoin.domain.mappers.PhoneMapper.toBO(PhoneMapper.java:9)
        //       at org.api.celcoin.domain.mappers.RechargeMapper.toBO(RechargeMapper.java:16)
        //   See https://diff.blue/R013 to resolve this issue.

        RechargeBO bo = RechargeMapper.toBO(new RechargeDTO());
        bo.setId(UUID.randomUUID());
        RechargeMapper.toDTO(bo);
    }

    /**
     * Method under test: {@link RechargeMapper#toDTO(RechargeBO)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testToDTO4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.api.celcoin.domain.entities.RechargeBO.getId()" because "bo" is null
        //       at org.api.celcoin.domain.mappers.RechargeMapper.toDTO(RechargeMapper.java:25)
        //   See https://diff.blue/R013 to resolve this issue.

        RechargeMapper.toDTO(null);
    }

    /**
     * Method under test: {@link RechargeMapper#toDTO(RechargeBO)}
     */
    @Test
    void testToDTO5() {
        UUID id = UUID.randomUUID();
        RechargeDTO actualToDTOResult = RechargeMapper
                .toDTO(new RechargeBO(id, 10.0d, "Document", 1, PhoneMapper.toBO(new PhoneDTO()), "Receipt", 1L, true));
        assertEquals("Document", actualToDTOResult.getDocument());
        assertEquals("Receipt", actualToDTOResult.getReceipt());
        PhoneDTO phone = actualToDTOResult.getPhone();
        assertNull(phone.getCountryCode());
        assertNull(phone.getStateCode());
        assertNull(phone.getNumber());
        assertEquals(1, actualToDTOResult.getOperatorId().intValue());
        assertEquals(10.0d, actualToDTOResult.getValue().doubleValue());
        assertEquals(1L, actualToDTOResult.getTransactionId().longValue());
        assertTrue(actualToDTOResult.isSuccess());
    }

    /**
     * Method under test: {@link RechargeMapper#toDTO(RechargeBO)}
     */
    @Test
    void testToDTO6() {
        UUID id = UUID.randomUUID();
        RechargeDTO actualToDTOResult = RechargeMapper
                .toDTO(new RechargeBO(id, 10.0d, "Document", 1, PhoneMapper.toBO(new PhoneDTO()), "Receipt", 1L, false));
        assertEquals("Document", actualToDTOResult.getDocument());
        assertEquals("Receipt", actualToDTOResult.getReceipt());
        PhoneDTO phone = actualToDTOResult.getPhone();
        assertNull(phone.getCountryCode());
        assertNull(phone.getStateCode());
        assertNull(phone.getNumber());
        assertEquals(1, actualToDTOResult.getOperatorId().intValue());
        assertEquals(10.0d, actualToDTOResult.getValue().doubleValue());
        assertEquals(1L, actualToDTOResult.getTransactionId().longValue());
        assertFalse(actualToDTOResult.isSuccess());
    }

    /**
     * Method under test: {@link RechargeMapper#toDTO(RechargeBO)}
     */
    @Test
    void testToDTO7() {
        UUID id = UUID.randomUUID();
        RechargeBO bo = RechargeMapper.toBO(RechargeMapper
                .toDTO(new RechargeBO(id, 10.0d, "Document", 1, PhoneMapper.toBO(new PhoneDTO()), "Receipt", 1L, true)));
        bo.setId(null);
        RechargeDTO actualToDTOResult = RechargeMapper.toDTO(bo);
        assertEquals("Document", actualToDTOResult.getDocument());
        assertEquals("Receipt", actualToDTOResult.getReceipt());
        PhoneDTO phone = actualToDTOResult.getPhone();
        assertNull(phone.getCountryCode());
        assertNull(phone.getStateCode());
        assertNull(phone.getNumber());
        assertNull(actualToDTOResult.getId());
        assertEquals(1, actualToDTOResult.getOperatorId().intValue());
        assertEquals(10.0d, actualToDTOResult.getValue().doubleValue());
        assertEquals(1L, actualToDTOResult.getTransactionId().longValue());
        assertTrue(actualToDTOResult.isSuccess());
    }
}
