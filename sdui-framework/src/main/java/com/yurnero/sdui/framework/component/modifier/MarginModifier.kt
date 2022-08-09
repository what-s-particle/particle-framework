package com.yurnero.sdui.framework.component.modifier

import kotlinx.serialization.Serializable

@Serializable
data class MarginModifier(
    val start: Int = 0,
    val top: Int = 0,
    val end: Int = 0,
    val bottom: Int = 0
)
