package com.example.vmac.WatBot;

import java.io.Serializable;

public class RetornoVO implements Serializable {

    private String result;
    private String protocolo;
    private String conversation_id;
    private String dialog_stack_atual;
    private String intencao;
    private float confianca;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getConversation_id() {
        return conversation_id;
    }

    public void setConversation_id(String conversation_id) {
        this.conversation_id = conversation_id;
    }

    public String getDialog_stack_atual() {
        return dialog_stack_atual;
    }

    public void setDialog_stack_atual(String dialog_stack_atual) {
        this.dialog_stack_atual = dialog_stack_atual;
    }

    public String getIntencao() {
        return intencao;
    }

    public void setIntencao(String intencao) {
        this.intencao = intencao;
    }

    public float getConfianca() {
        return confianca;
    }

    public void setConfianca(float confianca) {
        this.confianca = confianca;
    }
}
