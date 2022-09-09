package com.example.omutsu_search.mapper;

import com.example.omutsu_search.model.OmutsuPriceData;
import java.util.Date;
import java.util.List;

import com.example.omutsu_search.dto.SearchResultDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OmutsuPriceDataMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    OmutsuPriceData selectByPrimaryKey(@Param("regDate") Date regDate, @Param("janCode") String janCode);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<OmutsuPriceData> selectAll();

    List<SearchResultDto> selectByOmutsuJanList(@Param("omutsuJanList")List<String> omutsuJanList, @Param("regDate") Date regDate);

}