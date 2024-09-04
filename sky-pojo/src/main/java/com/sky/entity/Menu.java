package com.sky.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Menu {
    private Integer menuId;
    private String name;
    private String redirect;
    private String component;
    private String path;
    private Integer parentId;
    private Meta meta;
    private List<Menu> children = new ArrayList<>();
}