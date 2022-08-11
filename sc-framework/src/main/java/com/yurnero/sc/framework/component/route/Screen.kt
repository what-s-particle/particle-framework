package com.yurnero.sc.framework.component.route

import com.yurnero.sc.framework.component.basic.Component
import kotlinx.serialization.Serializable


/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Screen(
    var id: String,
    var content: Component? = null,
    var active: Boolean = false
)
