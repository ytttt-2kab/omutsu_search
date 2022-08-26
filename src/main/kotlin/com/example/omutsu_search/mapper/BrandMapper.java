package com.example.omutsu_search.mapper;

import com.example.omutsu_search.model.Brand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BrandMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Brand selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Brand> selectAll();
}