package com.yurnero.sdui.framework.actions

import com.yurnero.sdui.framework.actions.effect.ChangeModifierEffect
import com.yurnero.sdui.framework.actions.effect.RouteEffect
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
