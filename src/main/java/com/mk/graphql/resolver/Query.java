package com.mk.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mk.graphql.entity.Author;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by crazy_Q on 2019-10-18
 */
@Component
public class Query implements GraphQLQueryResolver {

    public List<Author> findAllAuthors() {
        Author author = new Author();
        author.setId(1L);
        author.setName("Bob");
        author.setSex("男");
        author.setCreatedTime(new Date());
        return Arrays.asList(author);
    }
}
