package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id查询对应的套餐id
     *
     * @param dishIds
     * @return
     */
    //select setmeal id from setmeal dish where dish_id in {1,2,3,4}
    List<Long> getSetmealByDishIds(List<Long> dishIds);

    /**
     * 根据菜品id集合批量删除关联的口味数据
     *
     * @param DishIds
     */
    void deleteByDishIds(List<Long> DishIds);

    /**
     * 保存套餐和菜品的关联关系
     *
     * @param setmealDishes
     */
    void insertBatch(List<SetmealDish> setmealDishes);
}