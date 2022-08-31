package com.example.omutsu_search.mapper;

import com.example.omutsu_search.model.Size;
import java.util.List;

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