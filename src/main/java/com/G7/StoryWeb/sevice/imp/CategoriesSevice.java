package com.G7.StoryWeb.sevice.imp;

import com.G7.StoryWeb.dto.CategoriesDTO;

public interface CategoriesSevice {
    boolean insertCategories(CategoriesDTO categoriesDTO);
    boolean updateCategories(CategoriesDTO categoriesDTO);
}
