package com.yurnero.sdui.framework.actions

import kotlinx.serialization.Serializable

@Serializable
data class Target(
    val screenId: String,
    val componentId: String
)
