package com.example.collegeapp.core.data

import android.content.Context
import com.example.collegeapp.R
import com.example.collegeapp.features.article.data.ArticleEntity
import javax.inject.Inject

class RecyclerDataTemp @Inject constructor() {
    fun articleList(context: Context): List<ArticleEntity> {
        val resultList = mutableListOf<ArticleEntity>()
        resultList.add(
            ArticleEntity(
                context.getString(R.string.label_fake_title_post),
                R.drawable.background_image,
                context.getString(R.string.label_time_fake),
                context.getString(R.string.label_writer_fake),
                context.getString(R.string.label_tag_fake)
            )
        )
        resultList.add(
            ArticleEntity(
                context.getString(R.string.label_fake_title_post),
                R.drawable.background_image,
                context.getString(R.string.label_time_fake),
                context.getString(R.string.label_writer_fake),
                context.getString(R.string.label_tag_fake)
            )
        )
        resultList.add(
            ArticleEntity(
                context.getString(R.string.label_fake_title_post),
                R.drawable.background_image,
                context.getString(R.string.label_time_fake),
                context.getString(R.string.label_writer_fake),
                context.getString(R.string.label_tag_fake)
            )
        )
        resultList.add(
            ArticleEntity(
                context.getString(R.string.label_fake_title_post),
                R.drawable.background_image,
                context.getString(R.string.label_time_fake),
                context.getString(R.string.label_writer_fake),
                context.getString(R.string.label_tag_fake)
            )
        )
        resultList.add(
            ArticleEntity(
                context.getString(R.string.label_fake_title_post),
                R.drawable.background_image,
                context.getString(R.string.label_time_fake),
                context.getString(R.string.label_writer_fake),
                context.getString(R.string.label_tag_fake)
            )
        )
        resultList.add(
            ArticleEntity(
                context.getString(R.string.label_fake_title_post),
                R.drawable.background_image,
                context.getString(R.string.label_time_fake),
                context.getString(R.string.label_writer_fake),
                context.getString(R.string.label_tag_fake)
            )
        )
        resultList.add(
            ArticleEntity(
                context.getString(R.string.label_fake_title_post),
                R.drawable.background_image,
                context.getString(R.string.label_time_fake),
                context.getString(R.string.label_writer_fake),
                context.getString(R.string.label_tag_fake)
            )
        )
        resultList.add(
            ArticleEntity(
                context.getString(R.string.label_fake_title_post),
                R.drawable.background_image,
                context.getString(R.string.label_time_fake),
                context.getString(R.string.label_writer_fake),
                context.getString(R.string.label_tag_fake)
            )
        )
        resultList.add(
            ArticleEntity(
                context.getString(R.string.label_fake_title_post),
                R.drawable.background_image,
                context.getString(R.string.label_time_fake),
                context.getString(R.string.label_writer_fake),
                context.getString(R.string.label_tag_fake)
            )
        )
        resultList.add(
            ArticleEntity(
                context.getString(R.string.label_fake_title_post),
                R.drawable.background_image,
                context.getString(R.string.label_time_fake),
                context.getString(R.string.label_writer_fake),
                context.getString(R.string.label_tag_fake)
            )
        )
        resultList.add(
            ArticleEntity(
                context.getString(R.string.label_fake_title_post),
                R.drawable.background_image,
                context.getString(R.string.label_time_fake),
                context.getString(R.string.label_writer_fake),
                context.getString(R.string.label_tag_fake)
            )
        )
        return resultList.toList()
    }
}