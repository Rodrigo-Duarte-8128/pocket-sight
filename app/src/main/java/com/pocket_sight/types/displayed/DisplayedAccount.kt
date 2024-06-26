package com.pocket_sight.types.displayed

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "displayed_account_table")
data class DisplayedAccount (
    @PrimaryKey
    var displayedAccountId: Int, // always 1 when the table isn't empty

    @ColumnInfo(name = "displayed_account_number")
    var displayedAccountNumber: Int
)
