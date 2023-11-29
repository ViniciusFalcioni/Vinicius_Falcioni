package com.fag.infra.celcoin.dto;

public class CelcoinTokenDTO {
    
    private String acessToken;

    private Integer expiresIn;
    
    private String tokenType;

    

    /**
     * @return String return the acessToken
     */
    public String getAcessToken() {
        return acessToken;
    }

    /**
     * @param acessToken the acessToken to set
     */
    public void setAcessToken(String acessToken) {
        this.acessToken = acessToken;
    }

    /**
     * @return Integer return the expiresIn
     */
    public Integer getExpiresIn() {
        return expiresIn;
    }

    /**
     * @param expiresIn the expiresIn to set
     */
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * @return String return the tokenType
     */
    public String getTokenType() {
        return tokenType;
    }

    /**
     * @param tokenType the tokenType to set
     */
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

}
