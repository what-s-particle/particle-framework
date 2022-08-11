package com.yurnero.sc.framework.component.geometry

import com.yurnero.sc.framework.component.graphics.ColorToken
import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Line(
    val colorValue: Int?,
    val colorToken: ColorToken?,
    val start: Offset,
    val end: Offset,
    val width: Float
)
