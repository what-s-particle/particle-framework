package com.yurnero.sc.framework.component.geometry

import com.yurnero.sc.framework.component.graphics.ColorToken
import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Circle(
    val colorValue: Int? = null,
    val colorToken: ColorToken? = null,
    val radius: Float,
    val center: Offset? = null,
)
