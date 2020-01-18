package com.sketchmac.community.dao;

import com.sketchmac.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    // 查询的帖子数据
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // 查询的总数
    // @Param注解用于给参数取别名
    // 如果只有一个参数，并且在<if>里使用，则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);


}
