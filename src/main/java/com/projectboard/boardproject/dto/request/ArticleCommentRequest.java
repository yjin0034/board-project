package com.projectboard.boardproject.dto.request;

import com.projectboard.boardproject.dto.ArticleCommentDto;
import com.projectboard.boardproject.dto.UserAccountDto;

public record ArticleCommentRequest(Long articleId, String content) {

    public static ArticleCommentRequest of(Long articleId, String content) {
        return new ArticleCommentRequest(articleId, content);
    }

    public ArticleCommentDto toDto(UserAccountDto userAccountDto) {
      return ArticleCommentDto.of(
                articleId,
                userAccountDto,
                content
        );
    }

}
