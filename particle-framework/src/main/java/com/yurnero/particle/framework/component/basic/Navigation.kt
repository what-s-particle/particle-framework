package com.yurnero.particle.framework.component.basic

import kotlinx.serialization.Serializable

@Serializable
data class Navigation(
    val items: MutableList<Component> = mutableListOf(),
    val selectedId: String
)
