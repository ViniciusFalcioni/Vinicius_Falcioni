package org.diego.utils;

import java.util.Base64;

import org.diego.domain.contracts.IQrCodeTransformer;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Base64Transformer implements IQrCodeTransformer {

    @Override
    public String transform(String emv) {
        String base64 = Base64.getEncoder().encodeToString(emv.getBytes());
        return base64;
    }

}
