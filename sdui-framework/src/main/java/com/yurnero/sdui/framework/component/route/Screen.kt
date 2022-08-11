package com.yurnero.sdui.framework.component.route

import com.yurnero.sdui.framework.component.basic.Component
import kotlinx.serialization.Serializable


/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Screen(
    val id: String,
    val content: Component? = null,
    val active: Boolean = false
)
