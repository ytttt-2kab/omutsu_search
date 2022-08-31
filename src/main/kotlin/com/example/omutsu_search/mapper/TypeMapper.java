package com.example.omutsu_search.mapper;

import com.example.omutsu_search.model.Type;
import java.util.List;

public interface TypeMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Type selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Type> selectAll();
}