package com.yurnero.particle.framework.actions

import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Action(
    var trigger: Trigger = Trigger.DEFAULT,
    var effects: MutableList<Effect> = mutableListOf()
)
