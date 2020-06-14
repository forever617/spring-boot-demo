package com.leo.studentManager.dao;

import com.leo.studentManager.entity.Achievement;
import java.util.List;

public interface AchievementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Achievement record);

    Achievement selectByPrimaryKey(Integer id);

    List<Achievement> selectAll();

    int updateByPrimaryKey(Achievement record);
}