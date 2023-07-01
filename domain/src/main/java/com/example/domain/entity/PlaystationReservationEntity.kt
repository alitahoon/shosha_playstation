package com.example.domain.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.Date


@Entity(tableName = "PlaystationReservationEntity",
    foreignKeys = [
        ForeignKey(
            entity = DeviceEntity::class,
            parentColumns = ["id"],
            childColumns = ["deviceId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
class PlaystationReservationEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    @ColumnInfo(name = "deviceId") val deviceId: Int,
    @ColumnInfo(name = "currantDate") val CurrantDate: Date,
    @ColumnInfo(name = "startTime") val startTime: Date,
    @ColumnInfo(name = "reservationType") val reservation: String,
)