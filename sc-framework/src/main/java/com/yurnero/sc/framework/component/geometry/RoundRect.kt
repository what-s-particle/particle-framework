package com.yurnero.sc.framework.component.geometry

import com.yurnero.sc.framework.component.graphics.ColorToken
import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class RoundRect(
    val colorValue: Int?,
    val colorToken: ColorToken?,
    val width: Float,
    val height: Float,
    val radius: Offset
)
