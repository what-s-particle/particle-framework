package com.yurnero.particle.framework.component.graphics

import kotlinx.serialization.Serializable

@Serializable
data class Border(
    var width: Double,
    var colorToken: ColorToken? = null,
    var colorValue: Int?
)
