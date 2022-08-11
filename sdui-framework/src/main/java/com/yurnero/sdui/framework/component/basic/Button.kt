package com.yurnero.sdui.framework.component.basic

import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Button(
    val content: Component? = null,
    val enabled: Boolean? = null
)
