package com.yurnero.particle.framework.actions.effect.model

import kotlinx.serialization.Serializable

@Serializable
data class Target(
    var screenId: String,
    var componentId: String
)
