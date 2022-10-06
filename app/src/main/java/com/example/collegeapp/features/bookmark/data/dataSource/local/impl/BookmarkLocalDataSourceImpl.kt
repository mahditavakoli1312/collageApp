package com.example.collegeapp.features.bookmark.data.dataSource.local.impl

import com.example.collegeapp.features.article.data.dp.dao.BookmarkDao
import com.example.collegeapp.features.bookmark.data.dataSource.local.BookmarkLocalDataSource
import javax.inject.Inject

class BookmarkLocalDataSourceImpl @Inject constructor(
    private val bookmarkDao: BookmarkDao
) : BookmarkLocalDataSource {
    override suspend fun getBookmarks() =
        bookmarkDao.getBookmarkWithArticle().map { bookmarkWithArticle ->
            bookmarkWithArticle.article
        }
}