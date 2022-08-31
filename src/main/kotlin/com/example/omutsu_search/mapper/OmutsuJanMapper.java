package com.example.omutsu_search.mapper;

import com.example.omutsu_search.model.OmutsuJan;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface OmutsuJanMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    OmutsuJan selectByPrimaryKey(String janCode);

    List<OmutsuJan> selectById(@Param("brand_id") int brand_id, @Param("type_id") int type_id, @Param("size_id") int size_id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<OmutsuJan> selectAll();
}