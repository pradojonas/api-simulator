package com.local.mock.optin;

public class OptinRequestDTO {

    private String nomeLayout;
    private String tamLayout;
    private String org;
    private String cartao;
    private String funcao;
    private String pid;
    private String habilitaNfc;
    
    public String getNomeLayout() {
        return nomeLayout;
    }
    public void setNomeLayout(String nomeLayout) {
        this.nomeLayout = nomeLayout;
    }
    public String getTamLayout() {
        return tamLayout;
    }
    public void setTamLayout(String tamLayout) {
        this.tamLayout = tamLayout;
    }
    public String getOrg() {
        return org;
    }
    public void setOrg(String org) {
        this.org = org;
    }
    public String getCartao() {
        return cartao;
    }
    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public String getPid() {
        return pid;
    }
    public void setPid(String pid) {
        this.pid = pid;
    }
    public String getHabilitaNfc() {
        return habilitaNfc;
    }
    public void setHabilitaNfc(String habilitaNfc) {
        this.habilitaNfc = habilitaNfc;
    }
    
}