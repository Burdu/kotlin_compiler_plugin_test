package com.example.bazel_kotlin_compiler_plugin

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class ParcelableObject(val name: String) : Parcelable