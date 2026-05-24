package br.com.keven.springsecurity.dto;

public record LoginResponse( String acessToken, Long expiresIn) {
}
