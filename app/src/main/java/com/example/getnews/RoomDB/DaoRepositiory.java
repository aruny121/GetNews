package com.example.getnews.RoomDB;



import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.getnews.Model.ArticleModel;

import java.util.List;
/**
 * Desc - interface for dao interaction . This file contains the queries to be used to fetch/insert/delete the data
 * in room DataBase .
 * author - Arun yadav
 * email - aruny121@gmail.com
 */
@Dao
public interface DaoRepositiory {


    /**
     * @param headlineModels
     * @return desc - Dao for repository list and build by list
     */
    @Insert
    long[] insertArticle(List<ArticleModel> headlineModels);

    @Query("DELETE FROM News_Headlines_table")
    void deleteAllRepository();

    @Query("SELECT * FROM News_Headlines_table ORDER BY parentid DESC")
    LiveData<List<ArticleModel>> getHeadlinesAll();

}
