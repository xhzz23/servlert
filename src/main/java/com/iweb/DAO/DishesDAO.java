package com.iweb.DAO;


import com.iweb.bean.Dishes;

/**
 * @Author 小火煮粥
 * @date 2023/8/2 11:46
 * @WeChat xhzz211423
 */


public interface DishesDAO {

    boolean addDishes(Dishes dishes);


    boolean updateDishes(Dishes dishes);

    boolean deleteDishes(String did);

    Dishes quaryById(String did);

    Dishes quaryByCaId(String caid);

}
