package com.yurnero.particle.framework.component.geometry

import com.yurnero.particle.framework.component.graphics.ColorToken
import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Circle(
    var colorValue: Int? = null,
    var colorToken: ColorToken? = null,
    var radius: Float,
    var center: Offset? = null,
)
