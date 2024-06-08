package com.notion.notion.Model.Dto.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseEntityDto{

    private Long id;

    private String name;
}
