package com.yurnero.sdui.framework.component.geometry

import com.yurnero.sdui.framework.component.graphics.ColorToken
import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Path(
    val colorValue: Int?,
    val colorToken: ColorToken?,
    val start: Offset,
    val relativeLineTo: MutableList<Offset> = mutableListOf()
)
