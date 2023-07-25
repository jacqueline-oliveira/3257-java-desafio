package br.com.alura.tabelafipe.service;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);
}
