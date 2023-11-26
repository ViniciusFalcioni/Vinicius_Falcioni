package org.raul.utils;

import java.util.Base64;

import org.raul.domain.contracts.IQrCodeTransform;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TransformerBase64 implements IQrCodeTransform {

    @Override
    public String transform(String emv) {
        String base64 = Base64.getEncoder().encodeToString(emv.getBytes());
        return base64;
    }

}
