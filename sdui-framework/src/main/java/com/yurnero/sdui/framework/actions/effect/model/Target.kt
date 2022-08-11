package com.yurnero.sdui.framework.actions.effect.model

import kotlinx.serialization.Serializable

@Serializable
data class Target(
    val screenId: String,
    val componentId: String
)
