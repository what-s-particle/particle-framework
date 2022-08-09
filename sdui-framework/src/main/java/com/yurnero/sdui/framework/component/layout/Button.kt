package com.yurnero.sdui.framework.component.layout

import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Button(var content: Component? = null, var enabled: Boolean? = null)
