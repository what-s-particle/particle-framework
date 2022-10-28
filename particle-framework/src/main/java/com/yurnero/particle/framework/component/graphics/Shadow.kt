package com.yurnero.particle.framework.component.graphics

import com.yurnero.particle.framework.component.geometry.Offset
import kotlinx.serialization.Serializable

@Serializable
data class Shadow(
    var offset: Offset,
    var colorValue: Int? = null,
    var colorToken: ColorToken? = null,
    var radius: Double
)
