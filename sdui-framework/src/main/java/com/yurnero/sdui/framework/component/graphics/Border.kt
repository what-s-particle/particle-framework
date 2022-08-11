package com.yurnero.sdui.framework.component.graphics

import kotlinx.serialization.Serializable

@Serializable
data class Border(
    val width: Double,
    val colorToken: ColorToken?,
    val colorValue: Int?
)
