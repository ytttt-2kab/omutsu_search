package com.example.omutsu_search.mapper;

import com.example.omutsu_search.model.Size;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SizeMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Size selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Size> selectAll();
}