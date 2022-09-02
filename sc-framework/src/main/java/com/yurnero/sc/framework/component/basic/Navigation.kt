package com.yurnero.sc.framework.component.basic

import com.yurnero.sc.framework.component.basic.Component
import kotlinx.serialization.Serializable

@Serializable
data class Navigation(
    val items: MutableList<Component> = mutableListOf(),
    val selectedId: String
)
