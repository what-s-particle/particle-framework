package com.yurnero.sdui.framework.component.route

import kotlinx.serialization.Serializable


/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class StateTree(
    var screens: MutableList<Screen> = mutableListOf()
)
