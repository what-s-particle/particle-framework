package com.yurnero.sdui.framework.component.modifier

import kotlinx.serialization.Serializable

@Serializable
data class Modifier(
    var backgroundColor: Color? = null, var visibility: Boolean? = null, var margin: MarginModifier? = null
)
