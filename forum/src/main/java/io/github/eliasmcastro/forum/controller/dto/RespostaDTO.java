package io.github.eliasmcastro.forum.controller.dto;

import io.github.eliasmcastro.forum.model.Resposta;

import java.time.LocalDateTime;

public class RespostaDTO {

    private Long id;

    private String mensagem;

    private LocalDateTime dataCriacao;

    private String nomeAutor;

    public RespostaDTO(Resposta resposta) {
        this.id = resposta.getId();
        this.mensagem = resposta.getMensagem();
        this.dataCriacao = resposta.getDataCriacao();
        this.nomeAutor = resposta.getAutor().getNome();
    }

    public Long getId() {
        return id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }
}
