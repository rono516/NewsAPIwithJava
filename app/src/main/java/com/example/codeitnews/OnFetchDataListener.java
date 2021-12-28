package com.example.codeitnews;

import com.example.codeitnews.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener <NewsAiResponse>{
    void OnFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}
