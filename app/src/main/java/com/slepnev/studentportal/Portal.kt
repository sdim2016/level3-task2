package com.slepnev.studentportal

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Portal (
    var title: String,
    var url: String
) : Parcelable