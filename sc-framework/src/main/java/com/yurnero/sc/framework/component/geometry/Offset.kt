package com.yurnero.sc.framework.component.geometry

import kotlinx.serialization.Serializable

@Serializable
data class Offset(
    val xOffset: Float,
    val yOffset: Float
)