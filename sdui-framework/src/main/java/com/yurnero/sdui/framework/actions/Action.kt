package com.yurnero.sdui.framework.actions

import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Action(
    val trigger: Trigger = Trigger.DEFAULT,
    val effects: MutableList<Effect> = mutableListOf()
)
