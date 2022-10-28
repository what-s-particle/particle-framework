package com.yurnero.particle.framework.component.basic

import com.yurnero.particle.framework.Particle
import kotlinx.serialization.Serializable

@Serializable
data class Navigation(
    val items: MutableList<Particle> = mutableListOf(),
    val selectedId: String
)
