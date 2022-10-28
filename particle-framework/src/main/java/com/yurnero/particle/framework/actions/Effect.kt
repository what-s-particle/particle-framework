package com.yurnero.particle.framework.actions

import com.yurnero.particle.framework.actions.effect.ChangeModifierEffect
import com.yurnero.particle.framework.actions.effect.RouteEffect
import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Effect(
    var changeModifierEffect: ChangeModifierEffect? = null,
    var routeEffect: RouteEffect? = null
)
