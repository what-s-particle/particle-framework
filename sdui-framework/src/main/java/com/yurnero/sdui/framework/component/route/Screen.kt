package com.yurnero.sdui.framework.component.route

import com.yurnero.sdui.framework.component.layout.Component
import kotlinx.serialization.Serializable


/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Screen(
    val id: String,
    var content: Component? = null,
    var active: Boolean = false
)
