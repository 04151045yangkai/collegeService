package com.how2java.mapper;


import com.how2java.pojo.Category;

import java.util.List;

public interface CategoryMapper {
 
      
    public int add(Category category);
       
      
    public void delete(int id);  
       
      
    public Category loginById(int id);  //登陆
     
      
    public int update(Category category);   
       
      
    public List<Category> list();
      
}