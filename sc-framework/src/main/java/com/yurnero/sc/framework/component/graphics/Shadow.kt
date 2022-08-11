package com.yurnero.sc.framework.component.graphics

import com.yurnero.sc.framework.component.geometry.Offset
import kotlinx.serialization.Serializable

@Serializable
data class Shadow(
    val offset: Offset,
    val colorValue: Int? = null,
    val colorToken: ColorToken? = null,
    val radius: Double
)
