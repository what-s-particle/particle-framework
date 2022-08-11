package com.yurnero.sc.framework.actions

import com.yurnero.sc.framework.actions.effect.ChangeModifierEffect
import com.yurnero.sc.framework.actions.effect.RouteEffect
import kotlinx.serialization.Serializable

/**
 * @author yunlong.wen
 * @date 2022.03.11
 */
@Serializable
data class Effect(
    val changeModifierEffect: ChangeModifierEffect? = null,
    val routeEffect: RouteEffect? = null
)
