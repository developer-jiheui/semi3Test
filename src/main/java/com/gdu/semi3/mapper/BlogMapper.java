package com.gdu.semi3.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.gdu.semi3.dto.BlogDto;
import com.gdu.semi3.dto.CommentDto;

@Mapper
public interface BlogMapper {
  int insertBlog(BlogDto blog);
  int getBlogCount();
  List<BlogDto> getBlogList(Map<String, Object> map);
  int updateHit(int blogNo);
  BlogDto getBlogByNo(int blogNo);
  int insertComment(CommentDto comment);
  int getCommentCount(int blogNo);
  List<CommentDto> getCommentList(Map<String, Object> map);
  int insertReply(CommentDto comment);
}
