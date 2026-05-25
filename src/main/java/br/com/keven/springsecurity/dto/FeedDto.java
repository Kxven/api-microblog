package br.com.keven.springsecurity.dto;

import java.util.List;

public record FeedDto(List<FeedItemDto> feedIOtem,
                      int page,
                      int pageSize,
                      int totalPages,
                      long totalElements) {
}
