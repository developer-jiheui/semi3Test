package com.gdu.semi3.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.gdu.semi3.dto.LeaveUserDto;
import com.gdu.semi3.dto.UserDto;

@Mapper
public interface UserMapper {
  UserDto getUserByMap(Map<String, Object> map);
  LeaveUserDto getLeaveUserByMap(Map<String, Object> map);
  int insertUser(UserDto user);
  int deleteUser(int userNo);
  int insertAccessHistory(Map<String, Object> map);
  int updateAccessHistory(String sessionId);
}
