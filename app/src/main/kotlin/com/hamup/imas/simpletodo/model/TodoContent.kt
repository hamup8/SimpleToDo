package com.hamup.imas.simpletodo.model

import android.support.annotation.Nullable
import com.github.gfx.android.orma.annotation.Column
import com.github.gfx.android.orma.annotation.PrimaryKey
import com.github.gfx.android.orma.annotation.Setter
import com.github.gfx.android.orma.annotation.Table
import java.lang.System.*
import java.sql.Timestamp
import java.util.*

/**
 * Created by hamu on 2017/03/08.
 */

@Table
public class TodoContent{
    @PrimaryKey(autoincrement = true) val id: Long

    @Column var content: String

    @Nullable
    @Column var freetext: String?

    @Column val start_date: Timestamp

    @Nullable
    @Column var end_date: Date?

    @Column var delete_flg: Int

    constructor(@Setter("id") id: Long,
                @Setter("content") content: String,
                @Setter("freetext") freetext: String,
                @Setter("start_date") start_date: Timestamp,
                @Setter("end_date") end_date: Date,
                @Setter("delete_flg") delete_flg: Int){
        this.id = id
        this.content = content
        this.freetext = freetext
        this.start_date = start_date
        this.end_date = end_date
        this.delete_flg = delete_flg
    }

    constructor(id : Long,content: String,delete_flg: Int){
        this.id = id
        this.content = content
        this.freetext = null
        this.start_date = Timestamp(System.currentTimeMillis())
        this.end_date = null
        this.delete_flg = delete_flg

    }
}