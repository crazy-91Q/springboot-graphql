package com.mk.graphql.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by crazy_Q on 2019-10-18
 */
@Getter
@Setter
public class Author {
    private Long id;

    private String name;

    private String sex;

    private Date createdTime;

}
