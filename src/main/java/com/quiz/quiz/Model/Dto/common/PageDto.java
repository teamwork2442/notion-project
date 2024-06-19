package com.quiz.quiz.Model.Dto.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PageDto {

    private Object data;

    private long totalElements;

    private long totalPage;
}
