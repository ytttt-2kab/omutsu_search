package com.example.omutsu_search.mapper;

import com.example.omutsu_search.model.OmutsuJan;
import java.util.List;

public interface OmutsuJanMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    OmutsuJan selectByPrimaryKey(String janCode);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<OmutsuJan> selectAll();
}