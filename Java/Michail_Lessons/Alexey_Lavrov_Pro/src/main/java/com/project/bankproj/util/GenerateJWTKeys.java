package com.project.bankproj.util;

import com.sun.org.apache.xml.internal.security.algorithms.SignatureAlgorithm;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GenerateJWTKeys {

    public static void main(String[] args) {
        log.info(generateJWTKey());
        log.info(generateJWTKey());
    }

    private static String generateJWTKey() {
        return Encoders.BASE64.encode(
                Keys.secretKeyFor(SignatureAlgorithm.HS512).getEncoded());
    }
}