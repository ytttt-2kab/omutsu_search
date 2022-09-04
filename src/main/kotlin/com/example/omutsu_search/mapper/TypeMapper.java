package com.example.omutsu_search.mapper;

import com.example.omutsu_search.model.Type;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
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