package com.yurnero.sc.framework.component.geometry

import com.yurnero.sc.framework.component.graphics.ColorToken
import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Path(
    var colorValue: Int? = null,
    var colorToken: ColorToken? = null,
    var start: Offset,
    var relativeLineTo: MutableList<Offset> = mutableListOf()
)
